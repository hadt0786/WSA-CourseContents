import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;
public class Test
{  
  
	public static void main(String[] args)
	{  
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
        	StudentDao dao=(StudentDao)ctx.getBean("edao");  
        	int status;
        	//insert data in to the Student table
		dao.saveStudent(new Student(101,"likhitha",3500));  
		dao.saveStudent(new Student(102,"kk",3500));  
		dao.saveStudent(new Student(103,"sai",6500));  
		dao.saveStudent(new Student(104,"bindu",4500));  
		dao.saveStudent(new Student(105,"suresh",5500));  

        	//Update the data in Student table       
		dao.updateStudent(new Student(101,"likhi",15000)); 
		
		//delete the data in Student table
		Student e=new Student(); 
		e.setId(102); 
		status= dao.deleteStudent(e); 
		System.out.println(status); 
    
		//display the data in Student table
		List<Student> list=dao.getAllStudents();  
    		for(Student s:list)  
       		System.out.println(s);  
	}  
  
}  
