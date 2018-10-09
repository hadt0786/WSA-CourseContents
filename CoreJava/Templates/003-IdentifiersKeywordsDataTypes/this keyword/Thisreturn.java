/*
 * Description: This keyword can be used to return the current class constructor
 * Author: Rashmi kulkarni
 * Date: 21/09/2018
 * Academy : www.wsa.com
 */
package thisreturn;


class A{  
A getA() //type of method must be the class type
{  
  
return this;  //returns the current class instance
}  
void msg(){System.out.println("Hello java");}  
}  
public class Thisreturn {

    
    public static void main(String[] args) {
       
        A a=new A(); // new A().getA().masg();
          a.getA();
          a.msg();
    }
}
