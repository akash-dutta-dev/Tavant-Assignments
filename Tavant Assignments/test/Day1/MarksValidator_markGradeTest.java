package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarksValidator_markGradeTest {

	@Test
	void test() {
		String actualOutput = MarksValidator.markGrade(92);;
		String expectedOutput = "Grade A";	
		assertEquals(expectedOutput, actualOutput);
	}

}
