# Set the path to your JAR file
$JarFile = "Reduced-ISA-MIPS-Assembler.jar"

# Set the path to your test file
$TestFile = "test_instructions.txt"

# Initialize a counter for failed test cases
$FailCount = 0

# Function to execute a test case and compare the output
function Test-Instruction {
    param (
        [string]$ExpectedHex,
        [string]$Instruction
    )

    # Escape the dollar signs for PowerShell and wrap the instruction in quotes
    $EscapedInstruction = $Instruction
    $QuotedInstruction = "`"$EscapedInstruction`""

    # Execute the JAR file and capture the output
    $ActualHex = java -jar $JarFile "$Instruction"

    # Trim any leading/trailing whitespace from the actual output
    $ActualHex = $ActualHex.Trim()

    # Compare the actual output with the expected output
    if ($ActualHex -eq $ExpectedHex) {
        Write-Host "PASS: $Instruction"
    }
    else {
        Write-Host "FAIL: $QuotedInstruction"
        Write-Host "  Expected: $ExpectedHex"
        Write-Host "  Actual:   $ActualHex"
        $global:FailCount++
    }
}

# Read the test file line by line
Get-Content $TestFile | ForEach-Object {
    # Split each line into the expected hex and the instruction
    $parts = $_ -split " ", 2
    $ExpectedHex = $parts[0]
    $Instruction = $parts[1]

    # Execute the test
    Test-Instruction $ExpectedHex $Instruction
}

# Print a summary of the test results
if ($FailCount -eq 0) {
    Write-Host "All tests passed!"
}
else {
    Write-Host "----------------------------------------"
    Write-Host "Summary: $FailCount tests failed."
}

exit 0
