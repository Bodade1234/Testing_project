package TestPackage;

public class ACCESS_SPECIFIRE {

		
		public int a=10; // DECLARED ANY MEMBER OF CLASS THE SCOPE OF THAT MEMBER IS WITHIN PROJECT
		private int b=60;// DECLARED ANY MEMBER OF CLASS THE SCOPE OF THAT MEMBER IS WITHIN  CLASS
	            int c=40;// DEFAULT//DECLARED ANY MEMBER OF CLASS THE SCOPE OF THAT MEMBER IS WITHIN  PACKAGE
		protected int d=12;// DECLARED ANY MEMBER OF CLASS THE SCOPE OF THAT MEMBER IS WITHIN PACKAGE ACCESS DIFF PACKAGE USING INHERITACE
		
		public static void main(String[] Args)
		{
			 ACCESS_SPECIFIRE A=new  ACCESS_SPECIFIRE();
			  
			System.out.println(A.a);
			System.out.println(A.b);
			System.out.println(A.c);
			System.out.println(A.d);
		}
	}



