/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thisconst;

/**
 *Description: this() can be used to invoke current class constructor
 * Author: Rashmi kulkarni
 * Date: 21/09/2018
 * Academy : www.wsa.com
 */
class A{
A(){
    
            System.out.println("hello a");
           
        }
         A(int x){
            this();
            System.out.println(x);
        }
}
public class Thisconst {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a= new A(5);
    }
}
