package Collections;

import java.util.ArrayList;

public class List_Test {
	
	public static void main(String[]args) {
		
			ArrayList list = new ArrayList();
			
			   list.add(1234);
			   
			   list.add("CHAITU");
			   
			   list.add('#');
			   
			   list.add(34.76);
			   
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
