package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		int actualOutput = Factorial.calculateFactorial(7);
		int expectedOutput = 5040;
		assertEquals(expectedOutput, actualOutput);
	}

}
