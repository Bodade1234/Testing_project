package Collections;

import java.util.ArrayList;

public class AList {
	
	public static void main(String[]args) {
		
		ArrayList <String>list = new ArrayList<String>();
		
		   list.add("AUTOMATION");
		   
		   list.add("CHAITU");
		   
		   list.add("MANUAL");
		   
		   list.add("SELENIUM");
		   
		  int data = list.size();
		  
		   System.out.println(data);
		   
	 for(int i=0;i<list.size();i++) {
		 
		 System.out.println(list.get(i));
	 }
	 
	 System.out.println("*******************");
	 list.remove(2);
   for(int i=0;i<list.size();i++) {
		 
		 System.out.println(list.get(i));
	 }
}



}
