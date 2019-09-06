package Day1;

public class SumOfNumbers {
	
	public int  SumOfOddNumbers(int start,int end){
		
		int sum=0;
		for(int i=start;i<=end;i++){
			if(i%2!=0)
				sum=sum+i;
		}
	
		return sum;
		
	}
	
	public int SumOfEvenNumbers(int start,int end){
		

		int sum=0;
		for(int i=start;i<=end;i++){
			if(i%2==0)
				sum=sum+i;
		}
		return sum;
	}
	
	
	public static void main(String[] args){
		
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
		
		int start = 1, end = 10;
		System.out.println(sumOfNumbers.SumOfOddNumbers(start, end));
		System.out.println(sumOfNumbers.SumOfEvenNumbers(start, end));
		

	}
}
