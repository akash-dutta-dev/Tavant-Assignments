package day1;

//This function calculate factorial upto 1000!
public class Factorial {
	
	public String calculateFactorial(int number) throws OutOfRangeException{
		
		//If the number is less than 1
		if(number < 1)
			throw new OutOfRangeException("Number cannot be less than 1");
		if(number > 1000)
			throw new OutOfRangeException("Number cannot be greater than 1000");
			
			

		//If the number is less than 20, we can use long variable to store the result 
		if(number < 20) {
			
			long factorial = 1;
		    for(int i = number; i >= 1; i--)
		    	factorial = factorial * i;
		    String factorialToString = Long.toString(factorial);
		   	 
		   	return factorialToString;
		}
		
		//If the number is greater than 20 then Arrays will be used for calculation
		//The calculated result will be converted to a String value before returning
		//TO further extend the number range linked list can be used instead of an array.
		else {
			
			int numberArray[] = new int[10000]; 
			numberArray[0] = 1; 
	        int numberArraySize = 1; 

	        for (int i = 2; i <= number; i++) {
	        	int carry = 0; 
	            for (int j = 0; j < numberArraySize; j++) { 
	                int prod = numberArray[j] * i + carry; 
	                numberArray[j] = prod % 10;
	                carry = prod/10; 
	            } 
	      
	            while (carry!=0)  {      	
	            	numberArray[numberArraySize] = carry % 10; 
	                carry = carry / 10; 
	                numberArraySize++; 
	            } 
	        }
	        
	        String factorialToString = "";
	        for (int i = numberArraySize - 1; i >= 0; i--) 
	        	factorialToString += numberArray[i]; 
	        
	        return factorialToString;
		}
    }
	
	public static void main(String[] args) throws Exception{
		
		Factorial factorial = new Factorial();
		
		int number = -45;
		System.out.println(factorial.calculateFactorial(number));
	}
	
}

class OutOfRangeException extends Exception {
	public OutOfRangeException(String str) {
		super(str);
	}
}
