package TestPackage;

public class StarPattern {
	
	public static void main(String[] args) {
		
		int star=1;

		for(int i=1;i<=5;i++){
		
	   for(int k=1;k<=star;k++) {
		   
		   System.out.print("* ");
	   }
	    System.out.println();
	     star++;
	     
	}

}

}