package TestPackage;

public class METHOD_OVEROLODING1 {
	public void Add(int no1,int no2 )
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
	   static void Add(String name,int Sub1,int Sub2 )
	    {   
		   System.out.println("The Name Of Student is:"+name);
	    	int Marks=Sub1+Sub2; 
	    	System.out.println("Addition Of Two Sub is:"+Marks);
	    }
		
      public void Add(int a,int b,int c)
      {   
    	  int sum=a+b+c;
    	 float Avg=sum/3;
    	 System.out.println("The Average Of NO is:"+Avg);
      }
      
      public static void main(String[] args)
      {     
    	  METHOD_OVERLODING A = new METHOD_OVERLODING();
            
            Add("RAM",85,80);
      }
}


