package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HASH_MAP {
	
	public static void main(String [] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		  map.put(23, "API");
		  
		  map.put(26, "AUTOMATION");
		  
		  map.put(44, "MANUAL");
		  
		  map.put(33, "JAVA");
		  
		  for(Entry<Integer, String> m : map.entrySet()) {
			
			  System.out.println(m.getKey()+" "+m.getValue());
		  }
		  
		  map.put(44, "SELENIUM");
		  
		  System.out.println("************************");
		  
		  for(Entry<Integer, String> m : map.entrySet()) {
				
			  System.out.println(m.getKey()+" "+m.getValue());
		  }
		  
		  
	}

}
