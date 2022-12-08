package TestPackage;

public class MULTI_LEVEL3 extends MULTI_LEVEL2{// IN MULTI LEVEL INHERITANCE THE SUB CLASS AQUIRING PROPERTIES SUPER CLASS AND THE SUPER CLASS ALSO AQUIRING PROPERTIES
                                               // FROM ANOTHER SUPER CLASS IS CALLED MULTI LEVEL INHERITANCE
	public void modelnew()
	{
		System.out.println("THE CAR NAME IS :- FERRARI SUPER");
		System.out.println("THE CAR MODEL IS :-FERRARI SUPER TURBO30");
		System.out.println("THE CAR COLOR IS :- DARKGREEN");
		System.out.println("THE CAR NAME IS :- PETROL");
	}
    
	public void NEWFEATRUE() {

		System.out.println("THE CAR IS :-AUTOSTART");
		System.out.println("THE CAR CAPACITY IS  :- 4 MEMBER");
		System.out.println("THE CAR SPEED IS :-340km/h ");
		System.out.println("THE CAR IS :-NAITRO SPEED");
	}
  
   public static void main(String[] args) {
	   
	   MULTI_LEVEL3 S=new MULTI_LEVEL3();
	   
	    S.car(); // CAR AND feature are method of MULTI LEVEL 1
	    System.out.println("************"); 
	    S.feature();
	    System.out.println("************");
	    S.NEWMODEL(); // NEWMODEL AND FEATURE ARE METHOD OF MULTI LEVEL 2
	    System.out.println("************");
	    S.FEATURE();
	    System.out.println("************");
	    S.modelnew(); // modelnew and NEWFEATURE ARE METHDO OF MULTI LEVEL 3  
	    System.out.println("************");
	    S.NEWFEATRUE();
   }

}
