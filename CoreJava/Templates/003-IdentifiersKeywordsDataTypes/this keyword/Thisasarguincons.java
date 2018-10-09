/*
 * Description: This keyword can be passsed as argument in the constructor call
 * Author: Rashmi kulkarni
 * Date: 21/09/2018
 * Academy : www.wsa.com
 */
package thisasarguincons;


class B{
    Thisasarguincons obj;//data member or attribute
    B(Thisasarguincons obj){//b is constructor
        this.obj=obj; //this is used to refer current class intance variable
    }
    void display(){
        System.out.println(obj.data);//by using data member(obj) of class Thisasarguincons
    }
}
public class Thisasarguincons {

    
    int data=10;
    Thisasarguincons(){
        B b = new B(this);//this is passed as argument in the constructor call
        b.display();
    }
    public static void main(String[] args) {
        
        Thisasarguincons a=new Thisasarguincons();//to create an obj with reference variable a
        
    }
}
