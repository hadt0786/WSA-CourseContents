package hello;

 
class Rectangl extends Figure
{
Rectangl(double x, double y)
{
super(x,y);
}
double area() //abstract method body
{
System.out.print("Area of rectangle is :");
return dim1 * dim2;
}
}
class Triangle extends Figure
{
Triangle(double x, double y)
{
super(x,y);
}
double area()
{
System.out.print("Area for triangle is :");
return dim1 * dim2 / 2;
}
}
class FindArea
{
public static void main(String args[])
{ 
Figure figref;
Rectangl r = new Rectangl(9,5);
Triangle t  = new Triangle(10,8);
figref = r;
System.out.println("Area of rectangle is :" + figref.area());
figref = t;
System.out.println("Area of traingle is :" + figref.area());
}
}
