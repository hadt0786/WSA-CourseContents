package hello;

 
//import static java.lang.Math.PI;
public class Mathop {

	public void circle(double r)
	{
		double area = Math.PI*r*r;
		System.out.println("The area of circle is"+area);
	}
	public static void main(String[] args) {
Mathop obj=new Mathop();
obj.circle(2);

	}

}
