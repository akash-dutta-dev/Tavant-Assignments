package day1;

public class MarksValidatorWithSwitch {
	
	public String markGrade(int marks){
		
		if(marks < 0)
			return "Marks cannot be Negative.";
		
		 String grade;
		 
	     switch (marks/10){
	     
		     case 10:
		    	 
		     case 9:{
		    	 grade = "Grade A";
		         if(marks == 90)
		        	 grade = "Grade B";
		         break;
		     }		            	  
		    	 
		     case 8:grade = "Grade B";
		            break;
		     
		     case 7:{
		    	 if(marks>75)
		    		 grade="Grade B";
		    	 else
	      		     grade="Grade C";
		         break;
		     }
		    	 
		     case 6:{
		    	 grade="Grade C";
	             if(marks==60)
	       	      	grade="Grade D";
	             break;
	         }		     
		     
		     default: grade = "Grade D";
	    
	     }
	     
	     return grade;
	}    
	
	public static void main(String args[]){
		
		MarksValidatorWithSwitch marksValidator_switch = new MarksValidatorWithSwitch();
		
		int marks = 50;
		System.out.println(marksValidator_switch.markGrade(marks));
	}
}
