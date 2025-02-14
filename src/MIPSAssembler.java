// Link to google sheet with information:
// https://docs.google.com/spreadsheets/d/18YZ0jNXLmXgINMvws57R3akAFXtTHVRhdQyYqoGsuJ0/edit?usp=sharing

public class MIPSAssembler {
    public static void main(String[] args) {
        // Invalid usage check
        if (args.length != 1) {
            System.out.println("Usage: java MIPSAssembler <MIPS instructions>");
            System.exit(1);
        }

        // Cut off comments
        String instruction = args[0];
        int commentIndex = instruction.indexOf("#");
        if (commentIndex != -1) { instruction = instruction.substring(0, commentIndex); }
        // Remove whitespace from front and back
        instruction = instruction.trim();

        // DEBUGGING
        // System.out.println(instruction);

        // Call main helper function, and store output in an int
        int machineCode = assembleMIPS(instruction);
        System.out.printf("%08x%n", machineCode);  // Convert to hexadecimal


        // Also need a way to attach registers to their binary
        // ^^Same with opcode/funct... maybe use a Map?
    }


    private static int assembleMIPS(String instruction) {
        String[] RTypes = {"add", "and", "or", "slt", "sub"};
        String[] JTypes = {"j", "syscall"};
        String[] ITypes = {"addiu", "andi", "beq", "bne", "lui", "lw", "ori", "sw"};

        // regex:
        // "?:" prevents creation  of empty elements
        // ",\\s" matches a comma or whitespace
        // "+" matches one or more occurrences of wither
        String regex = "(?:,|\\s)+";
        String[] parts = instruction.split(regex);

        // Remove escape sequences
        for (int i = 0; i < parts.length; i++) {
            int tickIndex = parts[i].indexOf("`");
            int slashIndex = parts[i].indexOf("\\");

            if ((tickIndex != -1 || slashIndex != -1) && parts[i].length() > 1) {
                parts[i] = parts[i].substring(1, parts[i].length() - 1);
            }

            // DEBUGGING
            // System.out.printf("parts[%d] = ", i);
            // System.out.println(parts[i]);
        }



        return 0;  // stub code
    }


    // add, and, or, slt, sub
    // opcode is always 000000
    // rs, rt, and rd are register addresses
    // shamt is always 00000
    // funct defines what operation is done
    // use bit shifting to shift parts into their correct position
    private static int assembleRType(String[] RENAME) {
        int opcode = 0;
        int rs = 0;
        int rt = 0;
        int rd = 0;
        int shamt = 0;
        int funct = 0;
        return opcode | rs | rt | rd | shamt | funct;
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
        return opcode | rs | rt | imm;
    }


    // j
    // opcode is always 000010
    // target is 26-bit binary representing the address to jump to
    private static int assembleJType(String[] parts) {
        int opcode = 0;
        int target = 0;
        return opcode | target;
    }


    // syscall
    // Split syscall into its own function because it is "special"
    // Unsure how this one works right now
    // opcode is always 000000
    // code is 20-bit binary (unsure what it represents)
    // funct is always 001100
    private static int assembleSyscall() {
        int opcode = 0;
        int code = 0;
        int  funct = 0;
        return opcode | code | funct;
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
