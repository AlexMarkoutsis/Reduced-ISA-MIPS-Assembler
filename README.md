# Reduced ISA MIPS Assembler

A full assembler for a custom reduced MIPS instruction set, developed as part of a university systems programming assignment. The project was completed in two milestones:

- **Milestone 1:** Single-line assembler producing 32-bit machine code  
- **Milestone 2:** Full file assembler producing `.text` and `.data` output files  

This repository contains the complete implementation, including instruction parsing, pseudo-instruction expansion, label resolution, data section handling, and correct encoding for R-type, I-type, and J-type instructions.

---

## 🚀 Features

- Full assembler for a reduced MIPS ISA  
- Supports **15 core instructions** across R-type, I-type, and J-type formats  
- Supports **pseudo-instructions**:
  - `li`
  - `la`
  - `blt`
  - `move`
- Handles:
  - Register parsing  
  - Decimal and hexadecimal immediates (`0x` prefix)  
  - Negative immediates (two’s complement conversion)  
  - Base-offset addressing for `lw` and `sw`  
  - Label declarations and references  
  - Branch offsets and jump addresses  
  - `.data` section parsing and memory layout  
  - `.asciiz` data declarations with correct null-termination and little-endian packing  
- Produces:
  - **8-digit lowercase hexadecimal machine code** (Milestone 1)
  - **`.text` and `.data` files** containing assembled program sections (Milestone 2)
- Implemented entirely in **Java**

---

## 🧩 Supported Instruction Set

### Core Instructions

| Type   | Instructions |
|--------|-------------|
| R-Type | `add`, `sub`, `and`, `or`, `slt`, `syscall` |
| I-Type | `beq`, `bne`, `addiu`, `andi`, `ori`, `lui`, `lw`, `sw` |
| J-Type | `j` |

### Pseudo-Instructions (Milestone 2)

| Pseudo-Instruction | Expansion Notes |
|--------------------|-----------------|
| `li` | May expand to `lui` + `ori` depending on value |
| `la` | Loads address of label; may use `$at` |
| `blt` | Expands to `slt` + `bne` |
| `move` | Expands to `add` with `$zero` |

Pseudo-instructions are expanded according to the rules provided in the course’s MIPS resources.

---

## 📦 How to Run

### Milestone 1 — Single Instruction Mode

```bash
java -jar PROG1_Milestone1.jar "add $t5, $s7, $5"
```

Output:
```text
02e56820
```

#### Escaping `$` in Different Terminals

**Windows (use backtick `):**
```bash
java -jar PROG1_Milestone1.jar "add `$t5, `$s7, `$5"
```

**Linux / macOS (use backslash \):**
```bash
java -jar PROG1_Milestone1.jar "add \$t5, \$s7, \$5"
```

---

### Milestone 2 — Full File Assembly

The assembler accepts a single argument: the path to a `.asm` file.

```bash
java -jar Assembler.jar path/to/test.asm
```

This produces two output files in the same directory as the input:

- `test.text` — assembled `.text` section  
- `test.data` — assembled `.data` section  

---

## 📄 Output File Format

Each output file:
- Contains one 32-bit value per line  
- Uses lowercase hexadecimal  
- Does **not** include a `0x` prefix  

Example:
```text
3c011001
34280000
8d090000
```

---

## 🗂️ File Parsing Overview

### Section Splitting

The assembler divides the input file into:
- A `.data` section  
- A `.text` section  

Rules:
- Each section begins with `.data` or `.text`  
- Each section appears exactly once  
- A section ends when the other begins or the file ends  

---

## 📚 Data Section Handling

Each line in `.data` may be:
- Empty  
- A comment  
- A data declaration  

### Data Declaration Format

```text
[label]: [data type] [data]   # optional comment
```

### Supported Data Types

| Type | Description |
|-----|------------|
| `.asciiz` | Null-terminated string |

### Memory Layout

- First data item starts at address `0x10010000`  
- Subsequent items follow sequentially based on size  
- `.asciiz` size = number of characters + 1 null byte  
- Data is stored in **little-endian** format  

Example addresses (from `EvenOrOdd.asm`):

| Label | Address |
|------|---------|
| `input_request` | `0x10010000` |
| `even_output` | `0x10010015` |
| `odd_output` | `0x1001002b` |

---

## 🧵 Text Section Handling

Each line in `.text` may be:
- Empty  
- A comment  
- A label declaration  
- An instruction (possibly preceded by a label)  

### Label Rules
- A label ends with `:`  
- A label alone refers to the address of the next instruction  
- First instruction address: `0x00400000`  

### Branch & Jump Resolution
- Branches (`beq`, `bne`) use signed offsets relative to `PC + 4`  
- Jumps (`j`) use absolute addresses  
- Offsets and addresses use **word addressing**, not byte addressing  

Example addresses (from `EvenOrOdd.asm`):

| Label | Address |
|------|---------|
| `ITS_EVEN` | `0x00400028` |
| `ITS_ODD` | `0x0040003c` |
| `EXIT` | `0x0040004c` |

Example branch offset:
- A `beq` on line 23 has an immediate value of `0x0001`  
- This corresponds to the distance from `PC + 4` to the target label in **words**

---

## 📂 Project Structure

```text
Reduced-ISA-MIPS-Assembler/
├── src/                # Java source code for the assembler
├── Tests/              # Test assembly programs and validation cases
└── EvenOrOdd.asm       # Example input program
```

---

## 🛠️ Technologies Used

- **Java**  
- Standard Java I/O and parsing utilities  
- No external dependencies  
