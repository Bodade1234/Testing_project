package TestPackage;

public class SPLIT_METHOD {
	// THE SPLIT METHOD IS EXCUTED
	
		public static void main(String[] args) {
			
			String A=" WEL-COME TO MY WORLD"; // SPLIT THE STRING
		    
			String[] Result=A.split(" ");
			
			for(int i=0;i<Result.length;i++) {
				
			 System.out.println(Result[i]);
			}
			System.out.println("*******SPLIT DATE*********"); // SPLIT THE DATE  
		
	        String a="/02/07/2000";
		    
			String[] R=a.split("/");
			
			for(int i=0;i<R.length;i++) {
				
			 System.out.println(R[i]);
	        }

		}

}
