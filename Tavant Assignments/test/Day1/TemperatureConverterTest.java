package Day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

	@Test
	void test() {
		double actualOutput = TemperatureConverter.convertToFahrenheit(52.0);
		double expectedOutput = 125.6;
		assertEquals(expectedOutput, actualOutput);
	}

}
