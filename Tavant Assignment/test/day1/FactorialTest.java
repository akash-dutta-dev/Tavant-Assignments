package day1;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class FactorialTest {
	
	Factorial factorial = new Factorial();

	@Test
	void testCalculateFactorial() throws Exception{
		String actualOutput = factorial.calculateFactorial(7);
		String expectedOutput = "5040";
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void testCalculateFactorialWithBigNumber() throws Exception{
		String actualOutput = factorial.calculateFactorial(100);
		String expectedOutput = "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000";
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	public void testCalculateFactorialWithOutOfRangeExceptionWithSmallNum() {
	    Throwable exception = assertThrows(OutOfRangeException.class, () -> factorial.calculateFactorial(-12));
	    String expectedOutput = "Number cannot be less than 1";
	    assertEquals(expectedOutput, exception.getMessage());
	}
	
	@Test
	public void testCalculateFactorialWithOutOfRangeExceptionWitgLargeNum() {
	    Throwable exception = assertThrows(OutOfRangeException.class, () -> factorial.calculateFactorial(1234));
	    String expectedOutput = "Number cannot be greater than 1000";
	    assertEquals(expectedOutput, exception.getMessage());
	}

}
