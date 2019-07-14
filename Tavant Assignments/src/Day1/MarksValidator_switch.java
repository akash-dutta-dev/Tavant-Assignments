package Day1;

public class MarksValidator_switch {
	
	public static String markGrade(int marks){
		
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
		
		int marks = 50;
		System.out.println(markGrade(marks));
	}
}
