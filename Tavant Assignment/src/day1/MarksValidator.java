package day1;

public class MarksValidator {
	public boolean isPass(int marks){
		
		if(marks >= 40)
			return true;
		else 
			return false;
	}
	
	public String markGrade(int marks){
		
		if(marks < 0)
			return "Marks cannot be Negative.";
		
		if(isPass(marks)){
		 if(marks > 90)
			 return "Grade A";
		 if(marks>75)
			  return "Grade B";
		 if(marks>60)
			  return "Grade C";
		}
	  return "Grade D"; 
	}

	public static void main(String[] args) {
		
		MarksValidator marksValidator = new MarksValidator();
		
		int marks = 50;
		
		System.out.println(marksValidator.isPass(marks));
		System.out.println(marksValidator.markGrade(marks));

	}
}
