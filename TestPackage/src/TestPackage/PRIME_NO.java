package TestPackage;

public class PRIME_NO {
	
	   public static void main(String[] args) {
		   
		      int no=5,count=0;
		      
		    for(int i=1;i<=no;i++) {
		    	
		    	  if(no%i==0) 
		    		  
		    		  count++;
		    	  }
		    	  if(count==2) {
		    		
		    		  System.out.println("GIVEN NO IS PRIME");
		    	  }
		    	  else {
		    		  System.out.println("GIVEN NO IS NOT PRIME");
		    	  }
		    
	   }

}
