.data

	input_request:	.asciiz	"Enter your integer: "
	even_output:	.asciiz	"Your integer is EVEN!"
	odd_output:	.asciiz	"Your integer is ODD!"

.text
    move $s0, $s1
    blt $s0, $s1, ITS_EVEN

	# prompt the user for input
	li $v0, 4
	la $a0, input_request
	syscall
	
	# get the input from a user
	li $v0, 5
	syscall
	
	# determine even/odd status
	#move $t4, $v0
	add $t4, $zero, $v0
	andi $t0, $t4, 0x1
	
	# if $t0 is even, branch to ITS_EVEN
	beq $t0, $zero, ITS_EVEN
	
	# if not, unconditional jump to ITS_ODD
	j ITS_ODD
	
	# tell the user that it's even

	li $v0, 4
	la $a0, even_output
	syscall

	j EXIT
	
	# tell the user that it's odd

	li $v0, 4
	la $a0, odd_output
	syscall
	
	# exit cleanly

	li $v0, 10
	syscall
