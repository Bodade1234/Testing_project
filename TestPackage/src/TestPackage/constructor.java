package TestPackage;

public class constructor {//COSTRUCTOR OVERLODING

	 int a;       // CONSTRUCTOR NAME SAME AS CALSS NAME BUT ARGUMENT SHOULD BE DIFFERENT 
	 int b,c;
	 float C;
	 String name;
	 String Class;
       constructor()
       {
       	a=29;
       	b=40;
       }

       constructor(int a,int b)
       {
           c=a+b;
       	System.out.println(c);
       }
       constructor(String name,String Class) 
       {
       	System.out.println("Student name is"+name);
       	System.out.println("Student class is"+Class);
       }
       constructor(float a,float b)
       {
            C=a+b;
           System.out.println("The Value of float is :"+C);
       }
     public static void main(String[] args)
     {
   	  constructor A=new constructor(); 
     
   	  constructor X=new constructor(20,30);
   	  
   	  constructor z=new constructor("RAM","BCA");
          
   	  constructor f=new constructor(45.5F,60.65F);
     }


 
}
