package Day1;

public class MarksValidator {
	public static boolean isPass(int marks){
		
		if(marks >= 40)
			return true;
		else 
			return false;
	}
	
	public static String markGrade(int marks){
		if(isPass(marks))
		{
		 if(marks > 90)
			 return "Grade A";
		 if(marks>75)
			  return "Grade B";
		 if(marks>60)
			  return "Grade c";
		}
	  return "Grade D"; 
	}

	public static void main(String[] args) {
		
		int marks = 50;
		
		System.out.println(isPass(marks));
		System.out.println(markGrade(marks));

	}
}
