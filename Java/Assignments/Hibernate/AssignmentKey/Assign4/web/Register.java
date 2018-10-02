package web;

     		import org.hibernate.Query;
     		import org.hibernate.Session;  
     		import org.hibernate.SessionFactory;  
     		import org.hibernate.Transaction;  
     		import org.hibernate.cfg.Configuration;  

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;  

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
     		public class Register extends HttpServlet
     		{  
     			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     		        response.setContentType("text/html");
     		        PrintWriter out = response.getWriter();
     		        String uname = request.getParameter("uname");
     		        String pwd = request.getParameter("pwd");
     		      
     			try
     			{
     				//creating configuration object  
     				Configuration cfg=new Configuration();  
     				cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
     		      
     				//creating session factory object  
     				SessionFactory factory=cfg.buildSessionFactory();  
     		      
     				//creating session object  
     				Session session=factory.openSession();  
     		      
     				//creating transaction object  
     				Transaction t=session.beginTransaction();  
     				    		          
     				Query qry = session.createQuery("from Regpojo where uname= :name and pwd= :pswd");
     				 
     		 		qry.setString("name",uname);
     		 		qry.setString("pswd", pwd);
     		     		 
     		     		List<Regpojo> l =(List<Regpojo>)qry.list();
     		     	
     		     		t.commit();//transaction is committed  
     		       		session.close();
     		           
     		     		for(Regpojo r:l)
     		     		{
     		     			if(r!=null)
     		     			{
     		     				out.println("<html><body bgcolor='lightblue'><center>");
     		     				out.println("User exist");
     		     				out.println("</center></body></html>");
     		     			}
     		     			else
     		     			{
     		     				out.println("<html><body bgcolor='lightblue'><center>");
     	     		     		out.println("User not exist");
     	     		     		out.println("</center></body></html>");	
     		     			
     		     			}
     		     			
     		     				
     		     		}
     		     			
     		     			
     		     				
     		     			
     		     	   
     		     		
     		      
     			}  
     			 catch(Exception ex) {
     	            out.println("error="+ex);
     	            System.out.println(ex.getMessage());
     	        }
     	  
        
        
        
       
    }
}