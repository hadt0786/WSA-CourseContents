import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Emertxe
 {  
	private String empName,empRole;  //declaration
	private int id;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public int getId()
	 {  
    	    return id;  
	 }  
	public void setId(int id) 
	{  
   	     this.id = id;  
	} 
 	public String getEmpName()   //returns employee name
	{  
    	  return empName;  
	}  
	public void setEmpName(String empName) //read employee name
 	{  
    	  this.empName = empName;  
	}  
  }  