package Day1;

public class Factorial {
	
	public int calculateFactorial(int number){
		
	if(number < 0)
		return -1;
		
   	 int factorial =1;
   	 for(int i = number; i>=1; i--)
   		factorial = factorial * i;
   	 
   	 return factorial;
   	 
    }
	
	public static void main(String[] args) {
		
		Factorial factorial = new Factorial();
		
		int number = 7;
		System.out.println(factorial.calculateFactorial(number));

	}
}
