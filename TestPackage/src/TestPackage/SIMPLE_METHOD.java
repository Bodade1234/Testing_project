package TestPackage;

public class SIMPLE_METHOD { // SIMPLE METHOD PROGRAM
	
	
	   static int total;
	  static void chaitu(){
		   
			String studName="Rahul";
			int studRollno=523;
			
			System.out.println("Student name is :"+studName);
			System.out.println("Student roll no is :"+studRollno);
		}
	   static void studentMark() {
	       
	    	
	    	
	    	int Marathi=85;
	    	int English=75;
	    	int science=78;
	    	int Math=90;
	    	
	    	total=Marathi+English+science+Math;
	    	
	    	System.out.println("The Total Mark of Student is:"+total);

	    }
	    	
	     public static void main(String[] args)
	  {
		 
		  chaitu();
		  
		  System.out.println("  ");
		  studentMark();
		  
	 }
}


