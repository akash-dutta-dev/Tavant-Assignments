package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void testgetMessage() {
		
		HelloWorld helloWorld = new HelloWorld();
		
		String testGetMessageActualOutput = helloWorld.getMessage();
		String testGetMessageExpectedOutput = "Hello world!!!";	
		assertEquals(testGetMessageExpectedOutput, testGetMessageActualOutput);;
	}

}
