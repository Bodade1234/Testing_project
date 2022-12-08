package TestPackage;

public class METHOD_OVERLODING {// EXAMPLE OF COMPILE TIME POLYMORPHISM  
	
	 public void demo(int no1,int no2)   // DECLARE ALL METHOD NAME MUST BE SAME BUT ARRGUMENT SHOULD BE DIFFERENT 
	{                                    // WITHIN SAME CLASS IS CALLED AS METHOD OVERLODING
		if (no1>no2)
	    {
		    System.out.println("No1 is greatre than no2");
	    }
	  else
	  {
		  System.out.println("No2 is greatre than No1");
	  }
	}
	
	 public void demo(String name,String name2,String name3)
	{
		System.out.println("Student name is :"+name);
		System.out.println("Student name is :"+name2);
		System.out.println("Student name is :"+name3);
	}
	
   public void demo(char ch,char b)
	{ 		
   	System.out.println(ch);
		System.out.println(b);
   }
	
   public void demo(float a,float b)
    {
   	 float c=a+b;
   	 System.out.println(c);
   }
    
  public static void main(String[] args)
  {
	   METHOD_OVERLODING A=new METHOD_OVERLODING();
       
	   A.demo(30,40);
      A.demo("RAM","KAJAL","TEJAL");
      A.demo('@','#');
      A.demo(54.5F, 55.7F);
 }
	
}


