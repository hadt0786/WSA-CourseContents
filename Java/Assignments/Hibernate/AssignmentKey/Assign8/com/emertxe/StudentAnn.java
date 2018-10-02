package com.emertxe;
import javax.persistence.*;  

@Entity  
@Table(name = "Studentann")  
@Inheritance(strategy=InheritanceType.JOINED)  
public class StudentAnn 
{

	  @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
      
            @Column(name = "id")  
	private int id;
	  @Column(name = "name")  
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
