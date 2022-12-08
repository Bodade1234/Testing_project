package TestPackage;

public class STRING_REVERSE {
	
	public static void main(String[] args) {
		
		 String a="automation";
	
	     String rev=" ";
	       
	      int i;
	     
	     for( i =a.length()-1;i>=0;i--)
	     {
	           rev= rev + a.charAt(i);
	     }
	     System.out.println(rev);
	     
 }


}
