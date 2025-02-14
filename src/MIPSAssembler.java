// Link to google sheet with information:
// https://docs.google.com/spreadsheets/d/18YZ0jNXLmXgINMvws57R3akAFXtTHVRhdQyYqoGsuJ0/edit?usp=sharing

import java.util.Arrays;
import java.util.List;

public class MIPSAssembler {
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


    private static int assembleMIPS(String instruction) {
        // regex:
        // "?:"     prevents creation  of empty elements
        // ",\\s"   matches a comma or whitespace
        // "+"      matches one or more occurrences of wither
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


    // add, and, or, slt, sub
    // opcode is always 000000
    // rs, rt, and rd are register addresses
    // shamt is always 00000
    // funct defines what operation is done
    // use bit shifting to shift parts into their correct position
    private static int assembleRType(String[] parts) {
        MIPSAssembler assembler = new MIPSAssembler();

        int rs = Arrays.asList(registers).indexOf(parts[2]);
        int rt = Arrays.asList(registers).indexOf(parts[3]);
        int rd = Arrays.asList(registers).indexOf(parts[1]);
        int funct = assembler.functMap.indexOf(parts[0]);

        return (rs << 21) | (rt << 16) | (rd << 11) | funct;
    }


    // addiu, andi, beq, bne, lui, lw, ori, sw
    // opcode defines what operation is done
    // rs is either a register address, or 00000 for lui
    // rt is a register address
    // imm is a 16-bit immediate
    private static int assembleIType(String[] RENAME) {
        int opcode = 0;
        int rs = 0;
        int rt = 0;
        int imm = 0;
        // return opcode | rs | rt | imm;
        return 2;
    }


    // j
    // opcode is always 000010
    // target is 26-bit binary representing the address to jump to
    private static int assembleJType(String[] parts) {
        int opcode = 0;
        int target = 0;
        // return opcode | target;
        return 3;
    }


    // syscall
    // Split syscall into its own function because it is "special"
    // Unsure how this one works right now
    // opcode is always 000000
    // code is 20-bit binary (unsure what it represents)
    // funct is always 001100
    private static int assembleSyscall(String[] parts) {
        int opcode = 0;
        int code = 0;
        int  funct = 0;
        // return opcode | code | funct;
        return 4;
    }


    // Method for taking decimal values and converting them
    // to their binary representation.
    // Input:
    // - imm: Decimal number represented as a string
    // Output:
    // - 16-bit binary representation of imm
    private static int parseImmediate(String imm) {
        return 0;  // stub code
    }
}
