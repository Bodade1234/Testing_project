package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HASH_NULL {
	
public static void main(String [] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		  map.put(23, null);
		  
		  map.put(26, "AUTOMATION");
		  
		  map.put(null, null);
		  
		  map.put(null, "JAVA");
		  
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
