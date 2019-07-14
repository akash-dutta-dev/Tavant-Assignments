package Day1;

public class TemperatureConverter {
	
	public static double convertToFahrenheit(Double celsius){
		
		return ((celsius*9/5)+32);
		
	}
	
	public static double convertToCelsius (Double fahrenheit){
		
		return ((fahrenheit-32)*0.556);
		
	}
	
	public static void main(String[] args) {
		
		double celsius = 52;
		double fahrenheit = 68;
		
		System.out.println(convertToFahrenheit(celsius));
		System.out.println(convertToCelsius(fahrenheit));
	}
	
}
