package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HASH_TABLE {
	
	public static void main(String[] args) {
		
		
			
			Hashtable<Integer,String> table = new Hashtable<Integer,String>();
			
			  table.put(23, null); //IT IS NOT ACCEPT ANY NULL VALUE
			  
			  table.put(26, "AUTOMATION");
			  
			  table.put(null, "MANUAL"); //IT IS NOT ACCEPT ANY NULL KAY
			  
			  table.put(33, "JAVA");
			  
			  for(Entry<Integer, String> m : table.entrySet()) {
				
				  System.out.println(m.getKey()+" "+m.getValue());
			  }
			  
			  table.put(44, "SELENIUM");
			  
			  System.out.println("************************");
			  
			  for(Entry<Integer, String> m : table.entrySet()) {
					
				  System.out.println(m.getKey()+" "+m.getValue());
			  }
			  
			  
		}

	}


