package Day1;

public class Factorial {
	
	public static int calculateFactorial(int number){
		
   	 int factorial =1;
   	 for(int i = number; i>=1; i--)
   		factorial = factorial * i;
   	 
   	 return factorial;
   	 
    }
	
	public static void main(String[] args) {
		
		int number = 7;
		System.out.println(calculateFactorial(number));

	}
}
