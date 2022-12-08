package TestPackage;
import java.util.Scanner;
public class PRIME_NO1 {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("PLEASE ENTER ANY NO");    
		   
		       int no,count=0;
		      
		      no=sc.nextInt();
		  
		  for(int i=1;i<=no;i++)
		  {
	      if(no%i==0)
	    	count++;
	    	
	      }
	      if(count==2)
	      { 
	    	  System.out.println("GIVEN NO IS PRIME");
	      }
	      else
	      {
	    	  System.out.println("GIVEN NOT IS PRIME");
	      }
           
   }

}
