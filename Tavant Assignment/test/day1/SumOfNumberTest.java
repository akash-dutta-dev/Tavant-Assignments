package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumberTest {
	
	SumOfNumbers sumOfNumbers = new SumOfNumbers();


	@Test
	public void testSumOfEvenNumbersWithBothEven() {
		
		int testSumOfEvenNumbersActualOutput= sumOfNumbers.SumOfEvenNumbers(2,10);
		int testSumOfEvenNumbersExpectedOutput = 30;
		assertEquals(testSumOfEvenNumbersExpectedOutput, testSumOfEvenNumbersActualOutput);
	}
	
	@Test
	public void testSumOfEvenNumbersStartWithEven() {
		
		int testSumOfEvenNumbersActualOutput= sumOfNumbers.SumOfEvenNumbers(2,9);
		int testSumOfEvenNumbersExpectedOutput = 20;
		assertEquals(testSumOfEvenNumbersExpectedOutput, testSumOfEvenNumbersActualOutput);
	}
	
	@Test
	public void testSumOfEvenNumbersEndsWithEven() {
		
		int testSumOfEvenNumbersActualOutput= sumOfNumbers.SumOfEvenNumbers(1,10);
		int testSumOfEvenNumbersExpectedOutput = 30;
		assertEquals(testSumOfEvenNumbersExpectedOutput, testSumOfEvenNumbersActualOutput);
	}
	
	@Test
	public void testSumOfEvenNumbersWithBothOdd() {
		
		int testSumOfEvenNumbersActualOutput= sumOfNumbers.SumOfEvenNumbers(1,9);
		int testSumOfEvenNumbersExpectedOutput = 20;
		assertEquals(testSumOfEvenNumbersExpectedOutput, testSumOfEvenNumbersActualOutput);
	}
	

	@Test
	public void testSumOfOddNumbersWithBothEven() {
		
		int testSumOfOddNumbersActualOutput = sumOfNumbers.SumOfOddNumbers(-10,10);
		int testSumOfOddNumbersExpectedOutput = 0;
		assertEquals(testSumOfOddNumbersExpectedOutput, testSumOfOddNumbersActualOutput);
	}
	
	@Test
	public void testSumOfOddNumbersStartWithEven() {
		
		int testSumOfOddNumbersActualOutput = sumOfNumbers.SumOfOddNumbers(-10,9);
		int testSumOfOddNumbersExpectedOutput = 0;
		assertEquals(testSumOfOddNumbersExpectedOutput, testSumOfOddNumbersActualOutput);
	}
	
	@Test
	public void testSumOfOddNumbersEndWithEven() {
		
		int testSumOfOddNumbersActualOutput = sumOfNumbers.SumOfOddNumbers(-9,10);
		int testSumOfOddNumbersExpectedOutput = 0;
		assertEquals(testSumOfOddNumbersExpectedOutput, testSumOfOddNumbersActualOutput);
	}
	
	@Test
	public void testSumOfOddNumbersWithBothOdd() {
		
		int testSumOfOddNumbersActualOutput = sumOfNumbers.SumOfOddNumbers(-9,9);
		int testSumOfOddNumbersExpectedOutput = 0;
		assertEquals(testSumOfOddNumbersExpectedOutput, testSumOfOddNumbersActualOutput);
	}

}
