package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		String actualOutput = HelloWorld.getMessage();
		String expectedOutput = "Hello world!!!";	
		assertEquals(expectedOutput, actualOutput);;
	}

}
