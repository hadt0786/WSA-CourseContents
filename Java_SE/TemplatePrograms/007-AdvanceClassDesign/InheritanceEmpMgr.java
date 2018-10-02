
// Example of Inheritance 
// Author :Sandhya
class Employee2  //super class
{
	float salary=60000;
}
class Manager extends Employee2//Manager is subclass 
{
	int bonus=10000;
}
public class InheritanceEmpMgr {

	public static void main( String[] args) {
		// TODO Auto-generated method stub
  Manager a1=new Manager();//creating object of subclass
  Employee2 e1=new Employee2();
		System.out.println("manager salary"+e1.salary);//superclass member using subclass object
		System.out.println("manager bonus"+a1.bonus);
		
	}

}
