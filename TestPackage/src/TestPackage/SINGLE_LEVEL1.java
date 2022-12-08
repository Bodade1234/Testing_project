package TestPackage;
import java.util.Scanner;
public class SINGLE_LEVEL1 extends SINGLE_LEVEL { // SINGLE LEVEL INHERITANCE PERFOME BETWEEN TWO OR MORE CLASS 
    // SUB CLASS AQUIRE PROPERTIES OF SUPER CLASS 
	
public void NEW() {
int a;
int b;
int c;
System.out.println("ENTER THE VALUE OF a,b,c");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt(); 
if (a>b&&a>c)
{
System.out.println("THE NO a is GREATER");	
}
else if(b>a&&b>c)
{
System.out.println("THE NO b is GREATER");	
}
else if(c>a&&c>b)
{
System.out.println("THE NO c is GREATER");	
}
}

public static void main(String[] args)
{
	SINGLE_LEVEL1 R=new SINGLE_LEVEL1();
R.Display();      // SUB CLASS METHOD ACCESS WITH THE HELP OF EXTENDS KEY WORDS
System.out.println("  ");	
R.ProInfo();     // SUB CLASS METHOD ACCESS WITH THE HELP OF EXTENDS KEY WORDS
System.out.println("  ");	
R.NEW();
}


}
