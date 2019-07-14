package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarksValidator_isPassTest {

	@Test
	void test() {
		boolean actualOutput = MarksValidator.isPass(50);
		boolean expectedOutput = true;	
		assertEquals(expectedOutput, actualOutput);
	}

}
