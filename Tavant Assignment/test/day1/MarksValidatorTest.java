package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarksValidatorTest {
	
	MarksValidator marksValidator = new MarksValidator();

	@Test
	void testIsPassWithTrue() {
		boolean testIsPassWithTrueActualOutput = marksValidator.isPass(92);;
		boolean testIsPassWithTrueExpectedOutput = true;	
		assertEquals(testIsPassWithTrueExpectedOutput, testIsPassWithTrueActualOutput);
	}
	
	@Test
	void testIsPassWithFalse() {
		boolean testIsPassWithFalseActualOutput = marksValidator.isPass(11);;
		boolean testIsPassWithFalseExpectedOutput = false;	
		assertEquals(testIsPassWithFalseExpectedOutput, testIsPassWithFalseActualOutput);
	}
	
	@Test
	void testMarksGradeWith92() {
		String actualOutput = marksValidator.markGrade(92);;
		String expectedOutput = "Grade A";	
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void testMarksGradeWith80() {
		String actualOutput = marksValidator.markGrade(80);;
		String expectedOutput = "Grade B";	
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void testMarksGradeWith70() {
		String actualOutput = marksValidator.markGrade(70);;
		String expectedOutput = "Grade C";	
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void testMarksGradeWith50() {
		String actualOutput = marksValidator.markGrade(50);;
		String expectedOutput = "Grade D";	
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void testMarksGradeWith20() {
		String actualOutput = marksValidator.markGrade(50);;
		String expectedOutput = "Grade D";	
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void testMarksGradeWithNegative() {
		String actualOutput = marksValidator.markGrade(-10);;
		String expectedOutput = "Marks cannot be Negative.";	
		assertEquals(expectedOutput, actualOutput);
	}

}
