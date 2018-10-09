/*
 * Description: This keyword can be passsed as argument in the method call
 * Author: Rashmi kulkarni
 * Date: 21/09/2018
 * Academy : www.wsa.com
 */
package thisasargu;

/**
 *
 * @author Admin
 */

public class Thisasargu {

    /**
     * @param args the command line arguments
     */ 
  void m(Thisasargu obj){  
  System.out.println("method is invoked");  
  }  
  void p(){  
  m(this);  //reuse the one obj in many methods, this is passed as arguments.
 System.out.println("method is invoked in p"); } 
  void v(Thisasargu obj){  
  System.out.println("method is invoked in v");  
  }  
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thisasargu s1 = new Thisasargu();  
        s1.p();
    }
}
