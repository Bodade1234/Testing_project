package TestPackage;

public class SINGLE_LEVEL {// SINGLE LEVEL INHERITANCE PERFOME BETWEEN TWO OR MORE CLASS 
    // SUB CLASS AQUIRE PROPERTIES OF SUPER CLASS 
	
String EMPname ="SHAM";
float Salary=70000;
int EMPID=4543;

public void Display(){
System.out.println("NAME OF EMPOYEE IS:-"+ EMPname);
System.out.println("SALARY OF THE EMPOYEE IS:-"+Salary);
System.out.println("EMPOYEE ID IS :-"+EMPID);
}

public void ProInfo() {

String job="TESTER";
String SKILL="SANITY,SMOKE,SYSTEM,";
String involve="SIT";

System.out.println("JOB PROFILE OF EMPOYEE IS :"+job);
System.out.println("SKILL OF THE EMPOYEE IS:-"+SKILL);
System.out.println("EMPOYEE IS INVOLVE IN :-"+involve);
}

}
