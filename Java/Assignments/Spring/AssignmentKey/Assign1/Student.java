
public class Student
 {
	int id;
	String name;
	int fee;
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	 {
		this.id = id;
	}
	public String getName()
 	{
		return name;
	}
	public void setName(String name)
 	{
		this.name = name;
	}
	public int getFee()
 	{
		return fee;
	}
	public void setFee(int fee) 
	{
		this.fee = fee;
	}
	public Student(int id, String name, int fee) 
	{
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	public Student() 
	{
		super();
	}
	public String toString()
	{  
	    return id+" "+name+" "+fee;  
	}  
	

}
