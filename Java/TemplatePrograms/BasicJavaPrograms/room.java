package hello;

 
//Method Overloading
class Room
{
float length;
float breadth;
Room(float x, float y)
{
length=x;
breadth=y;
}
Room(float x)
{
length=breadth=x;
}
float area()
{
return ( length *  breadth );
}
public static void main(String args[])
{
Room r1=new Room(25.0f,2.1f);
System.out.println(r1.area());
Room r2=new Room(12.0f);
System.out.println(r2.area());
}
}
