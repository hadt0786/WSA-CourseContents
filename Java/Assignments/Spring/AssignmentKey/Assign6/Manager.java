public class Manager {
	String name;
	int age;
	
	Employee emp;
	
	public Manager(String name, int age, Employee emp){
		this.name = name;
		this.age = age;
		this.emp = emp;
	}
	public void managerDetalis()
	{
		
		System.out.println("name : " + name +" age : " + age);
		emp.employeeDetails();
	}
}