package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFactorial {
	
	Factorial factorial = new Factorial();

	@Test
	void testCalculateFactorial() {
		int actualOutput = factorial.calculateFactorial(7);
		int expectedOutput = 5040;
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void testCalculateFactorialWithNegativel() {
		int actualOutput = factorial.calculateFactorial(-12);
		int expectedOutput = -1;
		assertEquals(expectedOutput, actualOutput);
	}

}
