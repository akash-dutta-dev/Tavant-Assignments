package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	public void test1() {
		
		int actualOutput= SumOfNumbers.SumOfEvenNumbers(1,10);
		int expectedOutput=30;
		assertEquals(expectedOutput, actualOutput);
	}
	

	@Test
	public void test2() {
		
		int actualOutput = SumOfNumbers.SumOfOddNumbers(1,10);
		int expectedOutput = 25;
		assertEquals(expectedOutput, actualOutput);
	}

}
