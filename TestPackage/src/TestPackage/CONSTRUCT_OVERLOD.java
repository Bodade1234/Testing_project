package TestPackage;

public class CONSTRUCT_OVERLOD {//--**** CONSTRUCTOR OVERLODING****--
	CONSTRUCT_OVERLOD() 
	  {
		  System.out.println("WEL-COME TO MY WORLD");
		  System.out.println("##--OUTPUT--##");
	  }
	CONSTRUCT_OVERLOD(int a,int b )
  {
	 int c=a+b;
	 System.out.println(c);
  }
	CONSTRUCT_OVERLOD(double c,double b) // CONSTRUCTOR NAME SAME AS CALSS NAME BUT ARGUMENT SHOULD BE DIFFERENT 
 {
	 double a=c+b*c;
	 System.out.println(a);
	 
 }
	CONSTRUCT_OVERLOD(char a)
 {
	 a='*';
	 System.out.println(a);
 }

public static void main(String[] args)
{
	  CONSTRUCT_OVERLOD n=new CONSTRUCT_OVERLOD();
	  CONSTRUCT_OVERLOD n1=new CONSTRUCT_OVERLOD(12,10);
	  CONSTRUCT_OVERLOD n2=new CONSTRUCT_OVERLOD(9.1,5.5);
	  CONSTRUCT_OVERLOD n3=new CONSTRUCT_OVERLOD('*');

}

}
