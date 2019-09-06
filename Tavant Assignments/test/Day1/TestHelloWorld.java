package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		String helloWorldTestGetMessageActualOutput = HelloWorld.getMessage();
		String helloWorldTestGetMessageExpectedOutput = "Hello world!!!";	
		assertEquals(helloWorldTestGetMessageExpectedOutput, helloWorldTestGetMessageActualOutput);;
	}

}
