package day1;

public class TemperatureConverter {
	
	public double convertToFahrenheit(Double celsius){
		
		return ((celsius*9/5)+32);
		
	}
	
	public double convertToCelsius (Double fahrenheit){
		
		return ((fahrenheit-32)*0.556);
		
	}
	
	public static void main(String[] args) {
		
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		
		double celsius = 52;
		double fahrenheit = 68;
		
		System.out.println(temperatureConverter.convertToFahrenheit(celsius));
		System.out.println(temperatureConverter.convertToCelsius(fahrenheit));
	}
	
}
