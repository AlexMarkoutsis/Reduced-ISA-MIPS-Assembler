/*********************************************************************
 * Authors: Alex Markoutsis, Nathan Stout
 * Created: February 5, 2025
 *
 * This program simulates the process of converting MIPS assembly
 * instructions into their corresponding machine code. The program
 * reads MIPS instructions in string format, identifies their type
 * (R-type, I-type, J-type, or syscall), and generates a 32-bit binary
 * number that represents the instruction in machine code. The program
 * supports a reduced instruction set, but was built with intent to scale.
 *
 * The 'assembleMIPS' method is central to converting the instructions,
 * and helper methods are used to handle different instruction types.
 * The machine code is printed as a hexadecimal value.
 *
 * Coding assignment for MIPS assembly simulation.
 **********************************************************************/

import java.util.Arrays;
import java.util.List;

public class MIPSAssembler {

// ################ DATA ################################################################

    // Registers and their addresses
    static String[] registers = {
            "$zero", "$at", "$v0", "$v1", "$a0", "$a1", "$a2", "$a3",
              "$t0", "$t1", "$t2", "$t3", "$t4", "$t5", "$t6", "$t7",
              "$s0", "$s1", "$s2", "$s3", "$s4", "$s5", "$s6", "$s7",
              "$t8", "$t9", "$k0", "$k1", "$gp", "$sp", "$fp", "$ra"
    };

    // Instructions based on their types
    static String[] RTypes = {"add", "and", "or", "slt", "sub"};
    static String[] ITypes = {"addiu", "andi", "beq", "bne", "lui", "lw", "ori", "sw"};

    // Arrays for finding value based on instruction
    List<String> opcodeMap = Arrays.asList(new String[64]);
    List<String> functMap = Arrays.asList(new String[64]);

    // Initializes values in arrays (Constructor)
    // Used in "assemble" methods
    public MIPSAssembler() {
        // I-Type instructions
        opcodeMap.set(4, "beq");
        opcodeMap.set(5, "bne");
        opcodeMap.set(9, "addiu");
        opcodeMap.set(12, "andi");
        opcodeMap.set(13, "ori");
        opcodeMap.set(15, "lui");
        opcodeMap.set(35, "lw");
        opcodeMap.set(43, "sw");

        // J-Type instructions
        opcodeMap.set(2, "j");

        // R-Type instructions
        functMap.set(12, "syscall");
        functMap.set(32, "add");
        functMap.set(34, "sub");
        functMap.set(36, "and");
        functMap.set(37, "or");
        functMap.set(42, "slt");
    }

// ################ MAIN ################################################################

    public static void main(String[] args) {
        // Invalid usage check
        if (args.length != 1) {
            System.out.println("Usage: java MIPSAssembler <MIPS instructions>");
            System.exit(1);
        }

        // Cut off comments
        String instruction = args[0];
        int commentIndex = instruction.indexOf("#");
        if (commentIndex != -1) {
            instruction = instruction.substring(0, commentIndex);
        }
        // Remove whitespace from front and back
        instruction = instruction.trim();

        int machineCode = assembleMIPS(instruction);
        System.out.printf("%08x%n", machineCode);  // Convert to hexadecimal
    }

// ################ HELPER METHODS ######################################################


    /* assembleMIPS:
     * Method for assembling a MIPS instruction into its corresponding machine code.
     * Takes a MIPS instruction, determines its type, and calls the appropriate
     * assembly method to convert it into its binary representation
     *
     * Input:
     * - instruction: String representing iMIPS instruction to be assembled.
     *     - The instruction may contain comments, which are ignored
     *
     * Output:
     * - A 32-bit binary number representing the MIPS instruction
     */
    private static int assembleMIPS(String instruction) {
        // regex:
        // "?:"     prevents creation  of empty elements
        // ",\\s"   matches a comma or whitespace
        // "+"      matches one or more occurrences of either
        String regex = "(?:,|\\s)+";
        String[] parts = instruction.split(regex);

        // Remove escape sequences
        for (int i = 0; i < parts.length; i++) {
            int tickIndex = parts[i].indexOf("`");
            int slashIndex = parts[i].indexOf("\\");

            if ((tickIndex != -1 || slashIndex != -1) && parts[i].length() > 1) {
                parts[i] = parts[i].substring(1, parts[i].length() - 1);
            }
        }

        String opcode = parts[0].toLowerCase();

        // Determine instruction type and go to "assemble" method
        String type = "default";
        if (Arrays.asList(RTypes).contains(opcode))    { type = "rType"; }
        if (Arrays.asList(ITypes).contains(opcode))    { type = "iType"; }
        if (opcode.equals("syscall"))   { type = "syscall"; }
        if (opcode.equals("j"))         { type = "j"; }

        return switch (type) {
            case "rType" ->     assembleRType(parts);
            case "iType" ->     assembleIType(parts);
            case "syscall" ->   assembleSyscall(parts);
            case "j" ->         assembleJType(parts);
            default ->          throw new IllegalArgumentException("Unsupported instruction: " + opcode);
        };
    }


