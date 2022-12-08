package TestPackage;

public class SUPER_KEY extends  THIS_KEY{
	
	int a=30;

	public void Add()
	{
		int a=80;
		System.out.println(a);
		System.out.println(this.a);  
		System.out.println(super.a); // SUPER KEYWORDS IS USE TO CALL THE GLOBLE VARIABLE OF SUPRE CLASS
		                             // SUPER KEYWORDS IS USE WHEN THE GLOBLE VARIABLE OF SUPER CLASS AND SUB CLASS 
		                             // HAVING SAME NAME 
	}
	public static void main(String[] args)
	{
	  SUPER_KEY s=new SUPER_KEY();
	      s.Add();
	      s.New();
	}
}



