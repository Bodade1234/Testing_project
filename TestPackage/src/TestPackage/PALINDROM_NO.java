package TestPackage;

public class PALINDROM_NO {// PALINDROM NO IS NUMBER WHICH IS AFTER REVERSE THE NO ARE SAME LIKE 131,141,414 515
	
	  public static void main(String[] args) {
		  
		     String a="121";
		     
		     String temp="";
		   
		 for(int i=a.length()-1;i>=0;i--)
		 {
			 temp= temp + a.charAt(i);
		 }
		
	   System.out.println(temp);

	   if(temp.equals(a)) {
		   
		   System.out.println("THE GIVEN STRING IS PALINDROM");
	   }
	   else {
		   System.out.println("THE GIVEN STRING IS NOT PALINDROM");
	   }
	   	
}


}
