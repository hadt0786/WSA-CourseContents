package hello;

 
public class EmployeeTest{
   public static void main(String args[]){
      /* Create two objects using constructor */
      Employee empOne = new Employee("sowmya");
      Employee empTwo = new Employee("Keerthi");

      // Invoking methods for each object created
      empOne.empAge(19);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(45000);
      empOne.printEmployee();

      empTwo.empAge(21);
      empTwo.empDesignation("Software Engineer");
      empTwo.empSalary(35000);
      empTwo.printEmployee();
   }
}
