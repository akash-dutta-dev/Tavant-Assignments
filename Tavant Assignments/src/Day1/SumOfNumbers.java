package Day1;

public class SumOfNumbers {
	
	public static int  SumOfOddNumbers(int start,int end){
		
		int sum=0;
		for(int i=start;i<=end;i++){
			if(i%2!=0)
				sum=sum+i;
		}
	
		return sum;
		
	}
	
	public static int SumOfEvenNumbers(int start,int end){
		

		int sum=0;
		for(int i=start;i<=end;i++){
			if(i%2==0)
				sum=sum+i;
		}
		return sum;
	}
	
	
	public static void main(String[] args){
		
		int start = 1, end = 10;
		System.out.println(SumOfOddNumbers(start, end));
		System.out.println(SumOfEvenNumbers(start, end));
		

	}
}
