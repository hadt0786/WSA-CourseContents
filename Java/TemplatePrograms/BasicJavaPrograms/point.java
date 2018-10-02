 

class Point{
public int x;
public int y;

public void setX( int x) 
{ 
x=x+x;
System.out.println(x);
}

public void setY(int y)
{
y= y*17;
}

public int getX( )
{
return x;
}
public int getY( )
{
return y;
}

public static void main(String args[ ] )
{
int a, b;
Point p1 = new Point( );
p1.setX(22); 
p1.setY(44); 
a = p1.getX( ); 
System.out.println("The value of a is"+a);
b = p1.getY( ); 
System.out.println("The value of b is"+b);
}
} 
