package hello;


 import java.util.*;
public class Strbuff
{
    public static void main(String args[])
    {
        Scanner keyin=new Scanner(System.in);
        String str=new String();
        System.out.println("enter the string");
        str=keyin.next();
        StringBuffer str1=str.reverse();
        System.out.println(str1);
    }
}
