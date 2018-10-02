import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.ResultSetExtractor;  
  
  
public class StudentDao 
{  
	private JdbcTemplate jdbcTemplate;  
  
     public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
     {  
       this.jdbcTemplate = jdbcTemplate;  
     }  
  
     public int saveStudent(Student e)
    {  
     String query1="insert into Student values(  '"+e.getId()+"','"+e.getName()+"','"+e.getFee()+"')";  
     return jdbcTemplate.update(query1);  
    }  
     public int updateStudent(Student e)
    {  
     String query1="update Student set name='"+e.getName()+"',fee='"+e.getFee()+"' where id='"+e.getId()+"' ";  
     return jdbcTemplate.update(query1);  
    }  
    public int deleteStudent(Student e)
   {  
     String query1="delete from Student where id='"+e.getId()+"' ";  
     return jdbcTemplate.update(query1);  
   }  

   public List<Student> getAllStudents()
   {  
 	return jdbcTemplate.query("select * from Student",new ResultSetExtractor<List<Student>>()
		
	 {  
    		@Override  
     		public List<Student> extractData(ResultSet rs) throws SQLException,  
            	DataAccessException
		 {  
      
        		List<Student> list=new ArrayList<Student>();  
        		while(rs.next())
       			 {  
        		   Student e=new Student();  
       			   e.setId(rs.getInt(1));  
        		   e.setName(rs.getString(2));  
        		   e.setFee(rs.getInt(3));  
        		   list.add(e);  
        		}  
       			 return list;  
                 }  
         });  
   } 
	
	
}
  
