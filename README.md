# Reduced ISA MIPS Assembler

## Overview
A full assembler for a custom reduced MIPS instruction set, developed as part of a university systems programming assignment. This project implements a single-line assembler capable of parsing a subset of MIPS instructions and producing correct 32-bit machine code in lowercase hexadecimal format.

This repository showcases the complete implementation, including instruction parsing, register handling, immediate value processing, and correct encoding for R-type, I-type, and J-type instructions.

---

## Features
- Full assembler for a reduced MIPS ISA  
- Supports 15 core instructions (R-type, I-type, J-type, and `syscall`)  
- Handles:
  - Register parsing  
  - Decimal and hexadecimal immediates  
  - Negative immediates with correct two’s complement conversion  
  - Base-offset addressing for `lw` and `sw`  
  - Flexible whitespace and comments  
- Produces 8-digit lowercase hexadecimal machine code  
- Clean, single-line command-line interface  
- Fully implemented in Java  
- No external dependencies  

---

## Supported Instruction Set

| Type   | Instructions |
|-------|--------------|
| R-Type | `add`, `sub`, `and`, `or`, `slt`, `syscall` |
| I-Type | `beq`, `bne`, `addiu`, `andi`, `ori`, `lui`, `lw`, `sw` |
| J-Type | `j` |

---

## How to Run
The assembler is packaged as a JAR file and accepts exactly one argument: a single line of MIPS assembly wrapped in quotes. It outputs the corresponding 8-digit lowercase hexadecimal machine code followed by a newline.

### Basic Usage
```bash
java -jar PROG1_Milestone1.jar "add $t5, $s7, $5"
```

Output:
```text
02e56820
```

---

## Escaping `$` in Different Terminals
Because `$` is treated as a special character, it must be escaped depending on your operating system.

### Windows (use backtick `)
```bash
java -jar PROG1_Milestone1.jar "add `$t5, `$s7, `$5"
```

### Linux / macOS (use backslash \)
```bash
java -jar PROG1_Milestone1.jar "add \$t5, \$s7, \$5"
```

---

## Input Requirements
The assembler:
- Accepts exactly one line of MIPS assembly as input  
- Allows arbitrary whitespace before the mnemonic  
- Accepts valid arguments with flexible spacing  
- Requires commas between arguments  
- Supports decimal and `0x`-prefixed hexadecimal immediates  
- Correctly handles negative immediates using two’s complement  
- Supports base-offset addressing (e.g., `42($s2)`)  
- Ignores trailing whitespace and comments (`# comment`)  
- Outputs only the machine code (no debug output)  

### Special Cases
- `lw`, `sw`, and `lui` deviate from standard I-format behavior  
- `addiu` receives only positive immediates  
- All input is guaranteed to be syntactically valid  
- No pseudo-instructions or label resolution required  

---

## Project Structure
```text
Reduced-ISA-MIPS-Assembler/
├── src/                # Java source code for the assembler
├── Tests/              # Test assembly programs and validation cases
└── EvenOrOdd.asm       # Example input program
```

---

## Technologies Used

| Technology | Usage |
|-----------|------|
| Java | Core implementation (99.8% of project) |
| Java I/O | Input handling |
| Java parsing utilities | Instruction tokenization and processing |

No external libraries or dependencies are used.
