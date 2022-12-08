package TestPackage;

public class STATIC_OVERLODING {  // STATIC METHOD OVERLODING
	
	public static void Add(int no1,int no2 ) // STATIC METHOD WITH ARGUMENT 
{
	{
	   if(no1>no2)
	   {
		   System.out.println("NO1 is greater than NO2");
	   }
	  else
	   {
		System.out.println("NO2 is greater than NO1");
	   }
 	}
}
   public static void Add(String name,int Sub1,int Sub2 )
    {   
	   System.out.println("The Name Of Student is:"+name);
    	int Marks=Sub1+Sub2; 
    	System.out.println("Addition Of Two Sub is:"+Marks);
    }
	
  public static void Add(int a,int b,int c)
  {   
	  int sum=a+b+c;
	 float Avg=sum/3;
	 System.out.println("The Average Of NO is:"+Avg);
  }
  
  public static void main(String[] args)
  {     
	  STATIC_OVERLODING A=new STATIC_OVERLODING();
	  STATIC_OVERLODING.Add(20,40);
	  STATIC_OVERLODING.Add(30,40,30);
        Add("RAM",85,80);
  }
}



