package hello;
abstract class Figure   //abstract class
{
double dim1;
double dim2;
Figure(double x, double y)
{
dim1 = x;
dim2 = y;
}
abstract double area( );    //abstract method
}