package TestPackage;

public class ARRAY_DSCE {
	
	public static void main(String[]args) {
		
		   int a[]= {30,60,40,20,65,80};
		   
		   for(int i=0;i<=a.length-1;i++)
		   {
			   System.out.print(a[i]+" ");
		   }
		   System.out.println(" "); 
		   System.out.println("*********PRINT DSCENDING ORDER");
		   for(int i=0;i<(a.length/2);i++) {

			   			    
			   int z;
			   
			   z= a[i];
			   a[i]=a[(a.length-1)-i];
			   
			   a[(a.length-1)-i]=z;
			  
			}
	       
	       for(int i=0;i<=a.length-1;i++)
		   {
			   System.out.print(a[i]+" ");
		   }
	       System.out.println(" ");
	       System.out.println("********CHECK INDEX CHANGE OR NOT");
	       System.out.println(a[2]);
	       
	}


}
