package TestPackage;

public class OVERRIDING {//AQUIRING THE METHOD OF SUPER CLASS INTO SUB CLASS WITH THE HELP OF EXTENDS KEYWORD AND CHANGING IMPLEMENTTION 
    // ACCORDING TO SUB CLASS SPECIFICATION IS CALLED AS METHOD OVERRIDING
void show()
{
System.out.println("WEL-COME TO MY WORLD");

}
void show(int a,int b) // SUPER CLASS AND SUB CLASS METHOD NAME SAME BUT ARRGUMENT SHOULD BE DIFFERENT
{
int c=a+b;
System.out.println(c);
c=a-b;
System.out.println(c);

}

}


