import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Emertxe
 {  
	
	private int id;
	private String name,city;  //declaration	
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
 	public String getName()   //returns employee name
	{  
    	  return empName;  
	}  
	public void setName(String empName) //read employee name
 	{  
    	  this.empName = empName;  
	}  
	public String getCity()   //returns employee city
	{  
    	  return empName;  
	}  
	public void setCity(String empName) //read employee city
 	{  
    	  this.empName = empName;  
	}  
  }  
