package TestPackage;

public class AREMSTRONG_No {
	
	public static void main(String[] args) {

		int no=153,rem,res=0;
		
		int temp=no;
		
		while(temp!=0) {
		   rem= temp%10;
			
			res= res+(rem*rem*rem);
			
			temp= temp/10;
		
		}
			if(no==res) {
			System.out.println("GIVEN NO IS ARMSTRONG");
			} 
			else
			{
				System.out.println("GIVEN NO IS NOT ARMSTRONG");
			}
			
	}

}
