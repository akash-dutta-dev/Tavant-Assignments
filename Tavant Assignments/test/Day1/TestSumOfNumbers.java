package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSumOfNumbers {
	
	SumOfNumbers sumOfNumbers = new SumOfNumbers();


	@Test
	public void testSumOfEvenNumbers() {
		
		int testSumOfEvenNumbersActualOutput= sumOfNumbers.SumOfEvenNumbers(1,10);
		int testSumOfEvenNumbersExpectedOutput = 30;
		assertEquals(testSumOfEvenNumbersExpectedOutput, testSumOfEvenNumbersActualOutput);
	}
	

	@Test
	public void testSumOfOddNumbers() {
		
		int testSumOfOddNumbersActualOutput = sumOfNumbers.SumOfOddNumbers(1,10);
		int testSumOfOddNumbersExpectedOutput = 25;
		assertEquals(testSumOfOddNumbersExpectedOutput, testSumOfOddNumbersActualOutput);
	}

}
