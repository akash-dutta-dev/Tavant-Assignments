package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarksValidatorWithSwitchTest {
	
	MarksValidatorWithSwitch marksValidatorWithSwitch = new MarksValidatorWithSwitch();
	
	@Test
	void testMarksGradeWith92() {
		String actualOutput = marksValidatorWithSwitch.markGrade(92);;
		String expectedOutput = "Grade A";	
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void testMarksGradeWith80() {
		String actualOutput = marksValidatorWithSwitch.markGrade(80);;
		String expectedOutput = "Grade B";	
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void testMarksGradeWith70() {
		String actualOutput = marksValidatorWithSwitch.markGrade(70);;
		String expectedOutput = "Grade C";	
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void testMarksGradeWith50() {
		String actualOutput = marksValidatorWithSwitch.markGrade(50);;
		String expectedOutput = "Grade D";	
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void testMarksGradeWith20() {
		String actualOutput = marksValidatorWithSwitch.markGrade(50);;
		String expectedOutput = "Grade D";	
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	void testMarksGradeWithNegative() {
		String actualOutput = marksValidatorWithSwitch.markGrade(-10);;
		String expectedOutput = "Marks cannot be Negative.";	
		assertEquals(expectedOutput, actualOutput);
	}

}