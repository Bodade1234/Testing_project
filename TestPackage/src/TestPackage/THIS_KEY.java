package TestPackage;

public class THIS_KEY {
	
	int a=50;// GLOBLE SAME NAME AS LOCAL 
	
	 public void New()
	  {
		  int a=60; //LOCAL VARIABLE SAME NAME
		  System.out.println(a);
		  System.out.println(this.a);// THIS KYEWORD IS USE WHEN GLOBLE VARIABLE AND LOCAL VARIABLE OF 
		                             // CURRET CLASS HAVING SAME NAME.
	  }


}
