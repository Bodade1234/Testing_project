package TestPackage;

public class DUPLICATE_NO_ARRAY {
	
	public static void main(String[]args) {
	
	   int A []= {20,30,40,30,50,70,20};
	   
	    for(int i=0;i<A.length;i++) {
	    	
	    	for(int j=i+1;j<A.length;j++) {
	    		
	    		if(A[i]==A[j]) {
	    			
	    			System.out.println("THE DUPLICATE NO IN ARRAY IS ="+A[j]);
	    		}
	    	}
	    }
	

	}
}