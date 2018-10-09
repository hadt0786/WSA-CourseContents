/*
 * Description: This keyword can be used to refer current class instance variable
 * Author: Rashmi kulkarni
 * Date: 21/09/2018
 * Academy : www.wsa.com
 */
package thisv;


public class Thisv {
    int id;
    Thisv(int id){
        this.id=id;
    }
    void disply()
    {
        System.out.println(id);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thisv a1=new Thisv(10);
        a1.disply();
    }
}
