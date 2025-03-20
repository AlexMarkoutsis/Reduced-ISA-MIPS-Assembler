/*********************************************************************
 * Authors: Alex Markoutsis, Nathan Stout
 * Created: February 5, 2025

 * This program simulates the process of converting MIPS assembly
 * instructions into their corresponding machine code. The program
 * reads MIPS instructions in string format, identifies their type
 * (R-type, I-type, J-type, or syscall), and generates a 32-bit binary
 * number that represents the instruction in machine code. The program
 * supports a reduced instruction set, but was built with intent to scale.

 * The 'assembleMIPS' method is central to converting the instructions,
 * and helper methods are used to handle different instruction types.
 * The machine code is printed as a hexadecimal value.

 * Coding assignment for MIPS assembly simulation.
 **********************************************************************/

import java.util.*;
import java.io.*;

public class MIPSAssembler {

// ################ SETUP ################################################################

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

    private static final HashMap<String, Integer> labelMap = new HashMap<>();
    private static final List<String> expandedInstructions = new ArrayList<>();
    private static HashMap<String, Integer> dataLabelMap = new HashMap<>();


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
            System.out.println("Usage: java MIPSAssembler <input.asm>");
            System.exit(1);
        }

        String inputFileName = args[0];
        int extensionIndex = inputFileName.indexOf(".");

        // Check that the input has a file extension
        if (extensionIndex == -1) {
            System.out.println("Invalid file name: " + inputFileName);
            System.exit(1);
        }

        // Check if file is .asm
        String extension = inputFileName.substring(extensionIndex);
        if (!extension.equals(".asm")) {
            System.out.println("Invalid extension: " + extension);
            System.exit(1);
        }

        // Get name of output files from the <input>.asm file
        String outputFileName = inputFileName.substring(0, extensionIndex);

        String textFileName = outputFileName + ".text";
        String dataFileName = outputFileName + ".data";

        try {
            separateSections(inputFileName, textFileName, dataFileName);
            processDataSection(dataFileName);
            replacePseudoInstructions(textFileName);
            processTextSection(textFileName);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
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
    public static int assembleMIPS(String instruction) {
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

                // Find first occurrence of the given instruction and store the PC address
                // TODO: Figure out issue with duplicate branch instruction lines giving same output
                int currentPC = getCurrentInstructionPC(parts);

                // If the third argument is a label (not a number)
                if (labelMap.containsKey(parts[3])) {
                    // Calculate the branch offset (in words)
                    imm = (labelMap.get(parts[3]) - (currentPC + 4)) / 4;
                } else {
                    // If it's an immediate value
                    imm = parseImmediate(parts[3]);
                }

                for (String instruction : expandedInstructions) {
                    String regex = "(?:,|\\s)+";
                    String[] temps = instruction.split(regex);
                    if (Arrays.equals(temps, parts)) {
                        break;
                    }

                    currentPC += 4;
                }

                // Calculate the branch offset (in words)
                imm = (labelMap.get(parts[3]) - (currentPC + 4)) / 4;
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

    // Helper method to get current instruction PC
    private static int getCurrentInstructionPC(String[] parts) {
        // Start with the base text section address
        int pc = 0x00400000;

        // Find position in expanded instructions
        for (String instruction : expandedInstructions) {
            // Check if this is the instruction we're looking for
            if (instructionMatches(instruction, parts)) {
                return pc;
            }
            pc += 4;
        }

        return 0x00400000; // Default in case of error
    }

    // Helper to compare instructions
    private static boolean instructionMatches(String instruction, String[] parts) {
        String[] instructionParts = instruction.split("(?:,|\\s)+");
        if (instructionParts.length != parts.length) return false;

        // Compare only the opcode and registers/labels, ignoring whitespace differences
        for (int i = 0; i < parts.length; i++) {
            if (!instructionParts[i].equals(parts[i])) {
                return false;
            }
        }
        return true;
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

        if (labelMap.containsKey(parts[1])) {
            target = (labelMap.get(parts[1]) >> 2) & 0x03FFFFFF;
        } else {
            throw new IllegalArgumentException("Label not found: " + parts[1]);
        }

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
        // Check if it's a label
        if (labelMap.containsKey(imm)) {
            return labelMap.get(imm);
        }

        // Check if it's a data label
        if (dataLabelMap.containsKey(imm)) {
            return dataLabelMap.get(imm);
        }

        try {
            if (imm.startsWith("0x") || imm.startsWith("0X")) {
                return Integer.parseInt(imm.substring(2), 16); // Handle hexadecimal values
            } else {
                return Integer.parseInt(imm); // Handle decimal values
            }
        } catch (NumberFormatException e) {
            // Check if the immediate is a data label
            if (dataLabelMap.containsKey(imm)) {
                return dataLabelMap.get(imm);
            }
            // If this is an offset for the "la" pseudo-instruction
            // Calculate offset from the data section base address (0x10010000)
            if (imm.matches("\\d+")) {
                try {
                    int offset = Integer.parseInt(imm);
                    return offset; // Return the offset for "ori" instruction
                } catch (NumberFormatException ex) {
                    // Not a valid offset
                }
            }

            throw new IllegalArgumentException("Invalid immediate value: " + imm);
        }
    }


    /* separateSections:
     * Method for taking string some input *.asm file and
     * splitting into *.text and *.data files of the same name
     *
     * Input:
     * - inputFile: Name of *.asm file to be split
     * - textFile: Name of *.text file to be generated
     * - dataFile: Name of *.data file to be generated
     *
     * Output:
     * - *.text and *.data files are created in same directory, with the same prefix
     */
    private static void separateSections(String inputFile, String textFile, String dataFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter textWriter = new BufferedWriter(new FileWriter(textFile));
        BufferedWriter dataWriter = new BufferedWriter(new FileWriter(dataFile));

        String line;

        // Flags to check which section the reader is currently in
        boolean isTextSection = false;
        boolean isDataSection = false;

        while ((line = reader.readLine()) != null) {
            line = line.trim();  // Remove leading/trailing whitespace
            if (line.isEmpty()) continue;  // Skip empty lines

            if (line.startsWith(".text")) {
                // Set text flag to true and data flag to false
                isTextSection = true;
                isDataSection = false;
                continue;
            } else if (line.startsWith(".data")) {
                // Set data flag to true and text flag to false
                isTextSection = false;
                isDataSection = true;
                continue;
            }

            // Write to respective files, based on the flags
            if (isTextSection) {
                textWriter.write(line);
                textWriter.newLine();
            } else if (isDataSection) {
                dataWriter.write(line);
                dataWriter.newLine();
            }
        }

        reader.close();
        textWriter.close();
        dataWriter.close();
    }


    /* replacePseudoInstructions:
     * Method for identifying and replacing MIPS pseudo-instructions
     * with their corresponding actual instructions, and then
     * writing the expanded instructions back to the same file.
     *
     * Input:
     * - textFile: The name of the .text file
     *
     * Output:
     * - The modified file with pseudo-instructions replaced with
     *   their equivalent real instructions
     */
    private static void replacePseudoInstructions(String textFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(textFile));

        String line;
        int address = 0x00400000;  // Beginning of the .text file

        while ((line = reader.readLine()) != null) {
            line = line.trim();  // Remove leading/trailing whitespace
            if (line.isEmpty() || line.startsWith("#")) continue; // Ignore empty lines and comments

            // Label handling:
            if (line.trim().endsWith(":")) {
                String label = line.substring(0, line.length() - 1);  // Remove colon
                labelMap.put(label, address);  // Store label and its address for later use
                continue; // Skip writing labels to output
            }

            String[] parts = line.split("[, ]+"); // Split instruction
            String opcode = parts[0].toLowerCase();

            // Replace pseudo-instructions with the actual MIPS equivalents
            switch (opcode) {
                case "move":
                    expandedInstructions.add("add " + parts[1] + ", " + parts[2] + ", $zero");
                    break;

                case "li":
                    int imm = parseImmediate(parts[2]);
                    if (imm >= -32768 && imm <= 32767) {
                        // If immediate fits in 16 bits, use addiu
                        expandedInstructions.add("addiu " + parts[1] + ", $zero, " + imm);
                    } else {
                        // Otherwise, use lui + ori to load 32 bit immediate
                        expandedInstructions.add("lui $at, " + ((imm >> 16) & 0xFFFF));
                        address += 4;
                        expandedInstructions.add("ori " + parts[1] + ", $at, " + (imm & 0xFFFF));
                    }
                    break;

                case "blt":
                    expandedInstructions.add("slt $at, " + parts[1] + ", " + parts[2]);
                    address += 4;  // Keep track of address for label handling
                    expandedInstructions.add("bne $at, $zero, " + parts[3]);
                    break;

                case "la":
                    expandedInstructions.add("lui $at, 0x1001");
                    address += 4;  // Keep track of address for label handling
                    expandedInstructions.add("ori " + parts[1] + ", $at, " + parts[2]);
                    break;

                default:
                    expandedInstructions.add(line); // Keep non-pseudo instructions unchanged
                    break;
            }

            address += 4;  // Keep track of address for label handling
        }
        reader.close();

        // Write the expanded instructions back to the file
        BufferedWriter writer = new BufferedWriter(new FileWriter(textFile));
        for (String instruction : expandedInstructions) {
            writer.write(instruction);
            writer.newLine();
        }
        writer.close();
    }

    /**
     * Method for processing the .data section of a MIPS assembly file.
     * Reads each line, extracts labels and their associated data,
     * calculates memory addresses, and writes the data to the output file.
     *
     * Input:
     * - dataFile: Name of the .data file containing the data section declarations
     *
     * Output:
     * - Processed .data file with memory contents in hexadecimal format
     * - Populated dataLabelMap with addresses of data labels
     */
    private static void processDataSection(String dataFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(dataFile));

        // List to store processed data values
        List<String> processedData = new ArrayList<>();

        String line;
        int currentAddress = 0x10010000; // Starting address for data section

        while ((line = reader.readLine()) != null) {
            // Remove comments
            int commentIndex = line.indexOf("#");
            if (commentIndex != -1) {
                line = line.substring(0, commentIndex);
            }

            line = line.trim();
            if (line.isEmpty()) continue; // Skip empty lines

            // Parse label and data declaration
            int colonIndex = line.indexOf(":");
            if (colonIndex == -1) continue; // Skip lines without labels

            String label = line.substring(0, colonIndex).trim();
            String rest = line.substring(colonIndex + 1).trim();

            // Store label address in map
            dataLabelMap.put(label, currentAddress);

            // Split data type and value
            String[] parts = rest.split("\\s+", 2);
            if (parts.length < 2) continue; // Skip invalid data declarations

            String dataType = parts[0];
            String dataValue = parts[1].trim();

            // Process .asciiz data type
            if (dataType.equals(".asciiz")) {
                // Extract string between quotes
                int startQuote = dataValue.indexOf("\"");
                int endQuote = dataValue.lastIndexOf("\"");

                if (startQuote != -1 && endQuote != -1 && startQuote != endQuote) {
                    String str = dataValue.substring(startQuote + 1, endQuote);

                    // Calculate total bytes needed (string length + null terminator)
                    int totalBytes = str.length() + 1;

                    // Process string in little-endian format (4 bytes at a time)
                    for (int i = 0; i < totalBytes; i += 4) {
                        int value = 0;

                        // Pack up to 4 bytes in little-endian order
                        for (int j = 0; j < 4; j++) {
                            int bytePos = i + j;
                            int byteValue = 0;

                            if (bytePos < str.length()) {
                                byteValue = str.charAt(bytePos); // ASCII value of character
                            } else if (bytePos == str.length()) {
                                byteValue = 0; // Null terminator
                            }

                            // Place byte in appropriate position (little-endian)
                            value |= (byteValue << (8 * j));
                        }

                        // Add the packed value to processed data
                        processedData.add(String.format("%08x", value));
                        currentAddress += 4; // Increment address by word size
                    }
                }
            }
        }

        reader.close();

        // Write processed data to output file
        BufferedWriter writer = new BufferedWriter(new FileWriter(dataFile));

        for (String data : processedData) {
            writer.write(data);
            writer.newLine();
        }

        writer.close();
    }


    /* processTextSection:
     * Method for processing a given .text file containing MIPS
     * assembly instructions. Removes comments, converts each
     * instruction to its machine code representation, and then
     * replaces original file with the processed version
     *
     * Input:
     * - textFile: The name of the .text file containing the MIPS
     *   assembly instructions
     *
     * Output:
     * - The file is updates with each instruction converted to machine code
     */
    private static void processTextSection(String textFile) throws IOException {
        // First pass: collect all labels and their addresses
        calculateTextSectionAddresses(textFile);

        BufferedReader reader = new BufferedReader(new FileReader(textFile));

        // Create temporary file to store processed content
        File tempFile = new File(textFile + ".tmp");
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String line;

        while ((line = reader.readLine()) != null) {
            int commentIndex = line.indexOf("#");  // Remove comments
            if (commentIndex != -1) {
                line = line.substring(0, commentIndex);
            }

            line = line.trim();  // Remove trailing/leading whitespace
            if (line.isEmpty()) continue;  // Skip empty lines

            // Skip label-only lines during assembly
            if (line.endsWith(":")) continue;

            // Convert MIPS assembly to its machine code representation
            int machineCode = assembleMIPS(line);

            // Write the machine code to a hexadecimal string
            writer.write(String.format("%08x", machineCode));
            writer.newLine();
        }

        reader.close();
        writer.close();

        // Replace original file with processed file
        File originalFile = new File(textFile);
        if (!originalFile.delete()) {
            System.err.println("Error deleting original file: " + textFile);
        }
        if (!tempFile.renameTo(originalFile)) {
            System.err.println("Error renaming temp file to original file name.");
        }
    }

    // New helper method to calculate addresses for all labels in the text section
    private static void calculateTextSectionAddresses(String textFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(textFile));

        String line;
        int address = 0x00400000;  // Beginning of the .text file

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty() || line.startsWith("#")) continue;

            // Process label declarations (with or without instructions on same line)
            if (line.contains(":")) {
                int colonIndex = line.indexOf(":");
                String label = line.substring(0, colonIndex).trim();
                labelMap.put(label, address);

                // If there's an instruction after the label on the same line
                String rest = line.substring(colonIndex + 1).trim();
                if (!rest.isEmpty()) {
                    address += 4;  // Increment address for the instruction
                }
                // Otherwise, the label refers to the next instruction
            }
            else {
                // Regular instruction line
                address += 4;
            }
        }

        reader.close();
    }
}