import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MIPSAssemblerTest {

	@Test
	public void test1() {
		String instruction = "sub $t5, $s1, $s2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02326822", actualHex);
	}
	@Test
	public void test2() {
		String instruction = "andi $s5, $t7, -79";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("31f5ffb1", actualHex);
	}
	@Test
	public void test3() {
		String instruction = "andi $sp, $k1, 0x4e";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("337d004e", actualHex);
	}
	@Test
	public void test4() {
		String instruction = "bne $s0, $k1, 0x79";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("161b0079", actualHex);
	}
	@Test
	public void test5() {
		String instruction = "beq $k0, $t7, 0xa3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("134f00a3", actualHex);
	}
	@Test
	public void test6() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test7() {
		String instruction = "or $v0, $s6, $t8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02d81025", actualHex);
	}
	@Test
	public void test8() {
		String instruction = "addiu $s0, $s3, 167";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("267000a7", actualHex);
	}
	@Test
	public void test9() {
		String instruction = "sw $t6, 114($s7)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("aeee0072", actualHex);
	}
	@Test
	public void test10() {
		String instruction = "andi $t1, $s4, -62";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3289ffc2", actualHex);
	}
	@Test
	public void test11() {
		String instruction = "slt $t3, $k1, $v1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0363582a", actualHex);
	}
	@Test
	public void test12() {
		String instruction = "lui $v0, 0xda";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0200da", actualHex);
	}
	@Test
	public void test13() {
		String instruction = "lui $a0, 0xd7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0400d7", actualHex);
	}
	@Test
	public void test14() {
		String instruction = "andi $at, $fp, 0x90";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("33c10090", actualHex);
	}
	@Test
	public void test15() {
		String instruction = "bne $s0, $fp, -250";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("161eff06", actualHex);
	}
	@Test
	public void test16() {
		String instruction = "beq $t8, $a2, -124";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1306ff84", actualHex);
	}
	@Test
	public void test17() {
		String instruction = "addiu $s6, $s7, 99";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26f60063", actualHex);
	}
	@Test
	public void test18() {
		String instruction = "slt $zero, $t4, $t4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("018c002a", actualHex);
	}
	@Test
	public void test19() {
		String instruction = "sw $s2, -211($a1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("acb2ff2d", actualHex);
	}
	@Test
	public void test20() {
		String instruction = "lw $k0, -94($s1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8e3affa2", actualHex);
	}
	@Test
	public void test21() {
		String instruction = "or $zero, $t3, $t0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01680025", actualHex);
	}
	@Test
	public void test22() {
		String instruction = "bne $s6, $v1, 0xfff0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("16c3fff0", actualHex);
	}
	@Test
	public void test23() {
		String instruction = "or $a3, $k0, $s3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03533825", actualHex);
	}
	@Test
	public void test24() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test25() {
		String instruction = "bne $t8, $s0, 233";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("171000e9", actualHex);
	}
	@Test
	public void test26() {
		String instruction = "j 0x74";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000074", actualHex);
	}
	@Test
	public void test27() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test28() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test29() {
		String instruction = "or $s5, $k0, $s4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0354a825", actualHex);
	}
	@Test
	public void test30() {
		String instruction = "andi $s1, $a3, -27";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("30f1ffe5", actualHex);
	}
	@Test
	public void test31() {
		String instruction = "or $t4, $ra, $sp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03fd6025", actualHex);
	}
	@Test
	public void test32() {
		String instruction = "j 0x48";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000048", actualHex);
	}
	@Test
	public void test33() {
		String instruction = "addiu $ra, $s7, 0xfc";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26ff00fc", actualHex);
	}
	@Test
	public void test34() {
		String instruction = "lw $gp, 112($s4)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8e9c0070", actualHex);
	}
	@Test
	public void test35() {
		String instruction = "ori $s0, $s7, 131";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36f00083", actualHex);
	}
	@Test
	public void test36() {
		String instruction = "slt $zero, $at, $t6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("002e002a", actualHex);
	}
	@Test
	public void test37() {
		String instruction = "add $a1, $t8, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03192820", actualHex);
	}
	@Test
	public void test38() {
		String instruction = "or $s5, $k1, $t7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("036fa825", actualHex);
	}
	@Test
	public void test39() {
		String instruction = "ori $s0, $s0, 0x99";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36100099", actualHex);
	}
	@Test
	public void test40() {
		String instruction = "j 0x8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000008", actualHex);
	}
	@Test
	public void test41() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test42() {
		String instruction = "add $a3, $s4, $t4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("028c3820", actualHex);
	}
	@Test
	public void test43() {
		String instruction = "slt $gp, $a2, $t0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00c8e02a", actualHex);
	}
	@Test
	public void test44() {
		String instruction = "add $v0, $t5, $a0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01a41020", actualHex);
	}
	@Test
	public void test45() {
		String instruction = "addiu $t0, $v1, 0x9b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("2468009b", actualHex);
	}
	@Test
	public void test46() {
		String instruction = "beq $v1, $v1, 0xffdd";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1063ffdd", actualHex);
	}
	@Test
	public void test47() {
		String instruction = "lui $t3, 0xdb";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0b00db", actualHex);
	}
	@Test
	public void test48() {
		String instruction = "ori $a3, $s6, 0xa";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36c7000a", actualHex);
	}
	@Test
	public void test49() {
		String instruction = "lw $a0, -182($s5)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8ea4ff4a", actualHex);
	}
	@Test
	public void test50() {
		String instruction = "sub $s3, $s6, $t8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02d89822", actualHex);
	}
	@Test
	public void test51() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test52() {
		String instruction = "and $t7, $t1, $a1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01257824", actualHex);
	}
	@Test
	public void test53() {
		String instruction = "slt $zero, $t4, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("019e002a", actualHex);
	}
	@Test
	public void test54() {
		String instruction = "and $s3, $t6, $a2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01c69824", actualHex);
	}
	@Test
	public void test55() {
		String instruction = "lui $a0, 0x7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c040007", actualHex);
	}
	@Test
	public void test56() {
		String instruction = "lui $t6, 0x6b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0e006b", actualHex);
	}
	@Test
	public void test57() {
		String instruction = "lui $a1, 0xe0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0500e0", actualHex);
	}
	@Test
	public void test58() {
		String instruction = "sub $s6, $t4, $t7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("018fb022", actualHex);
	}
	@Test
	public void test59() {
		String instruction = "addiu $t9, $s6, 0xe3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26d900e3", actualHex);
	}
	@Test
	public void test60() {
		String instruction = "lui $k0, 0x4f";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1a004f", actualHex);
	}
	@Test
	public void test61() {
		String instruction = "j 0x99";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000099", actualHex);
	}
	@Test
	public void test62() {
		String instruction = "j 0xd2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000d2", actualHex);
	}
	@Test
	public void test63() {
		String instruction = "or $t7, $v1, $gp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("007c7825", actualHex);
	}
	@Test
	public void test64() {
		String instruction = "j 0x29";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000029", actualHex);
	}
	@Test
	public void test65() {
		String instruction = "j 0x66";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000066", actualHex);
	}
	@Test
	public void test66() {
		String instruction = "lw $sp, ($t7)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8dfd0000", actualHex);
	}
	@Test
	public void test67() {
		String instruction = "j 0x52";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000052", actualHex);
	}
	@Test
	public void test68() {
		String instruction = "j 0x67";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000067", actualHex);
	}
	@Test
	public void test69() {
		String instruction = "lui $t5, 0x1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0d0001", actualHex);
	}
	@Test
	public void test70() {
		String instruction = "and $s7, $t5, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01bab824", actualHex);
	}
	@Test
	public void test71() {
		String instruction = "or $t2, $s6, $a0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02c45025", actualHex);
	}
	@Test
	public void test72() {
		String instruction = "lw $k1, -234($v1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c7bff16", actualHex);
	}
	@Test
	public void test73() {
		String instruction = "ori $t5, $v0, -119";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("344dff89", actualHex);
	}
	@Test
	public void test74() {
		String instruction = "sw $s3, 26($k1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af73001a", actualHex);
	}
	@Test
	public void test75() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test76() {
		String instruction = "j 0x77";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000077", actualHex);
	}
	@Test
	public void test77() {
		String instruction = "addiu $s0, $a3, 5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("24f00005", actualHex);
	}
	@Test
	public void test78() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test79() {
		String instruction = "or $t9, $s4, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0299c825", actualHex);
	}
	@Test
	public void test80() {
		String instruction = "lw $a3, -82($t8)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8f07ffae", actualHex);
	}
	@Test
	public void test81() {
		String instruction = "lui $a3, 0xba";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0700ba", actualHex);
	}
	@Test
	public void test82() {
		String instruction = "add $sp, $zero, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("001ae820", actualHex);
	}
	@Test
	public void test83() {
		String instruction = "sw $t5, 181($t1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad2d00b5", actualHex);
	}
	@Test
	public void test84() {
		String instruction = "ori $a2, $t8, -152";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3706ff68", actualHex);
	}
	@Test
	public void test85() {
		String instruction = "andi $s1, $t1, 0xdd";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("313100dd", actualHex);
	}
	@Test
	public void test86() {
		String instruction = "addiu $v0, $s2, 0x4b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("2642004b", actualHex);
	}
	@Test
	public void test87() {
		String instruction = "ori $fp, $a3, 155";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("34fe009b", actualHex);
	}
	@Test
	public void test88() {
		String instruction = "sw $t9, 67($a1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("acb90043", actualHex);
	}
	@Test
	public void test89() {
		String instruction = "bne $t8, $k1, 0x6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("171b0006", actualHex);
	}
	@Test
	public void test90() {
		String instruction = "bne $sp, $t6, -27";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("17aeffe5", actualHex);
	}
	@Test
	public void test91() {
		String instruction = "lw $t0, ($t3)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8d680000", actualHex);
	}
	@Test
	public void test92() {
		String instruction = "and $t0, $k0, $s6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03564024", actualHex);
	}
	@Test
	public void test93() {
		String instruction = "addiu $ra, $t2, 13";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("255f000d", actualHex);
	}
	@Test
	public void test94() {
		String instruction = "bne $v0, $s7, 151";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("14570097", actualHex);
	}
	@Test
	public void test95() {
		String instruction = "j 0x1f";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800001f", actualHex);
	}
	@Test
	public void test96() {
		String instruction = "andi $t5, $at, 0x7d";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("302d007d", actualHex);
	}
	@Test
	public void test97() {
		String instruction = "and $a3, $t9, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("032d3824", actualHex);
	}
	@Test
	public void test98() {
		String instruction = "or $a1, $t0, $v0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01022825", actualHex);
	}
	@Test
	public void test99() {
		String instruction = "add $s1, $s0, $s0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02108820", actualHex);
	}
	@Test
	public void test100() {
		String instruction = "addiu $a1, $s1, 174";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("262500ae", actualHex);
	}
	@Test
	public void test101() {
		String instruction = "andi $t0, $s5, 151";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("32a80097", actualHex);
	}
	@Test
	public void test102() {
		String instruction = "beq $t8, $a3, 0xf2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("130700f2", actualHex);
	}
	@Test
	public void test103() {
		String instruction = "ori $gp, $s4, 0xff08";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("369cff08", actualHex);
	}
	@Test
	public void test104() {
		String instruction = "j 0x21";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000021", actualHex);
	}
	@Test
	public void test105() {
		String instruction = "or $t4, $t3, $v1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01636025", actualHex);
	}
	@Test
	public void test106() {
		String instruction = "lw $fp, ($t2)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8d5e0000", actualHex);
	}
	@Test
	public void test107() {
		String instruction = "add $t5, $s1, $s1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02316820", actualHex);
	}
	@Test
	public void test108() {
		String instruction = "beq $v0, $s2, 0xff95";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1052ff95", actualHex);
	}
	@Test
	public void test109() {
		String instruction = "bne $k0, $ra, -7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("175ffff9", actualHex);
	}
	@Test
	public void test110() {
		String instruction = "j 0x75";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000075", actualHex);
	}
	@Test
	public void test111() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test112() {
		String instruction = "slt $s5, $s4, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("028da82a", actualHex);
	}
	@Test
	public void test113() {
		String instruction = "add $sp, $t1, $a0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0124e820", actualHex);
	}
	@Test
	public void test114() {
		String instruction = "sw $a2, -192($k0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af46ff40", actualHex);
	}
	@Test
	public void test115() {
		String instruction = "sub $t1, $t6, $t4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01cc4822", actualHex);
	}
	@Test
	public void test116() {
		String instruction = "andi $s5, $v0, 0xff78";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3055ff78", actualHex);
	}
	@Test
	public void test117() {
		String instruction = "ori $s0, $k1, 0xffb6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3770ffb6", actualHex);
	}
	@Test
	public void test118() {
		String instruction = "or $t5, $t0, $s0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01106825", actualHex);
	}
	@Test
	public void test119() {
		String instruction = "add $ra, $t0, $t2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("010af820", actualHex);
	}
	@Test
	public void test120() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test121() {
		String instruction = "beq $t3, $t3, 0x1c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("116b001c", actualHex);
	}
	@Test
	public void test122() {
		String instruction = "add $t1, $s7, $t6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02ee4820", actualHex);
	}
	@Test
	public void test123() {
		String instruction = "sw $v1, 51($k1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af630033", actualHex);
	}
	@Test
	public void test124() {
		String instruction = "bne $k0, $a2, 14";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1746000e", actualHex);
	}
	@Test
	public void test125() {
		String instruction = "beq $at, $s0, 0xffaf";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1030ffaf", actualHex);
	}
	@Test
	public void test126() {
		String instruction = "ori $t2, $t7, 159";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("35ea009f", actualHex);
	}
	@Test
	public void test127() {
		String instruction = "andi $s4, $at, 60";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3034003c", actualHex);
	}
	@Test
	public void test128() {
		String instruction = "and $t3, $at, $s1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00315824", actualHex);
	}
	@Test
	public void test129() {
		String instruction = "andi $at, $t8, 0xffc1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3301ffc1", actualHex);
	}
	@Test
	public void test130() {
		String instruction = "or $s3, $t6, $sp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01dd9825", actualHex);
	}
	@Test
	public void test131() {
		String instruction = "beq $t3, $fp, 22";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("117e0016", actualHex);
	}
	@Test
	public void test132() {
		String instruction = "sub $k0, $v1, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("007ed022", actualHex);
	}
	@Test
	public void test133() {
		String instruction = "j 0xc4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000c4", actualHex);
	}
	@Test
	public void test134() {
		String instruction = "bne $a0, $k0, 0x93";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("149a0093", actualHex);
	}
	@Test
	public void test135() {
		String instruction = "j 0x28";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000028", actualHex);
	}
	@Test
	public void test136() {
		String instruction = "or $t4, $s2, $s6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02566025", actualHex);
	}
	@Test
	public void test137() {
		String instruction = "and $s1, $v0, $gp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("005c8824", actualHex);
	}
	@Test
	public void test138() {
		String instruction = "andi $t1, $s0, 78";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3209004e", actualHex);
	}
	@Test
	public void test139() {
		String instruction = "andi $s7, $s3, -42";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3277ffd6", actualHex);
	}
	@Test
	public void test140() {
		String instruction = "or $ra, $ra, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03faf825", actualHex);
	}
	@Test
	public void test141() {
		String instruction = "addiu $k1, $s2, 190";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("265b00be", actualHex);
	}
	@Test
	public void test142() {
		String instruction = "sub $a3, $t4, $gp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("019c3822", actualHex);
	}
	@Test
	public void test143() {
		String instruction = "sub $s1, $s7, $t2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02ea8822", actualHex);
	}
	@Test
	public void test144() {
		String instruction = "or $zero, $t4, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("019e0025", actualHex);
	}
	@Test
	public void test145() {
		String instruction = "andi $s0, $v0, 101";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("30500065", actualHex);
	}
	@Test
	public void test146() {
		String instruction = "bne $t0, $t6, 0x39";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("150e0039", actualHex);
	}
	@Test
	public void test147() {
		String instruction = "or $s6, $t8, $s0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0310b025", actualHex);
	}
	@Test
	public void test148() {
		String instruction = "and $a2, $a3, $s7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00f73024", actualHex);
	}
	@Test
	public void test149() {
		String instruction = "slt $a3, $t4, $ra";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("019f382a", actualHex);
	}
	@Test
	public void test150() {
		String instruction = "sw $at, -144($t0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad01ff70", actualHex);
	}
	@Test
	public void test151() {
		String instruction = "lui $s6, 0x30";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c160030", actualHex);
	}
	@Test
	public void test152() {
		String instruction = "lw $s1, -121($v0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c51ff87", actualHex);
	}
	@Test
	public void test153() {
		String instruction = "addiu $s3, $s5, 154";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26b3009a", actualHex);
	}
	@Test
	public void test154() {
		String instruction = "addiu $s2, $s6, 0xfd";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26d200fd", actualHex);
	}
	@Test
	public void test155() {
		String instruction = "bne $t2, $v0, 0xff77";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1542ff77", actualHex);
	}
	@Test
	public void test156() {
		String instruction = "lui $t4, 0xe";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0c000e", actualHex);
	}
	@Test
	public void test157() {
		String instruction = "and $a2, $s5, $v1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02a33024", actualHex);
	}
	@Test
	public void test158() {
		String instruction = "addiu $gp, $gp, 0xf0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("279c00f0", actualHex);
	}
	@Test
	public void test159() {
		String instruction = "bne $a0, $a1, 11";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1485000b", actualHex);
	}
	@Test
	public void test160() {
		String instruction = "bne $s0, $t5, 0x24";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("160d0024", actualHex);
	}
	@Test
	public void test161() {
		String instruction = "slt $t5, $zero, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0015682a", actualHex);
	}
	@Test
	public void test162() {
		String instruction = "lw $s0, 173($at)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c3000ad", actualHex);
	}
	@Test
	public void test163() {
		String instruction = "add $a2, $s7, $at";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02e13020", actualHex);
	}
	@Test
	public void test164() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test165() {
		String instruction = "add $s3, $k0, $t2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("034a9820", actualHex);
	}
	@Test
	public void test166() {
		String instruction = "lw $t2, ($sp)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8faa0000", actualHex);
	}
	@Test
	public void test167() {
		String instruction = "add $t5, $t4, $s3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01936820", actualHex);
	}
	@Test
	public void test168() {
		String instruction = "ori $t6, $v1, 0xffa8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("346effa8", actualHex);
	}
	@Test
	public void test169() {
		String instruction = "bne $s3, $t1, 0xffe7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1669ffe7", actualHex);
	}
	@Test
	public void test170() {
		String instruction = "or $sp, $a1, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00ade825", actualHex);
	}
	@Test
	public void test171() {
		String instruction = "j 0xa8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000a8", actualHex);
	}
	@Test
	public void test172() {
		String instruction = "bne $zero, $s5, 0x3c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1415003c", actualHex);
	}
	@Test
	public void test173() {
		String instruction = "j 0xd";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800000d", actualHex);
	}
	@Test
	public void test174() {
		String instruction = "ori $s0, $zero, -23";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3410ffe9", actualHex);
	}
	@Test
	public void test175() {
		String instruction = "or $v0, $t5, $s4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01b41025", actualHex);
	}
	@Test
	public void test176() {
		String instruction = "j 0x8a";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800008a", actualHex);
	}
	@Test
	public void test177() {
		String instruction = "lui $s6, 0x20";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c160020", actualHex);
	}
	@Test
	public void test178() {
		String instruction = "j 0xbf";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000bf", actualHex);
	}
	@Test
	public void test179() {
		String instruction = "bne $ra, $t9, 0xff24";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("17f9ff24", actualHex);
	}
	@Test
	public void test180() {
		String instruction = "sw $t5, -190($s3)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ae6dff42", actualHex);
	}
	@Test
	public void test181() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test182() {
		String instruction = "j 0xd8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000d8", actualHex);
	}
	@Test
	public void test183() {
		String instruction = "slt $sp, $a2, $sp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00dde82a", actualHex);
	}
	@Test
	public void test184() {
		String instruction = "bne $v0, $at, 0x5b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1441005b", actualHex);
	}
	@Test
	public void test185() {
		String instruction = "andi $t5, $sp, 0x46";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("33ad0046", actualHex);
	}
	@Test
	public void test186() {
		String instruction = "and $sp, $t1, $s3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0133e824", actualHex);
	}
	@Test
	public void test187() {
		String instruction = "addiu $t8, $t6, 0xee";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("25d800ee", actualHex);
	}
	@Test
	public void test188() {
		String instruction = "add $v0, $t0, $s0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01101020", actualHex);
	}
	@Test
	public void test189() {
		String instruction = "slt $t8, $t2, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("014dc02a", actualHex);
	}
	@Test
	public void test190() {
		String instruction = "lw $fp, ($v0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c5e0000", actualHex);
	}
	@Test
	public void test191() {
		String instruction = "beq $t4, $ra, 0xff21";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("119fff21", actualHex);
	}
	@Test
	public void test192() {
		String instruction = "addiu $t9, $s4, 152";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26990098", actualHex);
	}
	@Test
	public void test193() {
		String instruction = "or $s0, $a1, $a1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00a58025", actualHex);
	}
	@Test
	public void test194() {
		String instruction = "beq $t8, $fp, 87";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("131e0057", actualHex);
	}
	@Test
	public void test195() {
		String instruction = "andi $a1, $s4, 0x37";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("32850037", actualHex);
	}
	@Test
	public void test196() {
		String instruction = "lui $t5, 0xf0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0d00f0", actualHex);
	}
	@Test
	public void test197() {
		String instruction = "sub $a1, $t7, $a2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01e62822", actualHex);
	}
	@Test
	public void test198() {
		String instruction = "slt $s6, $s7, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02edb02a", actualHex);
	}
	@Test
	public void test199() {
		String instruction = "or $a0, $gp, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("039a2025", actualHex);
	}
	@Test
	public void test200() {
		String instruction = "j 0xe7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000e7", actualHex);
	}
	@Test
	public void test201() {
		String instruction = "or $ra, $v1, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0075f825", actualHex);
	}
	@Test
	public void test202() {
		String instruction = "and $a2, $t9, $s6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03363024", actualHex);
	}
	@Test
	public void test203() {
		String instruction = "and $a0, $t7, $t7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01ef2024", actualHex);
	}
	@Test
	public void test204() {
		String instruction = "and $ra, $t9, $v1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0323f824", actualHex);
	}
	@Test
	public void test205() {
		String instruction = "andi $s0, $fp, 243";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("33d000f3", actualHex);
	}
	@Test
	public void test206() {
		String instruction = "sw $t8, -232($v0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac58ff18", actualHex);
	}
	@Test
	public void test207() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test208() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test209() {
		String instruction = "beq $s7, $t3, 50";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("12eb0032", actualHex);
	}
	@Test
	public void test210() {
		String instruction = "slt $t4, $a3, $a2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00e6602a", actualHex);
	}
	@Test
	public void test211() {
		String instruction = "or $s4, $s3, $s3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0273a025", actualHex);
	}
	@Test
	public void test212() {
		String instruction = "addiu $at, $s0, 254";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("260100fe", actualHex);
	}
	@Test
	public void test213() {
		String instruction = "addiu $t6, $s7, 123";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26ee007b", actualHex);
	}
	@Test
	public void test214() {
		String instruction = "and $v0, $v1, $a0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00641024", actualHex);
	}
	@Test
	public void test215() {
		String instruction = "j 0xa6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000a6", actualHex);
	}
	@Test
	public void test216() {
		String instruction = "add $fp, $t0, $s1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0111f020", actualHex);
	}
	@Test
	public void test217() {
		String instruction = "addiu $t9, $s5, 0xbb";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26b900bb", actualHex);
	}
	@Test
	public void test218() {
		String instruction = "beq $s5, $k0, 0x81";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("12ba0081", actualHex);
	}
	@Test
	public void test219() {
		String instruction = "add $t2, $sp, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03ba5020", actualHex);
	}
	@Test
	public void test220() {
		String instruction = "add $v1, $gp, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03991820", actualHex);
	}
	@Test
	public void test221() {
		String instruction = "beq $t4, $sp, 90";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("119d005a", actualHex);
	}
	@Test
	public void test222() {
		String instruction = "j 0xe7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000e7", actualHex);
	}
	@Test
	public void test223() {
		String instruction = "sw $s4, ($s2)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ae540000", actualHex);
	}
	@Test
	public void test224() {
		String instruction = "add $t5, $t7, $t8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01f86820", actualHex);
	}
	@Test
	public void test225() {
		String instruction = "addiu $at, $s3, 180";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("266100b4", actualHex);
	}
	@Test
	public void test226() {
		String instruction = "lui $t7, 0x18";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0f0018", actualHex);
	}
	@Test
	public void test227() {
		String instruction = "lui $s1, 0x96";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c110096", actualHex);
	}
	@Test
	public void test228() {
		String instruction = "addiu $s4, $s7, 0x99";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26f40099", actualHex);
	}
	@Test
	public void test229() {
		String instruction = "bne $s0, $s4, 0xff35";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1614ff35", actualHex);
	}
	@Test
	public void test230() {
		String instruction = "beq $v0, $k0, 215";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("105a00d7", actualHex);
	}
	@Test
	public void test231() {
		String instruction = "beq $k0, $t7, 56";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("134f0038", actualHex);
	}
	@Test
	public void test232() {
		String instruction = "sub $s6, $a1, $s6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00b6b022", actualHex);
	}
	@Test
	public void test233() {
		String instruction = "slt $s5, $t9, $t4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("032ca82a", actualHex);
	}
	@Test
	public void test234() {
		String instruction = "add $s1, $s6, $a1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02c58820", actualHex);
	}
	@Test
	public void test235() {
		String instruction = "sub $ra, $t3, $t0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0168f822", actualHex);
	}
	@Test
	public void test236() {
		String instruction = "lui $sp, 0xbd";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1d00bd", actualHex);
	}
	@Test
	public void test237() {
		String instruction = "and $v0, $a2, $at";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00c11024", actualHex);
	}
	@Test
	public void test238() {
		String instruction = "sw $k0, ($t0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad1a0000", actualHex);
	}
	@Test
	public void test239() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test240() {
		String instruction = "sub $s0, $a1, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00b58022", actualHex);
	}
	@Test
	public void test241() {
		String instruction = "bne $t8, $fp, 0xa6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("171e00a6", actualHex);
	}
	@Test
	public void test242() {
		String instruction = "bne $t7, $t9, 85";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("15f90055", actualHex);
	}
	@Test
	public void test243() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test244() {
		String instruction = "lw $s5, -232($ra)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8ff5ff18", actualHex);
	}
	@Test
	public void test245() {
		String instruction = "beq $s4, $s1, 186";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("129100ba", actualHex);
	}
	@Test
	public void test246() {
		String instruction = "ori $a2, $t0, -85";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3506ffab", actualHex);
	}
	@Test
	public void test247() {
		String instruction = "or $t4, $zero, $t8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00186025", actualHex);
	}
	@Test
	public void test248() {
		String instruction = "beq $gp, $a0, 0xe9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("138400e9", actualHex);
	}
	@Test
	public void test249() {
		String instruction = "j 0xd3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000d3", actualHex);
	}
	@Test
	public void test250() {
		String instruction = "lw $t9, 224($s4)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8e9900e0", actualHex);
	}
	@Test
	public void test251() {
		String instruction = "slt $t5, $s3, $t8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0278682a", actualHex);
	}
	@Test
	public void test252() {
		String instruction = "andi $v1, $t1, 0x97";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("31230097", actualHex);
	}
	@Test
	public void test253() {
		String instruction = "beq $a2, $s3, 190";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("10d300be", actualHex);
	}
	@Test
	public void test254() {
		String instruction = "lw $s7, ($a1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8cb70000", actualHex);
	}
	@Test
	public void test255() {
		String instruction = "bne $s3, $sp, -204";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("167dff34", actualHex);
	}
	@Test
	public void test256() {
		String instruction = "lui $t7, 0x22";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0f0022", actualHex);
	}
	@Test
	public void test257() {
		String instruction = "add $t5, $k1, $s0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03706820", actualHex);
	}
	@Test
	public void test258() {
		String instruction = "addiu $s6, $sp, 147";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("27b60093", actualHex);
	}
	@Test
	public void test259() {
		String instruction = "j 0x8c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800008c", actualHex);
	}
	@Test
	public void test260() {
		String instruction = "sw $t2, ($sp)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("afaa0000", actualHex);
	}
	@Test
	public void test261() {
		String instruction = "and $v0, $s0, $t6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("020e1024", actualHex);
	}
	@Test
	public void test262() {
		String instruction = "addiu $t3, $sp, 42";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("27ab002a", actualHex);
	}
	@Test
	public void test263() {
		String instruction = "lw $t5, ($s5)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8ead0000", actualHex);
	}
	@Test
	public void test264() {
		String instruction = "sw $k0, ($t0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad1a0000", actualHex);
	}
	@Test
	public void test265() {
		String instruction = "bne $t4, $t7, 0xff2c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("158fff2c", actualHex);
	}
	@Test
	public void test266() {
		String instruction = "bne $s6, $k0, 189";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("16da00bd", actualHex);
	}
	@Test
	public void test267() {
		String instruction = "lui $s6, 0x21";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c160021", actualHex);
	}
	@Test
	public void test268() {
		String instruction = "ori $a1, $k0, 173";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("374500ad", actualHex);
	}
	@Test
	public void test269() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test270() {
		String instruction = "j 0x23";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000023", actualHex);
	}
	@Test
	public void test271() {
		String instruction = "add $s7, $t6, $at";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01c1b820", actualHex);
	}
	@Test
	public void test272() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test273() {
		String instruction = "lui $a3, 0x5e";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c07005e", actualHex);
	}
	@Test
	public void test274() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test275() {
		String instruction = "bne $sp, $s4, 213";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("17b400d5", actualHex);
	}
	@Test
	public void test276() {
		String instruction = "lui $t5, 0x82";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0d0082", actualHex);
	}
	@Test
	public void test277() {
		String instruction = "addiu $s2, $a0, 234";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("249200ea", actualHex);
	}
	@Test
	public void test278() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test279() {
		String instruction = "sub $gp, $t4, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0195e022", actualHex);
	}
	@Test
	public void test280() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test281() {
		String instruction = "lw $v1, -90($k0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8f43ffa6", actualHex);
	}
	@Test
	public void test282() {
		String instruction = "and $sp, $t6, $sp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01dde824", actualHex);
	}
	@Test
	public void test283() {
		String instruction = "lui $k0, 0x3c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1a003c", actualHex);
	}
	@Test
	public void test284() {
		String instruction = "or $s4, $v1, $at";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0061a025", actualHex);
	}
	@Test
	public void test285() {
		String instruction = "sw $a2, ($s0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ae060000", actualHex);
	}
	@Test
	public void test286() {
		String instruction = "addiu $s7, $sp, 0xd";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("27b7000d", actualHex);
	}
	@Test
	public void test287() {
		String instruction = "ori $t1, $s5, 0xad";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36a900ad", actualHex);
	}
	@Test
	public void test288() {
		String instruction = "bne $t3, $a3, -92";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1567ffa4", actualHex);
	}
	@Test
	public void test289() {
		String instruction = "sub $k0, $t3, $s2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0172d022", actualHex);
	}
	@Test
	public void test290() {
		String instruction = "addiu $t3, $t1, 61";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("252b003d", actualHex);
	}
	@Test
	public void test291() {
		String instruction = "lui $t3, 0x4c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0b004c", actualHex);
	}
	@Test
	public void test292() {
		String instruction = "lui $t1, 0x18";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c090018", actualHex);
	}
	@Test
	public void test293() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test294() {
		String instruction = "ori $s5, $s5, 0x2b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36b5002b", actualHex);
	}
	@Test
	public void test295() {
		String instruction = "or $s5, $sp, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03b9a825", actualHex);
	}
	@Test
	public void test296() {
		String instruction = "sw $fp, -205($v0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac5eff33", actualHex);
	}
	@Test
	public void test297() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test298() {
		String instruction = "add $t2, $v0, $at";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00415020", actualHex);
	}
	@Test
	public void test299() {
		String instruction = "bne $t2, $k0, 0x54";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("155a0054", actualHex);
	}
	@Test
	public void test300() {
		String instruction = "and $v1, $ra, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03e71824", actualHex);
	}
	@Test
	public void test301() {
		String instruction = "sw $a0, -164($k1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af64ff5c", actualHex);
	}
	@Test
	public void test302() {
		String instruction = "bne $a0, $gp, -124";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("149cff84", actualHex);
	}
	@Test
	public void test303() {
		String instruction = "bne $s5, $v1, -70";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("16a3ffba", actualHex);
	}
	@Test
	public void test304() {
		String instruction = "addiu $a2, $a0, 226";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("248600e2", actualHex);
	}
	@Test
	public void test305() {
		String instruction = "lui $s6, 0x97";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c160097", actualHex);
	}
	@Test
	public void test306() {
		String instruction = "and $at, $t1, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01350824", actualHex);
	}
	@Test
	public void test307() {
		String instruction = "addiu $s6, $a2, 0x80";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("24d60080", actualHex);
	}
	@Test
	public void test308() {
		String instruction = "slt $v1, $t0, $zero";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0100182a", actualHex);
	}
	@Test
	public void test309() {
		String instruction = "j 0x53";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000053", actualHex);
	}
	@Test
	public void test310() {
		String instruction = "or $s6, $ra, $s4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03f4b025", actualHex);
	}
	@Test
	public void test311() {
		String instruction = "beq $t1, $t5, -185";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("112dff47", actualHex);
	}
	@Test
	public void test312() {
		String instruction = "beq $s0, $t5, -155";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("120dff65", actualHex);
	}
	@Test
	public void test313() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test314() {
		String instruction = "addiu $gp, $a1, 0x68";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("24bc0068", actualHex);
	}
	@Test
	public void test315() {
		String instruction = "slt $s4, $t1, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0139a02a", actualHex);
	}
	@Test
	public void test316() {
		String instruction = "bne $a3, $t0, 51";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("14e80033", actualHex);
	}
	@Test
	public void test317() {
		String instruction = "j 0x9c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800009c", actualHex);
	}
	@Test
	public void test318() {
		String instruction = "or $s3, $t6, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01d59825", actualHex);
	}
	@Test
	public void test319() {
		String instruction = "and $at, $t8, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("031e0824", actualHex);
	}
	@Test
	public void test320() {
		String instruction = "andi $ra, $sp, -61";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("33bfffc3", actualHex);
	}
	@Test
	public void test321() {
		String instruction = "addiu $t4, $t8, 0x7d";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("270c007d", actualHex);
	}
	@Test
	public void test322() {
		String instruction = "lui $a1, 0xab";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0500ab", actualHex);
	}
	@Test
	public void test323() {
		String instruction = "sub $t5, $t6, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01da6822", actualHex);
	}
	@Test
	public void test324() {
		String instruction = "or $a3, $s5, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02be3825", actualHex);
	}
	@Test
	public void test325() {
		String instruction = "beq $a1, $s7, 0xffc2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("10b7ffc2", actualHex);
	}
	@Test
	public void test326() {
		String instruction = "or $sp, $t4, $sp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("019de825", actualHex);
	}
	@Test
	public void test327() {
		String instruction = "j 0x99";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000099", actualHex);
	}
	@Test
	public void test328() {
		String instruction = "addiu $sp, $k0, 0x70";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("275d0070", actualHex);
	}
	@Test
	public void test329() {
		String instruction = "andi $t6, $t6, 139";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("31ce008b", actualHex);
	}
	@Test
	public void test330() {
		String instruction = "or $k0, $t5, $t4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01acd025", actualHex);
	}
	@Test
	public void test331() {
		String instruction = "or $a0, $s1, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("023e2025", actualHex);
	}
	@Test
	public void test332() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test333() {
		String instruction = "add $t3, $t0, $s3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01135820", actualHex);
	}
	@Test
	public void test334() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test335() {
		String instruction = "addiu $s6, $fp, 0x14";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("27d60014", actualHex);
	}
	@Test
	public void test336() {
		String instruction = "add $t5, $k1, $a2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03666820", actualHex);
	}
	@Test
	public void test337() {
		String instruction = "bne $gp, $a0, -114";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1784ff8e", actualHex);
	}
	@Test
	public void test338() {
		String instruction = "sub $t2, $k1, $k1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("037b5022", actualHex);
	}
	@Test
	public void test339() {
		String instruction = "j 0x19";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000019", actualHex);
	}
	@Test
	public void test340() {
		String instruction = "andi $s5, $s1, 0x31";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("32350031", actualHex);
	}
	@Test
	public void test341() {
		String instruction = "sub $s6, $a2, $a2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00c6b022", actualHex);
	}
	@Test
	public void test342() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test343() {
		String instruction = "ori $t3, $t6, -183";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("35cbff49", actualHex);
	}
	@Test
	public void test344() {
		String instruction = "lui $t2, 0xe3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0a00e3", actualHex);
	}
	@Test
	public void test345() {
		String instruction = "sub $s0, $s2, $t4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("024c8022", actualHex);
	}
	@Test
	public void test346() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test347() {
		String instruction = "or $t6, $t9, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03277025", actualHex);
	}
	@Test
	public void test348() {
		String instruction = "sub $s4, $k0, $s3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0353a022", actualHex);
	}
	@Test
	public void test349() {
		String instruction = "lui $s6, 0x1b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c16001b", actualHex);
	}
	@Test
	public void test350() {
		String instruction = "ori $fp, $sp, -62";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("37beffc2", actualHex);
	}
	@Test
	public void test351() {
		String instruction = "addiu $t5, $t9, 0x3d";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("272d003d", actualHex);
	}
	@Test
	public void test352() {
		String instruction = "slt $zero, $t1, $s1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0131002a", actualHex);
	}
	@Test
	public void test353() {
		String instruction = "j 0x29";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000029", actualHex);
	}
	@Test
	public void test354() {
		String instruction = "lui $s5, 0x8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c150008", actualHex);
	}
	@Test
	public void test355() {
		String instruction = "or $at, $sp, $s2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03b20825", actualHex);
	}
	@Test
	public void test356() {
		String instruction = "ori $a2, $a0, 0xfff6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3486fff6", actualHex);
	}
	@Test
	public void test357() {
		String instruction = "andi $s2, $s5, -69";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("32b2ffbb", actualHex);
	}
	@Test
	public void test358() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test359() {
		String instruction = "andi $t9, $sp, -37";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("33b9ffdb", actualHex);
	}
	@Test
	public void test360() {
		String instruction = "andi $t5, $s4, 0xfffd";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("328dfffd", actualHex);
	}
	@Test
	public void test361() {
		String instruction = "beq $s1, $v0, 0xff81";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1222ff81", actualHex);
	}
	@Test
	public void test362() {
		String instruction = "add $t0, $sp, $k1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03bb4020", actualHex);
	}
	@Test
	public void test363() {
		String instruction = "sub $k1, $s5, $t4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02acd822", actualHex);
	}
	@Test
	public void test364() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test365() {
		String instruction = "lw $a3, ($t5)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8da70000", actualHex);
	}
	@Test
	public void test366() {
		String instruction = "j 0xe0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000e0", actualHex);
	}
	@Test
	public void test367() {
		String instruction = "bne $t6, $ra, 0xff57";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("15dfff57", actualHex);
	}
	@Test
	public void test368() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test369() {
		String instruction = "sub $at, $t6, $t0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01c80822", actualHex);
	}
	@Test
	public void test370() {
		String instruction = "sw $s0, 239($s3)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ae7000ef", actualHex);
	}
	@Test
	public void test371() {
		String instruction = "j 0x21";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000021", actualHex);
	}
	@Test
	public void test372() {
		String instruction = "sw $s4, 224($s1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ae3400e0", actualHex);
	}
	@Test
	public void test373() {
		String instruction = "addiu $at, $a3, 176";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("24e100b0", actualHex);
	}
	@Test
	public void test374() {
		String instruction = "add $v0, $t6, $t7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01cf1020", actualHex);
	}
	@Test
	public void test375() {
		String instruction = "sw $a0, 143($gp)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af84008f", actualHex);
	}
	@Test
	public void test376() {
		String instruction = "j 0x8e";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800008e", actualHex);
	}
	@Test
	public void test377() {
		String instruction = "add $ra, $a0, $v1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0083f820", actualHex);
	}
	@Test
	public void test378() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test379() {
		String instruction = "or $s6, $s6, $ra";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02dfb025", actualHex);
	}
	@Test
	public void test380() {
		String instruction = "sw $s5, ($t1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad350000", actualHex);
	}
	@Test
	public void test381() {
		String instruction = "sub $at, $t3, $a1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01650822", actualHex);
	}
	@Test
	public void test382() {
		String instruction = "addiu $t2, $at, 91";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("242a005b", actualHex);
	}
	@Test
	public void test383() {
		String instruction = "add $t5, $v0, $t1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00496820", actualHex);
	}
	@Test
	public void test384() {
		String instruction = "slt $t5, $t7, $at";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01e1682a", actualHex);
	}
	@Test
	public void test385() {
		String instruction = "andi $t9, $s0, 0xcd";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("321900cd", actualHex);
	}
	@Test
	public void test386() {
		String instruction = "ori $t2, $s7, -201";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36eaff37", actualHex);
	}
	@Test
	public void test387() {
		String instruction = "and $sp, $gp, $ra";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("039fe824", actualHex);
	}
	@Test
	public void test388() {
		String instruction = "ori $k1, $s5, 165";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36bb00a5", actualHex);
	}
	@Test
	public void test389() {
		String instruction = "sw $gp, ($t1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad3c0000", actualHex);
	}
	@Test
	public void test390() {
		String instruction = "bne $t7, $s1, 0xff5a";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("15f1ff5a", actualHex);
	}
	@Test
	public void test391() {
		String instruction = "j 0x1e";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800001e", actualHex);
	}
	@Test
	public void test392() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test393() {
		String instruction = "lw $t4, -103($a2)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8cccff99", actualHex);
	}
	@Test
	public void test394() {
		String instruction = "beq $t9, $t7, -117";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("132fff8b", actualHex);
	}
	@Test
	public void test395() {
		String instruction = "andi $t3, $t4, 248";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("318b00f8", actualHex);
	}
	@Test
	public void test396() {
		String instruction = "andi $s4, $s2, 0x95";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("32540095", actualHex);
	}
	@Test
	public void test397() {
		String instruction = "addiu $s6, $sp, 108";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("27b6006c", actualHex);
	}
	@Test
	public void test398() {
		String instruction = "addiu $gp, $v0, 0x4e";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("245c004e", actualHex);
	}
	@Test
	public void test399() {
		String instruction = "add $fp, $s5, $a1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02a5f020", actualHex);
	}
	@Test
	public void test400() {
		String instruction = "slt $s4, $t6, $t8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01d8a02a", actualHex);
	}
	@Test
	public void test401() {
		String instruction = "lui $a3, 0xb2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0700b2", actualHex);
	}
	@Test
	public void test402() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test403() {
		String instruction = "slt $ra, $ra, $v0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03e2f82a", actualHex);
	}
	@Test
	public void test404() {
		String instruction = "beq $a3, $s6, 192";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("10f600c0", actualHex);
	}
	@Test
	public void test405() {
		String instruction = "sw $s0, 124($zero)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac10007c", actualHex);
	}
	@Test
	public void test406() {
		String instruction = "lw $fp, ($t5)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8dbe0000", actualHex);
	}
	@Test
	public void test407() {
		String instruction = "and $k0, $s6, $t2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02cad024", actualHex);
	}
	@Test
	public void test408() {
		String instruction = "beq $v1, $t7, 0xffe9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("106fffe9", actualHex);
	}
	@Test
	public void test409() {
		String instruction = "bne $t8, $a1, 221";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("170500dd", actualHex);
	}
	@Test
	public void test410() {
		String instruction = "lui $t8, 0xbd";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1800bd", actualHex);
	}
	@Test
	public void test411() {
		String instruction = "andi $s4, $s2, 0xfffa";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3254fffa", actualHex);
	}
	@Test
	public void test412() {
		String instruction = "and $v0, $a1, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00be1024", actualHex);
	}
	@Test
	public void test413() {
		String instruction = "and $t5, $t0, $t2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("010a6824", actualHex);
	}
	@Test
	public void test414() {
		String instruction = "and $a1, $v1, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00792824", actualHex);
	}
	@Test
	public void test415() {
		String instruction = "j 0xad";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000ad", actualHex);
	}
	@Test
	public void test416() {
		String instruction = "lw $gp, -138($t3)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8d7cff76", actualHex);
	}
	@Test
	public void test417() {
		String instruction = "ori $s2, $s3, 72";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36720048", actualHex);
	}
	@Test
	public void test418() {
		String instruction = "lui $v1, 0xf3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0300f3", actualHex);
	}
	@Test
	public void test419() {
		String instruction = "ori $k1, $s7, 207";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36fb00cf", actualHex);
	}
	@Test
	public void test420() {
		String instruction = "j 0x17";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000017", actualHex);
	}
	@Test
	public void test421() {
		String instruction = "add $a0, $s4, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("029e2020", actualHex);
	}
	@Test
	public void test422() {
		String instruction = "and $s2, $zero, $s6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00169024", actualHex);
	}
	@Test
	public void test423() {
		String instruction = "ori $s5, $a2, 103";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("34d50067", actualHex);
	}
	@Test
	public void test424() {
		String instruction = "lui $sp, 0x5b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1d005b", actualHex);
	}
	@Test
	public void test425() {
		String instruction = "add $t3, $a1, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00b95820", actualHex);
	}
	@Test
	public void test426() {
		String instruction = "bne $s5, $a2, 0xff51";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("16a6ff51", actualHex);
	}
	@Test
	public void test427() {
		String instruction = "or $k1, $t0, $s0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0110d825", actualHex);
	}
	@Test
	public void test428() {
		String instruction = "lw $t3, -249($k1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8f6bff07", actualHex);
	}
	@Test
	public void test429() {
		String instruction = "and $s1, $t6, $a2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01c68824", actualHex);
	}
	@Test
	public void test430() {
		String instruction = "lui $s1, 0x7b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c11007b", actualHex);
	}
	@Test
	public void test431() {
		String instruction = "add $v0, $a2, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00d91020", actualHex);
	}
	@Test
	public void test432() {
		String instruction = "slt $s7, $s2, $v1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0243b82a", actualHex);
	}
	@Test
	public void test433() {
		String instruction = "beq $k1, $a1, 0xff98";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1365ff98", actualHex);
	}
	@Test
	public void test434() {
		String instruction = "or $a1, $v0, $s3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00532825", actualHex);
	}
	@Test
	public void test435() {
		String instruction = "ori $s4, $k1, 0x17";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("37740017", actualHex);
	}
	@Test
	public void test436() {
		String instruction = "j 0x5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000005", actualHex);
	}
	@Test
	public void test437() {
		String instruction = "j 0x6f";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800006f", actualHex);
	}
	@Test
	public void test438() {
		String instruction = "or $s0, $s6, $v1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02c38025", actualHex);
	}
	@Test
	public void test439() {
		String instruction = "sw $a1, 201($t4)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad8500c9", actualHex);
	}
	@Test
	public void test440() {
		String instruction = "j 0x3b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800003b", actualHex);
	}
	@Test
	public void test441() {
		String instruction = "andi $t0, $t1, 0xff6c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3128ff6c", actualHex);
	}
	@Test
	public void test442() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test443() {
		String instruction = "j 0x59";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000059", actualHex);
	}
	@Test
	public void test444() {
		String instruction = "and $s1, $v1, $a1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00658824", actualHex);
	}
	@Test
	public void test445() {
		String instruction = "lui $s2, 0xbb";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1200bb", actualHex);
	}
	@Test
	public void test446() {
		String instruction = "ori $t1, $a2, 0xff90";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("34c9ff90", actualHex);
	}
	@Test
	public void test447() {
		String instruction = "j 0xe5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000e5", actualHex);
	}
	@Test
	public void test448() {
		String instruction = "addiu $t3, $s4, 0xe7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("268b00e7", actualHex);
	}
	@Test
	public void test449() {
		String instruction = "andi $a3, $t7, 0x8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("31e70008", actualHex);
	}
	@Test
	public void test450() {
		String instruction = "ori $a1, $t3, -204";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3565ff34", actualHex);
	}
	@Test
	public void test451() {
		String instruction = "sw $s2, ($t8)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af120000", actualHex);
	}
	@Test
	public void test452() {
		String instruction = "and $t4, $a0, $s3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00936024", actualHex);
	}
	@Test
	public void test453() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test454() {
		String instruction = "sw $t4, -214($v1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac6cff2a", actualHex);
	}
	@Test
	public void test455() {
		String instruction = "lui $a0, 0xb9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0400b9", actualHex);
	}
	@Test
	public void test456() {
		String instruction = "beq $a0, $s2, 0x58";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("10920058", actualHex);
	}
	@Test
	public void test457() {
		String instruction = "j 0x48";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000048", actualHex);
	}
	@Test
	public void test458() {
		String instruction = "lui $s4, 0xb0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1400b0", actualHex);
	}
	@Test
	public void test459() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test460() {
		String instruction = "add $zero, $zero, $t3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("000b0020", actualHex);
	}
	@Test
	public void test461() {
		String instruction = "lui $s6, 0xa6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1600a6", actualHex);
	}
	@Test
	public void test462() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test463() {
		String instruction = "lw $t5, 220($v1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c6d00dc", actualHex);
	}
	@Test
	public void test464() {
		String instruction = "or $v1, $t4, $v0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01821825", actualHex);
	}
	@Test
	public void test465() {
		String instruction = "sub $t3, $s7, $s1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02f15822", actualHex);
	}
	@Test
	public void test466() {
		String instruction = "j 0x4e";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800004e", actualHex);
	}
	@Test
	public void test467() {
		String instruction = "or $at, $t7, $a2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01e60825", actualHex);
	}
	@Test
	public void test468() {
		String instruction = "lw $s3, -26($a0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c93ffe6", actualHex);
	}
	@Test
	public void test469() {
		String instruction = "j 0x84";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000084", actualHex);
	}
	@Test
	public void test470() {
		String instruction = "add $t8, $a3, $t2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00eac020", actualHex);
	}
	@Test
	public void test471() {
		String instruction = "ori $gp, $gp, -106";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("379cff96", actualHex);
	}
	@Test
	public void test472() {
		String instruction = "addiu $s7, $k0, 248";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("275700f8", actualHex);
	}
	@Test
	public void test473() {
		String instruction = "or $s7, $s3, $s0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0270b825", actualHex);
	}
	@Test
	public void test474() {
		String instruction = "andi $t3, $v0, 27";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("304b001b", actualHex);
	}
	@Test
	public void test475() {
		String instruction = "sw $s6, ($t1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad360000", actualHex);
	}
	@Test
	public void test476() {
		String instruction = "ori $a0, $s6, 0x0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36c40000", actualHex);
	}
	@Test
	public void test477() {
		String instruction = "bne $at, $ra, 0xff84";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("143fff84", actualHex);
	}
	@Test
	public void test478() {
		String instruction = "sw $s2, -93($s7)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("aef2ffa3", actualHex);
	}
	@Test
	public void test479() {
		String instruction = "ori $a1, $gp, -48";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3785ffd0", actualHex);
	}
	@Test
	public void test480() {
		String instruction = "j 0x97";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000097", actualHex);
	}
	@Test
	public void test481() {
		String instruction = "or $a0, $t6, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01de2025", actualHex);
	}
	@Test
	public void test482() {
		String instruction = "lui $s6, 0x83";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c160083", actualHex);
	}
	@Test
	public void test483() {
		String instruction = "and $t0, $k1, $s6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03764024", actualHex);
	}
	@Test
	public void test484() {
		String instruction = "or $t3, $fp, $t3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03cb5825", actualHex);
	}
	@Test
	public void test485() {
		String instruction = "and $s0, $a0, $s7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00978024", actualHex);
	}
	@Test
	public void test486() {
		String instruction = "and $s3, $a0, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00999824", actualHex);
	}
	@Test
	public void test487() {
		String instruction = "slt $ra, $t3, $s0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0170f82a", actualHex);
	}
	@Test
	public void test488() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test489() {
		String instruction = "sub $a1, $t2, $s2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01522822", actualHex);
	}
	@Test
	public void test490() {
		String instruction = "bne $v0, $s4, 0xff86";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1454ff86", actualHex);
	}
	@Test
	public void test491() {
		String instruction = "lui $v0, 0xae";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0200ae", actualHex);
	}
	@Test
	public void test492() {
		String instruction = "ori $a0, $zero, -52";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3404ffcc", actualHex);
	}
	@Test
	public void test493() {
		String instruction = "lw $fp, ($at)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c3e0000", actualHex);
	}
	@Test
	public void test494() {
		String instruction = "slt $fp, $a0, $gp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("009cf02a", actualHex);
	}
	@Test
	public void test495() {
		String instruction = "slt $t3, $a3, $a2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00e6582a", actualHex);
	}
	@Test
	public void test496() {
		String instruction = "sw $s4, 126($t0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad14007e", actualHex);
	}
	@Test
	public void test497() {
		String instruction = "lui $k0, 0x25";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1a0025", actualHex);
	}
	@Test
	public void test498() {
		String instruction = "lw $k1, -232($k1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8f7bff18", actualHex);
	}
	@Test
	public void test499() {
		String instruction = "ori $a1, $s1, -156";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3625ff64", actualHex);
	}
	@Test
	public void test500() {
		String instruction = "j 0xfa";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000fa", actualHex);
	}
	@Test
	public void test501() {
		String instruction = "and $t4, $t2, $a2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01466024", actualHex);
	}
	@Test
	public void test502() {
		String instruction = "sub $s6, $t7, $t0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01e8b022", actualHex);
	}
	@Test
	public void test503() {
		String instruction = "ori $t6, $gp, 134";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("378e0086", actualHex);
	}
	@Test
	public void test504() {
		String instruction = "j 0x8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000008", actualHex);
	}
	@Test
	public void test505() {
		String instruction = "lui $s6, 0xf1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1600f1", actualHex);
	}
	@Test
	public void test506() {
		String instruction = "j 0x4d";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800004d", actualHex);
	}
	@Test
	public void test507() {
		String instruction = "lw $t3, ($t0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8d0b0000", actualHex);
	}
	@Test
	public void test508() {
		String instruction = "lui $t2, 0x6d";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0a006d", actualHex);
	}
	@Test
	public void test509() {
		String instruction = "sub $s4, $v1, $t6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("006ea022", actualHex);
	}
	@Test
	public void test510() {
		String instruction = "beq $s3, $t9, 0x31";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("12790031", actualHex);
	}
	@Test
	public void test511() {
		String instruction = "sub $t6, $t4, $t0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01887022", actualHex);
	}
	@Test
	public void test512() {
		String instruction = "bne $s6, $s2, 164";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("16d200a4", actualHex);
	}
	@Test
	public void test513() {
		String instruction = "ori $v0, $sp, 0xb3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("37a200b3", actualHex);
	}
	@Test
	public void test514() {
		String instruction = "bne $s7, $v0, -20";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("16e2ffec", actualHex);
	}
	@Test
	public void test515() {
		String instruction = "bne $v0, $s7, -155";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1457ff65", actualHex);
	}
	@Test
	public void test516() {
		String instruction = "sub $t0, $zero, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("000d4022", actualHex);
	}
	@Test
	public void test517() {
		String instruction = "sub $s7, $a3, $s3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00f3b822", actualHex);
	}
	@Test
	public void test518() {
		String instruction = "lui $s1, 0xd5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1100d5", actualHex);
	}
	@Test
	public void test519() {
		String instruction = "addiu $a1, $s1, 0x6c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("2625006c", actualHex);
	}
	@Test
	public void test520() {
		String instruction = "sw $ra, ($t9)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af3f0000", actualHex);
	}
	@Test
	public void test521() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test522() {
		String instruction = "j 0x61";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000061", actualHex);
	}
	@Test
	public void test523() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test524() {
		String instruction = "add $s2, $t0, $s2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01129020", actualHex);
	}
	@Test
	public void test525() {
		String instruction = "j 0x3c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800003c", actualHex);
	}
	@Test
	public void test526() {
		String instruction = "andi $s6, $t4, 148";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("31960094", actualHex);
	}
	@Test
	public void test527() {
		String instruction = "or $s5, $a3, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00f5a825", actualHex);
	}
	@Test
	public void test528() {
		String instruction = "lw $s4, -147($at)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c34ff6d", actualHex);
	}
	@Test
	public void test529() {
		String instruction = "and $a2, $t4, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("019a3024", actualHex);
	}
	@Test
	public void test530() {
		String instruction = "add $t7, $ra, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03e77820", actualHex);
	}
	@Test
	public void test531() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test532() {
		String instruction = "lw $s3, -17($t7)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8df3ffef", actualHex);
	}
	@Test
	public void test533() {
		String instruction = "beq $s1, $s5, 0xff2c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1235ff2c", actualHex);
	}
	@Test
	public void test534() {
		String instruction = "sub $s5, $zero, $gp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("001ca822", actualHex);
	}
	@Test
	public void test535() {
		String instruction = "lui $a3, 0x5b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c07005b", actualHex);
	}
	@Test
	public void test536() {
		String instruction = "sw $a1, -209($a0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac85ff2f", actualHex);
	}
	@Test
	public void test537() {
		String instruction = "lui $s2, 0x8b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c12008b", actualHex);
	}
	@Test
	public void test538() {
		String instruction = "and $v1, $t9, $t6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("032e1824", actualHex);
	}
	@Test
	public void test539() {
		String instruction = "add $t9, $k1, $t0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0368c820", actualHex);
	}
	@Test
	public void test540() {
		String instruction = "slt $s3, $s5, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02be982a", actualHex);
	}
	@Test
	public void test541() {
		String instruction = "lw $k0, ($fp)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8fda0000", actualHex);
	}
	@Test
	public void test542() {
		String instruction = "ori $t9, $s6, -198";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36d9ff3a", actualHex);
	}
	@Test
	public void test543() {
		String instruction = "j 0xec";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000ec", actualHex);
	}
	@Test
	public void test544() {
		String instruction = "beq $t3, $s6, -78";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1176ffb2", actualHex);
	}
	@Test
	public void test545() {
		String instruction = "sw $t1, 217($a2)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("acc900d9", actualHex);
	}
	@Test
	public void test546() {
		String instruction = "bne $a3, $v1, -60";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("14e3ffc4", actualHex);
	}
	@Test
	public void test547() {
		String instruction = "addiu $s5, $s5, 74";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26b5004a", actualHex);
	}
	@Test
	public void test548() {
		String instruction = "sw $sp, ($a3)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("acfd0000", actualHex);
	}
	@Test
	public void test549() {
		String instruction = "or $t2, $s1, $t7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("022f5025", actualHex);
	}
	@Test
	public void test550() {
		String instruction = "j 0x31";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000031", actualHex);
	}
	@Test
	public void test551() {
		String instruction = "or $s0, $v1, $ra";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("007f8025", actualHex);
	}
	@Test
	public void test552() {
		String instruction = "lui $t3, 0x8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0b0008", actualHex);
	}
	@Test
	public void test553() {
		String instruction = "ori $s1, $s1, 0xf6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("363100f6", actualHex);
	}
	@Test
	public void test554() {
		String instruction = "and $s3, $a0, $t3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("008b9824", actualHex);
	}
	@Test
	public void test555() {
		String instruction = "slt $k0, $a3, $v1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00e3d02a", actualHex);
	}
	@Test
	public void test556() {
		String instruction = "and $k0, $k1, $s3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0373d024", actualHex);
	}
	@Test
	public void test557() {
		String instruction = "sw $a0, 231($a0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac8400e7", actualHex);
	}
	@Test
	public void test558() {
		String instruction = "slt $s5, $s7, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02e7a82a", actualHex);
	}
	@Test
	public void test559() {
		String instruction = "andi $t2, $ra, 233";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("33ea00e9", actualHex);
	}
	@Test
	public void test560() {
		String instruction = "ori $t4, $t8, 0x5b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("370c005b", actualHex);
	}
	@Test
	public void test561() {
		String instruction = "ori $s4, $a1, -215";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("34b4ff29", actualHex);
	}
	@Test
	public void test562() {
		String instruction = "addiu $fp, $t5, 95";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("25be005f", actualHex);
	}
	@Test
	public void test563() {
		String instruction = "and $fp, $t1, $t7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("012ff024", actualHex);
	}
	@Test
	public void test564() {
		String instruction = "sw $t5, ($t4)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad8d0000", actualHex);
	}
	@Test
	public void test565() {
		String instruction = "andi $s7, $s1, -99";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3237ff9d", actualHex);
	}
	@Test
	public void test566() {
		String instruction = "sub $t8, $t0, $sp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("011dc022", actualHex);
	}
	@Test
	public void test567() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test568() {
		String instruction = "addiu $k0, $a3, 0xd2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("24fa00d2", actualHex);
	}
	@Test
	public void test569() {
		String instruction = "andi $at, $t4, 0xc";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3181000c", actualHex);
	}
	@Test
	public void test570() {
		String instruction = "add $a0, $v1, $a0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00642020", actualHex);
	}
	@Test
	public void test571() {
		String instruction = "ori $gp, $a1, 166";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("34bc00a6", actualHex);
	}
	@Test
	public void test572() {
		String instruction = "sub $s3, $at, $gp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("003c9822", actualHex);
	}
	@Test
	public void test573() {
		String instruction = "ori $t4, $s5, -256";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36acff00", actualHex);
	}
	@Test
	public void test574() {
		String instruction = "sw $s6, ($s3)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ae760000", actualHex);
	}
	@Test
	public void test575() {
		String instruction = "beq $sp, $t0, 167";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("13a800a7", actualHex);
	}
	@Test
	public void test576() {
		String instruction = "j 0x26";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000026", actualHex);
	}
	@Test
	public void test577() {
		String instruction = "sw $sp, ($t6)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("addd0000", actualHex);
	}
	@Test
	public void test578() {
		String instruction = "bne $s0, $a3, -238";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1607ff12", actualHex);
	}
	@Test
	public void test579() {
		String instruction = "and $s6, $t8, $zero";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0300b024", actualHex);
	}
	@Test
	public void test580() {
		String instruction = "or $a3, $s2, $t6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("024e3825", actualHex);
	}
	@Test
	public void test581() {
		String instruction = "addiu $s4, $v1, 164";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("247400a4", actualHex);
	}
	@Test
	public void test582() {
		String instruction = "addiu $s2, $a2, 45";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("24d2002d", actualHex);
	}
	@Test
	public void test583() {
		String instruction = "sw $a3, 94($k1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af67005e", actualHex);
	}
	@Test
	public void test584() {
		String instruction = "slt $s2, $zero, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0007902a", actualHex);
	}
	@Test
	public void test585() {
		String instruction = "ori $k1, $s6, -112";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36dbff90", actualHex);
	}
	@Test
	public void test586() {
		String instruction = "beq $ra, $fp, 0xffa9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("13feffa9", actualHex);
	}
	@Test
	public void test587() {
		String instruction = "ori $sp, $sp, 139";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("37bd008b", actualHex);
	}
	@Test
	public void test588() {
		String instruction = "add $t9, $s4, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0299c820", actualHex);
	}
	@Test
	public void test589() {
		String instruction = "ori $v0, $at, 0xc5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("342200c5", actualHex);
	}
	@Test
	public void test590() {
		String instruction = "beq $zero, $t3, 0xdf";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("100b00df", actualHex);
	}
	@Test
	public void test591() {
		String instruction = "bne $t5, $t4, 0xffbd";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("15acffbd", actualHex);
	}
	@Test
	public void test592() {
		String instruction = "j 0x49";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000049", actualHex);
	}
	@Test
	public void test593() {
		String instruction = "and $a0, $zero, $zero";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00002024", actualHex);
	}
	@Test
	public void test594() {
		String instruction = "lw $v1, ($t5)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8da30000", actualHex);
	}
	@Test
	public void test595() {
		String instruction = "or $a1, $s3, $v0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02622825", actualHex);
	}
	@Test
	public void test596() {
		String instruction = "ori $t1, $s0, -254";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3609ff02", actualHex);
	}
	@Test
	public void test597() {
		String instruction = "ori $t4, $t1, 74";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("352c004a", actualHex);
	}
	@Test
	public void test598() {
		String instruction = "lw $t2, 8($zero)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c0a0008", actualHex);
	}
	@Test
	public void test599() {
		String instruction = "sub $t6, $a2, $t3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00cb7022", actualHex);
	}
	@Test
	public void test600() {
		String instruction = "ori $v0, $t0, 0xffb8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3502ffb8", actualHex);
	}
	@Test
	public void test601() {
		String instruction = "lw $s7, 129($t1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8d370081", actualHex);
	}
	@Test
	public void test602() {
		String instruction = "addiu $s0, $zero, 0x57";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("24100057", actualHex);
	}
	@Test
	public void test603() {
		String instruction = "lui $s4, 0xc4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1400c4", actualHex);
	}
	@Test
	public void test604() {
		String instruction = "addiu $t8, $ra, 0x8c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("27f8008c", actualHex);
	}
	@Test
	public void test605() {
		String instruction = "ori $a1, $t3, 0xffdc";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3565ffdc", actualHex);
	}
	@Test
	public void test606() {
		String instruction = "lui $fp, 0x54";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1e0054", actualHex);
	}
	@Test
	public void test607() {
		String instruction = "add $k1, $at, $s4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0034d820", actualHex);
	}
	@Test
	public void test608() {
		String instruction = "ori $t8, $t4, -39";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3598ffd9", actualHex);
	}
	@Test
	public void test609() {
		String instruction = "sw $t9, 41($t8)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af190029", actualHex);
	}
	@Test
	public void test610() {
		String instruction = "sub $t5, $t1, $gp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("013c6822", actualHex);
	}
	@Test
	public void test611() {
		String instruction = "j 0xb1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000b1", actualHex);
	}
	@Test
	public void test612() {
		String instruction = "ori $a1, $t8, 0xff07";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3705ff07", actualHex);
	}
	@Test
	public void test613() {
		String instruction = "lui $a2, 0x88";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c060088", actualHex);
	}
	@Test
	public void test614() {
		String instruction = "and $v1, $t0, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01071824", actualHex);
	}
	@Test
	public void test615() {
		String instruction = "addiu $t5, $k0, 127";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("274d007f", actualHex);
	}
	@Test
	public void test616() {
		String instruction = "lw $t5, ($zero)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c0d0000", actualHex);
	}
	@Test
	public void test617() {
		String instruction = "sw $ra, 97($t8)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af1f0061", actualHex);
	}
	@Test
	public void test618() {
		String instruction = "andi $at, $s7, -36";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("32e1ffdc", actualHex);
	}
	@Test
	public void test619() {
		String instruction = "or $t5, $at, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("003a6825", actualHex);
	}
	@Test
	public void test620() {
		String instruction = "andi $ra, $v0, 0xff60";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("305fff60", actualHex);
	}
	@Test
	public void test621() {
		String instruction = "beq $a2, $v0, 0xff87";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("10c2ff87", actualHex);
	}
	@Test
	public void test622() {
		String instruction = "lw $gp, 50($a2)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8cdc0032", actualHex);
	}
	@Test
	public void test623() {
		String instruction = "j 0x7e";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800007e", actualHex);
	}
	@Test
	public void test624() {
		String instruction = "add $a1, $s0, $t6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("020e2820", actualHex);
	}
	@Test
	public void test625() {
		String instruction = "addiu $sp, $t1, 0x1c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("253d001c", actualHex);
	}
	@Test
	public void test626() {
		String instruction = "lui $k1, 0xfa";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1b00fa", actualHex);
	}
	@Test
	public void test627() {
		String instruction = "j 0xb8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000b8", actualHex);
	}
	@Test
	public void test628() {
		String instruction = "j 0x93";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000093", actualHex);
	}
	@Test
	public void test629() {
		String instruction = "add $v0, $s4, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("029a1020", actualHex);
	}
	@Test
	public void test630() {
		String instruction = "or $s0, $t0, $sp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("011d8025", actualHex);
	}
	@Test
	public void test631() {
		String instruction = "bne $fp, $a3, 135";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("17c70087", actualHex);
	}
	@Test
	public void test632() {
		String instruction = "sw $s5, ($t4)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad950000", actualHex);
	}
	@Test
	public void test633() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test634() {
		String instruction = "or $a0, $a1, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00b52025", actualHex);
	}
	@Test
	public void test635() {
		String instruction = "andi $k1, $t6, 0xff4b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("31dbff4b", actualHex);
	}
	@Test
	public void test636() {
		String instruction = "lui $t9, 0xd7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1900d7", actualHex);
	}
	@Test
	public void test637() {
		String instruction = "lw $k1, ($s3)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8e7b0000", actualHex);
	}
	@Test
	public void test638() {
		String instruction = "addiu $t9, $t2, 0xfb";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("255900fb", actualHex);
	}
	@Test
	public void test639() {
		String instruction = "sw $ra, ($at)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac3f0000", actualHex);
	}
	@Test
	public void test640() {
		String instruction = "j 0xad";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000ad", actualHex);
	}
	@Test
	public void test641() {
		String instruction = "slt $gp, $t1, $zero";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0120e02a", actualHex);
	}
	@Test
	public void test642() {
		String instruction = "sw $t7, ($at)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac2f0000", actualHex);
	}
	@Test
	public void test643() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test644() {
		String instruction = "lui $a3, 0x72";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c070072", actualHex);
	}
	@Test
	public void test645() {
		String instruction = "add $s3, $a2, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00de9820", actualHex);
	}
	@Test
	public void test646() {
		String instruction = "or $zero, $t6, $s2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01d20025", actualHex);
	}
	@Test
	public void test647() {
		String instruction = "slt $a3, $at, $t7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("002f382a", actualHex);
	}
	@Test
	public void test648() {
		String instruction = "beq $t1, $t0, 0xff1d";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1128ff1d", actualHex);
	}
	@Test
	public void test649() {
		String instruction = "j 0x43";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000043", actualHex);
	}
	@Test
	public void test650() {
		String instruction = "beq $v1, $at, 74";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1061004a", actualHex);
	}
	@Test
	public void test651() {
		String instruction = "slt $a1, $s6, $s1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02d1282a", actualHex);
	}
	@Test
	public void test652() {
		String instruction = "lw $v0, ($s6)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8ec20000", actualHex);
	}
	@Test
	public void test653() {
		String instruction = "ori $a3, $zero, 0xe3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("340700e3", actualHex);
	}
	@Test
	public void test654() {
		String instruction = "bne $s5, $t3, -157";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("16abff63", actualHex);
	}
	@Test
	public void test655() {
		String instruction = "j 0xb9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000b9", actualHex);
	}
	@Test
	public void test656() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test657() {
		String instruction = "lw $v1, -218($k1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8f63ff26", actualHex);
	}
	@Test
	public void test658() {
		String instruction = "addiu $t3, $s0, 0x3c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("260b003c", actualHex);
	}
	@Test
	public void test659() {
		String instruction = "addiu $v1, $s1, 0x1b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("2623001b", actualHex);
	}
	@Test
	public void test660() {
		String instruction = "add $a2, $s0, $v0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02023020", actualHex);
	}
	@Test
	public void test661() {
		String instruction = "sub $t0, $a2, $sp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00dd4022", actualHex);
	}
	@Test
	public void test662() {
		String instruction = "and $s4, $s1, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0227a024", actualHex);
	}
	@Test
	public void test663() {
		String instruction = "ori $s6, $s6, 36";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36d60024", actualHex);
	}
	@Test
	public void test664() {
		String instruction = "addiu $sp, $t7, 4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("25fd0004", actualHex);
	}
	@Test
	public void test665() {
		String instruction = "andi $s6, $a3, 0xff99";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("30f6ff99", actualHex);
	}
	@Test
	public void test666() {
		String instruction = "andi $t9, $s0, 0x94";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("32190094", actualHex);
	}
	@Test
	public void test667() {
		String instruction = "j 0x21";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000021", actualHex);
	}
	@Test
	public void test668() {
		String instruction = "and $a0, $t3, $t8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01782024", actualHex);
	}
	@Test
	public void test669() {
		String instruction = "or $t3, $t6, $t2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01ca5825", actualHex);
	}
	@Test
	public void test670() {
		String instruction = "add $gp, $t7, $at";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01e1e020", actualHex);
	}
	@Test
	public void test671() {
		String instruction = "sw $ra, ($k1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af7f0000", actualHex);
	}
	@Test
	public void test672() {
		String instruction = "addiu $t3, $t4, 0x2f";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("258b002f", actualHex);
	}
	@Test
	public void test673() {
		String instruction = "add $s7, $t7, $s6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01f6b820", actualHex);
	}
	@Test
	public void test674() {
		String instruction = "addiu $t6, $at, 0xf6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("242e00f6", actualHex);
	}
	@Test
	public void test675() {
		String instruction = "sw $a2, 76($a3)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ace6004c", actualHex);
	}
	@Test
	public void test676() {
		String instruction = "addiu $t8, $zero, 0xaf";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("241800af", actualHex);
	}
	@Test
	public void test677() {
		String instruction = "lui $fp, 0x6d";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1e006d", actualHex);
	}
	@Test
	public void test678() {
		String instruction = "and $t0, $a3, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00fa4024", actualHex);
	}
	@Test
	public void test679() {
		String instruction = "or $s1, $s7, $a1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02e58825", actualHex);
	}
	@Test
	public void test680() {
		String instruction = "j 0xdc";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000dc", actualHex);
	}
	@Test
	public void test681() {
		String instruction = "addiu $t3, $v0, 167";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("244b00a7", actualHex);
	}
	@Test
	public void test682() {
		String instruction = "add $t4, $a1, $t6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00ae6020", actualHex);
	}
	@Test
	public void test683() {
		String instruction = "add $s7, $s5, $t0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02a8b820", actualHex);
	}
	@Test
	public void test684() {
		String instruction = "lui $a0, 0xa3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0400a3", actualHex);
	}
	@Test
	public void test685() {
		String instruction = "sub $k1, $t3, $k1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("017bd822", actualHex);
	}
	@Test
	public void test686() {
		String instruction = "add $s3, $t4, $k1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("019b9820", actualHex);
	}
	@Test
	public void test687() {
		String instruction = "lw $ra, ($k0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8f5f0000", actualHex);
	}
	@Test
	public void test688() {
		String instruction = "bne $t9, $at, 0xffad";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1721ffad", actualHex);
	}
	@Test
	public void test689() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test690() {
		String instruction = "lw $a0, -231($a0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c84ff19", actualHex);
	}
	@Test
	public void test691() {
		String instruction = "sub $at, $at, $zero";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00200822", actualHex);
	}
	@Test
	public void test692() {
		String instruction = "addiu $t3, $at, 90";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("242b005a", actualHex);
	}
	@Test
	public void test693() {
		String instruction = "sw $v0, 169($a3)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ace200a9", actualHex);
	}
	@Test
	public void test694() {
		String instruction = "beq $t8, $t9, 0xfffe";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1319fffe", actualHex);
	}
	@Test
	public void test695() {
		String instruction = "addiu $t3, $v0, 117";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("244b0075", actualHex);
	}
	@Test
	public void test696() {
		String instruction = "sub $s5, $s5, $gp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02bca822", actualHex);
	}
	@Test
	public void test697() {
		String instruction = "slt $sp, $a3, $at";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00e1e82a", actualHex);
	}
	@Test
	public void test698() {
		String instruction = "sub $s4, $k0, $s7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0357a022", actualHex);
	}
	@Test
	public void test699() {
		String instruction = "andi $t8, $k1, 0xff20";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3378ff20", actualHex);
	}
	@Test
	public void test700() {
		String instruction = "sw $v1, ($gp)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af830000", actualHex);
	}
	@Test
	public void test701() {
		String instruction = "add $t8, $t7, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01fac020", actualHex);
	}
	@Test
	public void test702() {
		String instruction = "lui $s4, 0xde";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1400de", actualHex);
	}
	@Test
	public void test703() {
		String instruction = "add $s5, $sp, $v1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03a3a820", actualHex);
	}
	@Test
	public void test704() {
		String instruction = "and $v0, $t7, $sp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01fd1024", actualHex);
	}
	@Test
	public void test705() {
		String instruction = "and $a3, $s0, $t0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02083824", actualHex);
	}
	@Test
	public void test706() {
		String instruction = "j 0xed";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000ed", actualHex);
	}
	@Test
	public void test707() {
		String instruction = "addiu $a2, $t6, 24";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("25c60018", actualHex);
	}
	@Test
	public void test708() {
		String instruction = "beq $s3, $t8, 0x8d";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1278008d", actualHex);
	}
	@Test
	public void test709() {
		String instruction = "sw $at, -204($t8)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af01ff34", actualHex);
	}
	@Test
	public void test710() {
		String instruction = "add $a2, $t9, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03353020", actualHex);
	}
	@Test
	public void test711() {
		String instruction = "j 0xe1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000e1", actualHex);
	}
	@Test
	public void test712() {
		String instruction = "sub $a0, $t5, $t7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01af2022", actualHex);
	}
	@Test
	public void test713() {
		String instruction = "beq $s5, $s6, 0x67";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("12b60067", actualHex);
	}
	@Test
	public void test714() {
		String instruction = "j 0xe3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000e3", actualHex);
	}
	@Test
	public void test715() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test716() {
		String instruction = "beq $gp, $t3, 0xffc7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("138bffc7", actualHex);
	}
	@Test
	public void test717() {
		String instruction = "slt $t5, $t6, $t8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01d8682a", actualHex);
	}
	@Test
	public void test718() {
		String instruction = "ori $t8, $s4, -205";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3698ff33", actualHex);
	}
	@Test
	public void test719() {
		String instruction = "lui $ra, 0x13";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1f0013", actualHex);
	}
	@Test
	public void test720() {
		String instruction = "or $a0, $t7, $gp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01fc2025", actualHex);
	}
	@Test
	public void test721() {
		String instruction = "add $s7, $s2, $s4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0254b820", actualHex);
	}
	@Test
	public void test722() {
		String instruction = "and $t5, $t7, $v0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01e26824", actualHex);
	}
	@Test
	public void test723() {
		String instruction = "lw $t5, 34($a2)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8ccd0022", actualHex);
	}
	@Test
	public void test724() {
		String instruction = "beq $s5, $t3, 109";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("12ab006d", actualHex);
	}
	@Test
	public void test725() {
		String instruction = "and $fp, $s7, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02fef024", actualHex);
	}
	@Test
	public void test726() {
		String instruction = "j 0xf";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800000f", actualHex);
	}
	@Test
	public void test727() {
		String instruction = "lw $t4, 69($s2)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8e4c0045", actualHex);
	}
	@Test
	public void test728() {
		String instruction = "lw $k1, ($s6)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8edb0000", actualHex);
	}
	@Test
	public void test729() {
		String instruction = "add $ra, $a0, $zero";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0080f820", actualHex);
	}
	@Test
	public void test730() {
		String instruction = "ori $t3, $a1, 0x60";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("34ab0060", actualHex);
	}
	@Test
	public void test731() {
		String instruction = "and $at, $t4, $s7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01970824", actualHex);
	}
	@Test
	public void test732() {
		String instruction = "add $s4, $at, $s3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0033a020", actualHex);
	}
	@Test
	public void test733() {
		String instruction = "addiu $s1, $s7, 199";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26f100c7", actualHex);
	}
	@Test
	public void test734() {
		String instruction = "bne $a0, $a1, 79";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1485004f", actualHex);
	}
	@Test
	public void test735() {
		String instruction = "or $k0, $s3, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("027ad025", actualHex);
	}
	@Test
	public void test736() {
		String instruction = "add $v0, $t9, $s1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03311020", actualHex);
	}
	@Test
	public void test737() {
		String instruction = "bne $sp, $s2, -214";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("17b2ff2a", actualHex);
	}
	@Test
	public void test738() {
		String instruction = "beq $t7, $t1, 0xff0d";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("11e9ff0d", actualHex);
	}
	@Test
	public void test739() {
		String instruction = "sub $v0, $t2, $s2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01521022", actualHex);
	}
	@Test
	public void test740() {
		String instruction = "slt $t5, $s1, $v1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0223682a", actualHex);
	}
	@Test
	public void test741() {
		String instruction = "lui $t1, 0x58";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c090058", actualHex);
	}
	@Test
	public void test742() {
		String instruction = "addiu $v1, $fp, 199";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("27c300c7", actualHex);
	}
	@Test
	public void test743() {
		String instruction = "addiu $t6, $t0, 0x42";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("250e0042", actualHex);
	}
	@Test
	public void test744() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test745() {
		String instruction = "beq $at, $t2, 0x22";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("102a0022", actualHex);
	}
	@Test
	public void test746() {
		String instruction = "sw $zero, 175($t8)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af0000af", actualHex);
	}
	@Test
	public void test747() {
		String instruction = "slt $sp, $s3, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0279e82a", actualHex);
	}
	@Test
	public void test748() {
		String instruction = "sw $s3, -250($a1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("acb3ff06", actualHex);
	}
	@Test
	public void test749() {
		String instruction = "slt $k1, $at, $s3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0033d82a", actualHex);
	}
	@Test
	public void test750() {
		String instruction = "slt $s2, $a3, $a0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00e4902a", actualHex);
	}
	@Test
	public void test751() {
		String instruction = "bne $t4, $k0, 62";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("159a003e", actualHex);
	}
	@Test
	public void test752() {
		String instruction = "andi $k1, $t0, 0x5c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("311b005c", actualHex);
	}
	@Test
	public void test753() {
		String instruction = "bne $t6, $v0, 0xfff9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("15c2fff9", actualHex);
	}
	@Test
	public void test754() {
		String instruction = "or $at, $a1, $t1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00a90825", actualHex);
	}
	@Test
	public void test755() {
		String instruction = "sw $t2, 69($v1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac6a0045", actualHex);
	}
	@Test
	public void test756() {
		String instruction = "ori $t7, $sp, 0xfff5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("37affff5", actualHex);
	}
	@Test
	public void test757() {
		String instruction = "andi $s1, $at, 0xffc9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3031ffc9", actualHex);
	}
	@Test
	public void test758() {
		String instruction = "beq $t9, $s5, 0xda";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("133500da", actualHex);
	}
	@Test
	public void test759() {
		String instruction = "bne $s5, $t9, 97";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("16b90061", actualHex);
	}
	@Test
	public void test760() {
		String instruction = "lw $s6, ($v0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c560000", actualHex);
	}
	@Test
	public void test761() {
		String instruction = "slt $a0, $t8, $s6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0316202a", actualHex);
	}
	@Test
	public void test762() {
		String instruction = "slt $zero, $s0, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("020d002a", actualHex);
	}
	@Test
	public void test763() {
		String instruction = "or $s3, $t2, $t3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("014b9825", actualHex);
	}
	@Test
	public void test764() {
		String instruction = "sub $a3, $zero, $a2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00063822", actualHex);
	}
	@Test
	public void test765() {
		String instruction = "sw $t8, ($a2)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("acd80000", actualHex);
	}
	@Test
	public void test766() {
		String instruction = "j 0xd7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000d7", actualHex);
	}
	@Test
	public void test767() {
		String instruction = "andi $t1, $s6, 0xfff4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("32c9fff4", actualHex);
	}
	@Test
	public void test768() {
		String instruction = "sw $ra, -37($t3)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad7fffdb", actualHex);
	}
	@Test
	public void test769() {
		String instruction = "or $s2, $t5, $t1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01a99025", actualHex);
	}
	@Test
	public void test770() {
		String instruction = "sw $a3, ($zero)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac070000", actualHex);
	}
	@Test
	public void test771() {
		String instruction = "sub $k0, $t3, $ra";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("017fd022", actualHex);
	}
	@Test
	public void test772() {
		String instruction = "or $s7, $t3, $s6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0176b825", actualHex);
	}
	@Test
	public void test773() {
		String instruction = "bne $t6, $ra, 0xae";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("15df00ae", actualHex);
	}
	@Test
	public void test774() {
		String instruction = "or $s3, $t9, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("033a9825", actualHex);
	}
	@Test
	public void test775() {
		String instruction = "bne $sp, $s2, 0xffed";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("17b2ffed", actualHex);
	}
	@Test
	public void test776() {
		String instruction = "addiu $s2, $t6, 0x29";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("25d20029", actualHex);
	}
	@Test
	public void test777() {
		String instruction = "andi $k1, $s4, -218";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("329bff26", actualHex);
	}
	@Test
	public void test778() {
		String instruction = "addiu $gp, $fp, 0xb1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("27dc00b1", actualHex);
	}
	@Test
	public void test779() {
		String instruction = "sw $zero, ($a2)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("acc00000", actualHex);
	}
	@Test
	public void test780() {
		String instruction = "lw $s3, ($a1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8cb30000", actualHex);
	}
	@Test
	public void test781() {
		String instruction = "sw $a3, ($t3)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ad670000", actualHex);
	}
	@Test
	public void test782() {
		String instruction = "lui $at, 0x80";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c010080", actualHex);
	}
	@Test
	public void test783() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test784() {
		String instruction = "sub $t7, $k1, $s2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03727822", actualHex);
	}
	@Test
	public void test785() {
		String instruction = "bne $k0, $t7, 0x6f";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("174f006f", actualHex);
	}
	@Test
	public void test786() {
		String instruction = "lui $k0, 0x94";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1a0094", actualHex);
	}
	@Test
	public void test787() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test788() {
		String instruction = "slt $s3, $t8, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0315982a", actualHex);
	}
	@Test
	public void test789() {
		String instruction = "beq $ra, $t3, 0x2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("13eb0002", actualHex);
	}
	@Test
	public void test790() {
		String instruction = "beq $at, $k1, 209";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("103b00d1", actualHex);
	}
	@Test
	public void test791() {
		String instruction = "lw $k1, ($at)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c3b0000", actualHex);
	}
	@Test
	public void test792() {
		String instruction = "and $t0, $k0, $s6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03564024", actualHex);
	}
	@Test
	public void test793() {
		String instruction = "andi $t0, $t5, 0x1b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("31a8001b", actualHex);
	}
	@Test
	public void test794() {
		String instruction = "lui $t9, 0xb1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1900b1", actualHex);
	}
	@Test
	public void test795() {
		String instruction = "or $sp, $s0, $t0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0208e825", actualHex);
	}
	@Test
	public void test796() {
		String instruction = "addiu $t4, $t7, 0x95";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("25ec0095", actualHex);
	}
	@Test
	public void test797() {
		String instruction = "and $t9, $t9, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0327c824", actualHex);
	}
	@Test
	public void test798() {
		String instruction = "sub $s2, $t8, $t8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03189022", actualHex);
	}
	@Test
	public void test799() {
		String instruction = "andi $t3, $k0, 0x3e";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("334b003e", actualHex);
	}
	@Test
	public void test800() {
		String instruction = "bne $s4, $t4, 16";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("168c0010", actualHex);
	}
	@Test
	public void test801() {
		String instruction = "lui $t7, 0x9c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0f009c", actualHex);
	}
	@Test
	public void test802() {
		String instruction = "beq $ra, $k1, -34";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("13fbffde", actualHex);
	}
	@Test
	public void test803() {
		String instruction = "andi $a1, $s5, 0xb2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("32a500b2", actualHex);
	}
	@Test
	public void test804() {
		String instruction = "and $t2, $t8, $ra";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("031f5024", actualHex);
	}
	@Test
	public void test805() {
		String instruction = "lui $v0, 0xac";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0200ac", actualHex);
	}
	@Test
	public void test806() {
		String instruction = "sw $s4, ($v1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac740000", actualHex);
	}
	@Test
	public void test807() {
		String instruction = "lw $fp, 139($t7)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8dfe008b", actualHex);
	}
	@Test
	public void test808() {
		String instruction = "or $s5, $t9, $s7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0337a825", actualHex);
	}
	@Test
	public void test809() {
		String instruction = "j 0xcf";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000cf", actualHex);
	}
	@Test
	public void test810() {
		String instruction = "sw $v1, ($k0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af430000", actualHex);
	}
	@Test
	public void test811() {
		String instruction = "lw $k0, -183($t0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8d1aff49", actualHex);
	}
	@Test
	public void test812() {
		String instruction = "beq $ra, $a0, -231";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("13e4ff19", actualHex);
	}
	@Test
	public void test813() {
		String instruction = "add $s4, $t1, $zero";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0120a020", actualHex);
	}
	@Test
	public void test814() {
		String instruction = "ori $k0, $s4, -75";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("369affb5", actualHex);
	}
	@Test
	public void test815() {
		String instruction = "beq $k1, $t3, 192";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("136b00c0", actualHex);
	}
	@Test
	public void test816() {
		String instruction = "sub $t6, $s7, $t4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02ec7022", actualHex);
	}
	@Test
	public void test817() {
		String instruction = "beq $t9, $t9, 91";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1339005b", actualHex);
	}
	@Test
	public void test818() {
		String instruction = "and $t2, $t4, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01875024", actualHex);
	}
	@Test
	public void test819() {
		String instruction = "beq $s4, $a2, 0xff4c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1286ff4c", actualHex);
	}
	@Test
	public void test820() {
		String instruction = "or $gp, $fp, $t6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03cee025", actualHex);
	}
	@Test
	public void test821() {
		String instruction = "ori $a0, $t8, 0x93";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("37040093", actualHex);
	}
	@Test
	public void test822() {
		String instruction = "add $fp, $s0, $s7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0217f020", actualHex);
	}
	@Test
	public void test823() {
		String instruction = "sw $s4, -171($k1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af74ff55", actualHex);
	}
	@Test
	public void test824() {
		String instruction = "sub $v1, $a1, $zero";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00a01822", actualHex);
	}
	@Test
	public void test825() {
		String instruction = "lw $s7, ($zero)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c170000", actualHex);
	}
	@Test
	public void test826() {
		String instruction = "lui $at, 0xb6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0100b6", actualHex);
	}
	@Test
	public void test827() {
		String instruction = "bne $t2, $t9, 0xffa6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1559ffa6", actualHex);
	}
	@Test
	public void test828() {
		String instruction = "add $s2, $s5, $s4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02b49020", actualHex);
	}
	@Test
	public void test829() {
		String instruction = "j 0x36";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000036", actualHex);
	}
	@Test
	public void test830() {
		String instruction = "lui $k0, 0xe6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1a00e6", actualHex);
	}
	@Test
	public void test831() {
		String instruction = "or $v1, $s6, $t8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02d81825", actualHex);
	}
	@Test
	public void test832() {
		String instruction = "or $k0, $s4, $s2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0292d025", actualHex);
	}
	@Test
	public void test833() {
		String instruction = "add $t7, $fp, $sp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03dd7820", actualHex);
	}
	@Test
	public void test834() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test835() {
		String instruction = "lui $t2, 0x7a";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0a007a", actualHex);
	}
	@Test
	public void test836() {
		String instruction = "bne $s2, $t5, 0xff57";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("164dff57", actualHex);
	}
	@Test
	public void test837() {
		String instruction = "add $zero, $a3, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00ed0020", actualHex);
	}
	@Test
	public void test838() {
		String instruction = "and $t1, $s0, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02074824", actualHex);
	}
	@Test
	public void test839() {
		String instruction = "sw $s1, ($v1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac710000", actualHex);
	}
	@Test
	public void test840() {
		String instruction = "slt $s7, $t4, $gp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("019cb82a", actualHex);
	}
	@Test
	public void test841() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test842() {
		String instruction = "lw $t8, ($s7)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8ef80000", actualHex);
	}
	@Test
	public void test843() {
		String instruction = "sw $s5, ($sp)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("afb50000", actualHex);
	}
	@Test
	public void test844() {
		String instruction = "and $a1, $at, $t2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("002a2824", actualHex);
	}
	@Test
	public void test845() {
		String instruction = "and $a1, $t9, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("032d2824", actualHex);
	}
	@Test
	public void test846() {
		String instruction = "and $gp, $t8, $t1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0309e024", actualHex);
	}
	@Test
	public void test847() {
		String instruction = "j 0x6a";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800006a", actualHex);
	}
	@Test
	public void test848() {
		String instruction = "addiu $ra, $zero, 243";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("241f00f3", actualHex);
	}
	@Test
	public void test849() {
		String instruction = "beq $t0, $gp, 182";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("111c00b6", actualHex);
	}
	@Test
	public void test850() {
		String instruction = "andi $t6, $s5, 0xff20";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("32aeff20", actualHex);
	}
	@Test
	public void test851() {
		String instruction = "slt $t0, $t5, $sp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01bd402a", actualHex);
	}
	@Test
	public void test852() {
		String instruction = "or $t0, $s6, $a1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02c54025", actualHex);
	}
	@Test
	public void test853() {
		String instruction = "ori $v1, $v0, -158";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3443ff62", actualHex);
	}
	@Test
	public void test854() {
		String instruction = "slt $s3, $a3, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00fe982a", actualHex);
	}
	@Test
	public void test855() {
		String instruction = "lw $a2, ($zero)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c060000", actualHex);
	}
	@Test
	public void test856() {
		String instruction = "and $fp, $s6, $v1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02c3f024", actualHex);
	}
	@Test
	public void test857() {
		String instruction = "j 0x6a";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800006a", actualHex);
	}
	@Test
	public void test858() {
		String instruction = "sw $s0, ($s7)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("aef00000", actualHex);
	}
	@Test
	public void test859() {
		String instruction = "bne $t2, $gp, 0xff37";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("155cff37", actualHex);
	}
	@Test
	public void test860() {
		String instruction = "sub $t3, $a3, $s2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00f25822", actualHex);
	}
	@Test
	public void test861() {
		String instruction = "or $t3, $k1, $t3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("036b5825", actualHex);
	}
	@Test
	public void test862() {
		String instruction = "ori $s4, $t6, 52";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("35d40034", actualHex);
	}
	@Test
	public void test863() {
		String instruction = "lui $v1, 0x7a";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c03007a", actualHex);
	}
	@Test
	public void test864() {
		String instruction = "sw $a1, ($s2)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ae450000", actualHex);
	}
	@Test
	public void test865() {
		String instruction = "beq $t2, $s1, -26";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1151ffe6", actualHex);
	}
	@Test
	public void test866() {
		String instruction = "sw $s1, ($at)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac310000", actualHex);
	}
	@Test
	public void test867() {
		String instruction = "lw $at, ($s1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8e210000", actualHex);
	}
	@Test
	public void test868() {
		String instruction = "lui $v1, 0xf0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c0300f0", actualHex);
	}
	@Test
	public void test869() {
		String instruction = "lw $v0, ($k1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8f620000", actualHex);
	}
	@Test
	public void test870() {
		String instruction = "lui $a0, 0x84";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c040084", actualHex);
	}
	@Test
	public void test871() {
		String instruction = "add $ra, $t4, $v1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0183f820", actualHex);
	}
	@Test
	public void test872() {
		String instruction = "beq $t4, $t3, -245";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("118bff0b", actualHex);
	}
	@Test
	public void test873() {
		String instruction = "and $t2, $t7, $a0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01e45024", actualHex);
	}
	@Test
	public void test874() {
		String instruction = "sw $t9, ($s1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ae390000", actualHex);
	}
	@Test
	public void test875() {
		String instruction = "beq $gp, $t4, 222";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("138c00de", actualHex);
	}
	@Test
	public void test876() {
		String instruction = "andi $sp, $v1, 134";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("307d0086", actualHex);
	}
	@Test
	public void test877() {
		String instruction = "add $t8, $v0, $ra";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("005fc020", actualHex);
	}
	@Test
	public void test878() {
		String instruction = "slt $fp, $s5, $t7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02aff02a", actualHex);
	}
	@Test
	public void test879() {
		String instruction = "addiu $s1, $v1, 0x63";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("24710063", actualHex);
	}
	@Test
	public void test880() {
		String instruction = "and $at, $ra, $a1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03e50824", actualHex);
	}
	@Test
	public void test881() {
		String instruction = "j 0x72";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000072", actualHex);
	}
	@Test
	public void test882() {
		String instruction = "and $at, $t6, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01c70824", actualHex);
	}
	@Test
	public void test883() {
		String instruction = "ori $fp, $ra, 65";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("37fe0041", actualHex);
	}
	@Test
	public void test884() {
		String instruction = "or $t3, $t2, $t4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("014c5825", actualHex);
	}
	@Test
	public void test885() {
		String instruction = "sub $t6, $s4, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02957022", actualHex);
	}
	@Test
	public void test886() {
		String instruction = "andi $gp, $gp, 0x91";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("339c0091", actualHex);
	}
	@Test
	public void test887() {
		String instruction = "slt $sp, $fp, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03c7e82a", actualHex);
	}
	@Test
	public void test888() {
		String instruction = "j 0x46";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000046", actualHex);
	}
	@Test
	public void test889() {
		String instruction = "beq $at, $k1, 0xff36";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("103bff36", actualHex);
	}
	@Test
	public void test890() {
		String instruction = "bne $s6, $ra, 0xff3b";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("16dfff3b", actualHex);
	}
	@Test
	public void test891() {
		String instruction = "sw $s3, ($v1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac730000", actualHex);
	}
	@Test
	public void test892() {
		String instruction = "slt $at, $s0, $t2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("020a082a", actualHex);
	}
	@Test
	public void test893() {
		String instruction = "beq $zero, $s6, 70";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("10160046", actualHex);
	}
	@Test
	public void test894() {
		String instruction = "andi $t1, $s2, 0xfff4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3249fff4", actualHex);
	}
	@Test
	public void test895() {
		String instruction = "sub $zero, $t7, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01f50022", actualHex);
	}
	@Test
	public void test896() {
		String instruction = "beq $s0, $s0, 0xff71";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1210ff71", actualHex);
	}
	@Test
	public void test897() {
		String instruction = "ori $gp, $t4, 0xdd";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("359c00dd", actualHex);
	}
	@Test
	public void test898() {
		String instruction = "j 0xdf";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000df", actualHex);
	}
	@Test
	public void test899() {
		String instruction = "sub $t2, $sp, $at";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03a15022", actualHex);
	}
	@Test
	public void test900() {
		String instruction = "beq $fp, $s3, -245";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("13d3ff0b", actualHex);
	}
	@Test
	public void test901() {
		String instruction = "sub $s2, $t3, $s0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01709022", actualHex);
	}
	@Test
	public void test902() {
		String instruction = "or $zero, $at, $s7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00370025", actualHex);
	}
	@Test
	public void test903() {
		String instruction = "j 0x76";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000076", actualHex);
	}
	@Test
	public void test904() {
		String instruction = "addiu $k1, $a3, 119";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("24fb0077", actualHex);
	}
	@Test
	public void test905() {
		String instruction = "j 0x2a";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800002a", actualHex);
	}
	@Test
	public void test906() {
		String instruction = "j 0xa";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800000a", actualHex);
	}
	@Test
	public void test907() {
		String instruction = "sw $t4, -23($t6)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("adccffe9", actualHex);
	}
	@Test
	public void test908() {
		String instruction = "addiu $s7, $s6, 0x3d";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26d7003d", actualHex);
	}
	@Test
	public void test909() {
		String instruction = "sub $gp, $s4, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("028de022", actualHex);
	}
	@Test
	public void test910() {
		String instruction = "bne $t4, $s1, 0x3c";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1591003c", actualHex);
	}
	@Test
	public void test911() {
		String instruction = "and $t7, $a0, $gp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("009c7824", actualHex);
	}
	@Test
	public void test912() {
		String instruction = "beq $t3, $t7, 0x26";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("116f0026", actualHex);
	}
	@Test
	public void test913() {
		String instruction = "bne $s1, $a0, 0xf3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("162400f3", actualHex);
	}
	@Test
	public void test914() {
		String instruction = "sw $t4, -167($s6)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("aeccff59", actualHex);
	}
	@Test
	public void test915() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test916() {
		String instruction = "or $t0, $s0, $s2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02124025", actualHex);
	}
	@Test
	public void test917() {
		String instruction = "lw $t5, -89($s0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8e0dffa7", actualHex);
	}
	@Test
	public void test918() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test919() {
		String instruction = "slt $s7, $a3, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00f9b82a", actualHex);
	}
	@Test
	public void test920() {
		String instruction = "or $s5, $t3, $t0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0168a825", actualHex);
	}
	@Test
	public void test921() {
		String instruction = "bne $t5, $s2, 0xe8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("15b200e8", actualHex);
	}
	@Test
	public void test922() {
		String instruction = "bne $t6, $t7, 0xf5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("15cf00f5", actualHex);
	}
	@Test
	public void test923() {
		String instruction = "j 0xa5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000a5", actualHex);
	}
	@Test
	public void test924() {
		String instruction = "j 0x70";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000070", actualHex);
	}
	@Test
	public void test925() {
		String instruction = "sub $t8, $a2, $s4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00d4c022", actualHex);
	}
	@Test
	public void test926() {
		String instruction = "addiu $s5, $t6, 0xb0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("25d500b0", actualHex);
	}
	@Test
	public void test927() {
		String instruction = "sub $ra, $s6, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02cdf822", actualHex);
	}
	@Test
	public void test928() {
		String instruction = "beq $a2, $at, 0xcb";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("10c100cb", actualHex);
	}
	@Test
	public void test929() {
		String instruction = "bne $k1, $s0, -216";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1770ff28", actualHex);
	}
	@Test
	public void test930() {
		String instruction = "add $a1, $a0, $v0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00822820", actualHex);
	}
	@Test
	public void test931() {
		String instruction = "or $sp, $a1, $s0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00b0e825", actualHex);
	}
	@Test
	public void test932() {
		String instruction = "bne $v0, $s1, 0xf1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("145100f1", actualHex);
	}
	@Test
	public void test933() {
		String instruction = "beq $v0, $t4, 0xe1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("104c00e1", actualHex);
	}
	@Test
	public void test934() {
		String instruction = "bne $t1, $a3, 0x1e";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1527001e", actualHex);
	}
	@Test
	public void test935() {
		String instruction = "lui $zero, 0x9e";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c00009e", actualHex);
	}
	@Test
	public void test936() {
		String instruction = "and $t8, $k0, $t3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("034bc024", actualHex);
	}
	@Test
	public void test937() {
		String instruction = "lw $zero, ($a2)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8cc00000", actualHex);
	}
	@Test
	public void test938() {
		String instruction = "sw $k0, 217($s0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ae1a00d9", actualHex);
	}
	@Test
	public void test939() {
		String instruction = "j 0x6e";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800006e", actualHex);
	}
	@Test
	public void test940() {
		String instruction = "andi $s6, $s2, 0xf1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("325600f1", actualHex);
	}
	@Test
	public void test941() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test942() {
		String instruction = "or $s0, $s3, $fp";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("027e8025", actualHex);
	}
	@Test
	public void test943() {
		String instruction = "andi $s7, $s5, 0xff";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("32b700ff", actualHex);
	}
	@Test
	public void test944() {
		String instruction = "j 0x42";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000042", actualHex);
	}
	@Test
	public void test945() {
		String instruction = "add $k0, $v1, $t4";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("006cd020", actualHex);
	}
	@Test
	public void test946() {
		String instruction = "lui $s3, 0xf2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c1300f2", actualHex);
	}
	@Test
	public void test947() {
		String instruction = "add $at, $s1, $s7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02370820", actualHex);
	}
	@Test
	public void test948() {
		String instruction = "addiu $s5, $s1, 210";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("263500d2", actualHex);
	}
	@Test
	public void test949() {
		String instruction = "j 0xfe";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000fe", actualHex);
	}
	@Test
	public void test950() {
		String instruction = "or $k0, $t8, $v0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0302d025", actualHex);
	}
	@Test
	public void test951() {
		String instruction = "j 0x50";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("08000050", actualHex);
	}
	@Test
	public void test952() {
		String instruction = "beq $t0, $at, 0xffc8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1101ffc8", actualHex);
	}
	@Test
	public void test953() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test954() {
		String instruction = "add $at, $s3, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("026d0820", actualHex);
	}
	@Test
	public void test955() {
		String instruction = "andi $s0, $s0, 0xff64";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3210ff64", actualHex);
	}
	@Test
	public void test956() {
		String instruction = "addiu $t7, $t1, 0xcf";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("252f00cf", actualHex);
	}
	@Test
	public void test957() {
		String instruction = "bne $t6, $s7, -76";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("15d7ffb4", actualHex);
	}
	@Test
	public void test958() {
		String instruction = "j 0xdb";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000db", actualHex);
	}
	@Test
	public void test959() {
		String instruction = "ori $v1, $a0, 193";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("348300c1", actualHex);
	}
	@Test
	public void test960() {
		String instruction = "j 0xe2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("080000e2", actualHex);
	}
	@Test
	public void test961() {
		String instruction = "bne $s1, $t9, 0x1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("16390001", actualHex);
	}
	@Test
	public void test962() {
		String instruction = "sub $t1, $a2, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00d54822", actualHex);
	}
	@Test
	public void test963() {
		String instruction = "bne $v1, $t0, 246";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("146800f6", actualHex);
	}
	@Test
	public void test964() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test965() {
		String instruction = "lui $zero, 0x92";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("3c000092", actualHex);
	}
	@Test
	public void test966() {
		String instruction = "sub $a2, $s1, $s6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02363022", actualHex);
	}
	@Test
	public void test967() {
		String instruction = "lw $t9, -15($a0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("8c99fff1", actualHex);
	}
	@Test
	public void test968() {
		String instruction = "sw $s5, ($t7)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("adf50000", actualHex);
	}
	@Test
	public void test969() {
		String instruction = "beq $s5, $v0, 0xffa5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("12a2ffa5", actualHex);
	}
	@Test
	public void test970() {
		String instruction = "beq $t3, $a3, -168";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1167ff58", actualHex);
	}
	@Test
	public void test971() {
		String instruction = "addiu $a2, $s6, 7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("26c60007", actualHex);
	}
	@Test
	public void test972() {
		String instruction = "or $fp, $fp, $k1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03dbf025", actualHex);
	}
	@Test
	public void test973() {
		String instruction = "j 0x2e";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0800002e", actualHex);
	}
	@Test
	public void test974() {
		String instruction = "or $a1, $s4, $v0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02822825", actualHex);
	}
	@Test
	public void test975() {
		String instruction = "sub $t0, $sp, $v0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03a24022", actualHex);
	}
	@Test
	public void test976() {
		String instruction = "add $a1, $a2, $t3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("00cb2820", actualHex);
	}
	@Test
	public void test977() {
		String instruction = "addiu $s1, $k1, 200";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("277100c8", actualHex);
	}
	@Test
	public void test978() {
		String instruction = "slt $gp, $s4, $t5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("028de02a", actualHex);
	}
	@Test
	public void test979() {
		String instruction = "slt $fp, $gp, $t8";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0398f02a", actualHex);
	}
	@Test
	public void test980() {
		String instruction = "addiu $t8, $zero, 0xe1";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("241800e1", actualHex);
	}
	@Test
	public void test981() {
		String instruction = "sub $a0, $k0, $t9";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03592022", actualHex);
	}
	@Test
	public void test982() {
		String instruction = "andi $t5, $s5, 0xb6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("32ad00b6", actualHex);
	}
	@Test
	public void test983() {
		String instruction = "add $a0, $at, $t6";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("002e2020", actualHex);
	}
	@Test
	public void test984() {
		String instruction = "bne $gp, $v0, 0xf";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1782000f", actualHex);
	}
	@Test
	public void test985() {
		String instruction = "or $a2, $t0, $s2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01123025", actualHex);
	}
	@Test
	public void test986() {
		String instruction = "sub $zero, $s5, $t3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02ab0022", actualHex);
	}
	@Test
	public void test987() {
		String instruction = "add $s7, $fp, $s5";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03d5b820", actualHex);
	}
	@Test
	public void test988() {
		String instruction = "ori $a3, $s6, 0xffe3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("36c7ffe3", actualHex);
	}
	@Test
	public void test989() {
		String instruction = "sw $t8, 140($v1)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("ac78008c", actualHex);
	}
	@Test
	public void test990() {
		String instruction = "syscall";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0000000c", actualHex);
	}
	@Test
	public void test991() {
		String instruction = "sub $at, $v0, $t7";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("004f0822", actualHex);
	}
	@Test
	public void test992() {
		String instruction = "sw $s2, ($k0)";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("af520000", actualHex);
	}
	@Test
	public void test993() {
		String instruction = "add $a3, $fp, $a2";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("03c63820", actualHex);
	}
	@Test
	public void test994() {
		String instruction = "beq $t9, $s5, 0xff57";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("1335ff57", actualHex);
	}
	@Test
	public void test995() {
		String instruction = "add $sp, $s1, $t0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("0228e820", actualHex);
	}
	@Test
	public void test996() {
		String instruction = "add $a0, $s7, $at";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("02e12020", actualHex);
	}
	@Test
	public void test997() {
		String instruction = "sub $a2, $t5, $a3";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("01a73022", actualHex);
	}
	@Test
	public void test998() {
		String instruction = "beq $s5, $s2, -169";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("12b2ff57", actualHex);
	}
	@Test
	public void test999() {
		String instruction = "beq $a2, $s6, -45";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("10d6ffd3", actualHex);
	}
	@Test
	public void test1000() {
		String instruction = "sub $ra, $t0, $k0";
		int actualMachineCode = MIPSAssembler.assembleMIPS(instruction);
		String actualHex = String.format("%08X", actualMachineCode).toLowerCase();
		assertEquals("011af822", actualHex);
	}
}