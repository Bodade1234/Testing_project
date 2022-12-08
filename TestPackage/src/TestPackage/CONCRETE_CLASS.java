package TestPackage;

public class CONCRETE_CLASS extends ABSTRACT_CLASS  {  // A CLASS IN WHICH WE CAN COMPLETE ALL THE INCOMPLETE METHOD OF 
                                                       // ABSTRACT CLASS IS CLASS CONCRET CLASS.
 public  void test() {
System.out.println("TEST OUR APPLICATION");
System.out.println("VERIFY THAT ALL BUTTON,ICONS,LINK,IMAGES PRESENT OR NOT ");
}

public void Test1() {  

System.out.println("CHECK ALL TAB ACCSEPT CREDENTIAL OR NOT");
System.out.println("CHECK SUBMIT BUTTON WORK RO NOT ");
System.out.println("CHECK THE PAGE NEVIGET FRONT OR BACK");
}
public void demo() {   // COMPLETE THE INCOMPLETE THE ABSTRACT CLASS THE METHOD

System.out.println("CHECK AFTER CLICK ON LINK THE NEXT ACTION HAPPEN OR NOT");
System.out.println("CHECK AFTER CLICK ON SUBMIT BUTTON THE LOGIN PAGE SHOULD BE OPEN OR NOT");
}
public static void main(String[] args) {

CONCRETE_CLASS X=new CONCRETE_CLASS();

X.test();
System.out.println("***************");
X.Test1();
System.out.println("***************");;
X.demo();
	
	

}
}