    /* assembleRType:
     * Method for assembling an r-type instruction based on the
     * given parts of the MIPS instruction.
     *
     * Input:
     * - parts: Array of strings which make up the MIPS instruction
     *
     * Output:
     * - A 32-bit binary number representing the MIPS instruction
     */
    private static int assembleRType(String[] parts) {
        MIPSAssembler assembler = new MIPSAssembler();

        int rs = Arrays.asList(registers).indexOf(parts[2]);
        int rt = Arrays.asList(registers).indexOf(parts[3]);
        int rd = Arrays.asList(registers).indexOf(parts[1]);
        int funct = assembler.functMap.indexOf(parts[0]);

        return (rs << 21) | (rt << 16) | (rd << 11) | funct;
    }


    /* assembleIType:
     * Method for assembling an i-type instruction based on the
     * given parts of the MIPS instruction.
     *
     * Input:
     * - parts: Array of strings which make up the MIPS instruction
     *
     * Output:
     * - A 32-bit binary number representing the MIPS instruction
     */
    private static int assembleIType(String[] parts) {
        MIPSAssembler assembler = new MIPSAssembler();

        int opcode = assembler.opcodeMap.indexOf(parts[0]);
        int rt = Arrays.asList(registers).indexOf(parts[1]);
        int rs;
        int imm;

        switch (parts[0]) {
            // beq and bne instructions
            case "beq", "bne" -> {
                rs = Arrays.asList(registers).indexOf(parts[1]);
                rt = Arrays.asList(registers).indexOf(parts[2]);
                imm = parseImmediate(parts[3]);
            }

            // lui instruction
            case "lui" -> {
                rs = 0;
                imm = parseImmediate(parts[2]);
            }

            // lw and sw instructions
            case "lw", "sw" -> {
                // Split base and offset
                String[] offsetAndBase = parts[2].split("[()]+");
                    // offsetAndBase[0] = offset
                    // offsetAndBase[1] = base

                if (offsetAndBase[0].isEmpty()) {
                    // No offset, e.g. _($t5)
                    imm = 0;
                } else {
                    // Standard case, e.g. 124($zero)
                    imm = parseImmediate(offsetAndBase[0]); // Immediate offset
                }
                rs = Arrays.asList(registers).indexOf(offsetAndBase[1]);
            }

            // addiu, andi, and ori instructions
            // Handle normally
            default -> {
                rs = Arrays.asList(registers).indexOf(parts[2]);
                imm = parseImmediate(parts[3]);
            }
        }

        return (opcode << 26) | (rs << 21) | (rt << 16) | (imm & 0xFFFF);
    }


    /* assembleJType:
     * Method for assembling a j-type instruction based on the
     * given parts of the MIPS instruction.
     *
     * Input:
     * - parts: Array of strings which make up the MIPS instruction
     *
     * Output:
     * - A 32-bit binary number representing the MIPS instruction
     */
    private static int assembleJType(String[] parts) {
        MIPSAssembler assembler = new MIPSAssembler();

        int opcode = assembler.opcodeMap.indexOf(parts[0]);
        int target = parseImmediate(parts[1]);

        return (opcode << 26) | (target & 0x03FFFFFF);
    }


    /* assembleSyscall:
     * Method for assembling a syscall instruction based on the
     * given parts of the MIPS instruction.
     *
     * Input:
     * - parts: Array of strings which make up the MIPS instruction
     *
     * Output:
     * - An integer representing the funct value of a syscall instruction
     */
    private static int assembleSyscall(String[] parts) {
        MIPSAssembler assembler = new MIPSAssembler();

        return assembler.functMap.indexOf(parts[0]);
    }


    /* parseImmediate:
     * Method for taking string representations of
     * numbers in decimal or hexadecimal and converting
     * them to their binary representation.
     *
     * Input:
     * - imm: Number represented as a string
     *
     * Output:
     * - 16-bit binary representation of imm
     */
    private static int parseImmediate(String imm) {
        try {
            if (imm.startsWith("0x") || imm.startsWith("0X")) {
                return Integer.parseInt(imm.substring(2), 16); // Handle hexadecimal values
            } else {
                return Integer.parseInt(imm); // Handle decimal values
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid immediate value: " + imm);
        }
    }
}
