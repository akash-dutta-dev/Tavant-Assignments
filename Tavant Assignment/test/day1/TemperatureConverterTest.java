package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
	
	TemperatureConverter temperatureConverter = new TemperatureConverter();

	@Test
	void testConvertToFahrenheit() {
		double testConvertToFahrenheitActualOutput = temperatureConverter.convertToFahrenheit(52.0);
		double testConvertToFahrenheitExpectedOutput = 125.6;
		assertEquals(testConvertToFahrenheitExpectedOutput, testConvertToFahrenheitActualOutput);
	}
	
	@Test
	void testConvertToCelsius() {
		double testConvertToCelsiusActualOutput = temperatureConverter.convertToCelsius(32.0);
		double testConvertToCelsiusExpectedOutput = 0.0;
		assertEquals(testConvertToCelsiusExpectedOutput, testConvertToCelsiusActualOutput);
	}

}
