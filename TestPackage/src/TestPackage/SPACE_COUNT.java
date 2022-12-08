package TestPackage;

public class SPACE_COUNT {
	
public static void main(String[] args) {
		
		String a="WEL COME TO MY WORLD";
		  int count=0;
		  
	for(int i=0;i<a.length()-1;i++)
		{
		    char r= a.charAt(i); 
		  
	 if(r==' ') {    // COUNT SPACE USING charAT(),COUNT & LENGTH()
		   
			 count++; // count use for calculate spaces  if condition is true then count ++
	   }		}
	   System.out.println(count);
}
	

}
