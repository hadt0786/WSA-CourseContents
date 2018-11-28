/*
 * Description: This keyword can be used to invoke current class method(implicitly)
 * Author: Rashmi kulkarni
 * Date: 21/09/2018
 * Academy : www.wsa.com
 */
package thismethod;


class A{
    void m(){
        System.out.println("Hello m");
    }
    void n(){
        System.out.println("hello n");
        m();//this.m() implicitly
    }
}
public class Thismethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    A a=new A();
     a.n();
    }
}
