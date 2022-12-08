package TestPackage;

public class OVERRIDING_SON extends OVERRIDING_FATHER{ // EXAPMLE OF RUN TIME POLYMOPHISM
	
    void Home()  // AQUIRING THE METHOD OF SUPER CLASS INTO SUB CLASS WITH THE HELP OF EXTENDS KEYWORD AND CHANGING IMPLEMENTTION 
    {            // ACCORDING TO SUB CLASS SPECIFICATION IS CALLED AS METHOD OVERRIDING
    	
    	System.out.println("SON USE ALL THINGS IN HOME");
    	System.out.println("LIKE TV,AC,FRIG");
    }
   void CAR()
   {
	   System.out.println("SON USE FATHER THE CAR ");
	   System.out.println("CAR NAME IS FERRARI FZ*8");
	  
	   System.out.println("   "); 
	   System.out.println("PROPERTIES OF FATHER");
	     
   }
 public static void main(String[] args)
 {
	 OVERRIDING_FATHER  a=new OVERRIDING_SON(); // TO CONFORMATOIN OF OVERLODING WE CAN CHANEG REFRENCE SON TO FATHER 
      
	   a.Home();
       a.CAR();
       

}

}