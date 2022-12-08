package TestPackage;
import java.util.Arrays;


  public class ARRAY_ASE {
	
	public static void main(String[] args) {
		
	    int a []= {40,50,60,70,80,90};
	    
	    for(int i=0;i<=a.length-1;i++) {
	    	
	    	System.out.print(a[i]+" ");
	    }
	 
	    Arrays.sort(a);
 
 System.out.print("*********PRINT ARRSY REVERSE*********");
   
    for(int i=0;i<=a.length-1;i++)
    {
    	System.out.print(a[i]+" ");
    }

}

}
