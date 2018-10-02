package web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class Register extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        try {
         SessionFactory sf =  new AnnotationConfiguration().configure().buildSessionFactory(); 
         Session s = sf.openSession();
       
         Regpojo sub = new Regpojo();
         sub.setUname(uname);
         sub.setPwd(pwd);
         s.beginTransaction();
         s.save(sub);
         s.getTransaction().commit();
         s.close();
         sf.close();
         out.println( "<h3>[" + uname + "] has been registered successfully!</h3>");
        }
        catch(Exception ex) {
            out.println("<h3>[" + uname + "] could NOT be registered!</h3>");
            System.out.println(ex.getMessage());
        }
    }
}