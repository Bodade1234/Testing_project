package TestPackage;

public class HIRACHICLE2 extends HIRACHICLE1  {// HIRACHICALE INHERITANCE PERFORM
	
    public void BDAY_START() {
    	System.out.println(" HAPPY BIRTHDAY DEAR TEJU");
    	System.out.println("YOUR ALL WISHES COMES TRUE ");
    	System.out.println("BAPPA BELSS YOU DEAR");
    }

    public void GIFT() {
    	 
    	System.out.println("BIRTHDAY GIFT IS SMART WATCH ");
    	
    }
  public static void main(String[] args) {
	  HIRACHICLE2 T=new HIRACHICLE2();
	    T.COMMING();
	    System.out.println("*********");
	    T.BIRTHDAY();
	    System.out.println("*********");
	    T.BDAY_START();
	    System.out.println("*********");
	    T.GIFT();
	    
  }

}
