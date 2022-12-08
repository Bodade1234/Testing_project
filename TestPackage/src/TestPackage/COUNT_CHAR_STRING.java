package TestPackage;

public class COUNT_CHAR_STRING {
	
	public static void main(String[] args) {
		  
		   String A="SOFTWARE TESTING COURSE VELOCITY";
		   
		     int count=0;
		   
		     for(int i=0;i<A.length();i++) {
		    	 
		    	if(A.charAt(i)!=' '){
		    		 
		    		 count++;
		      }
		   
		     }
		     System.out.println(count);
	}
	    
  }


