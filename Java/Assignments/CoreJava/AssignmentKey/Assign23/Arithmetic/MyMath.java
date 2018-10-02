package Arithmetic;
/*Create a package called "Arithmetic" that contains methods to deal all arithmetic
operations. Also, write a program to use the package.
*/
/* First create a directory by name "Arithmetic" and move to that directory, 
 * create the following file and compile the file in the same directory.*/

public class MyMath
{
 public int add(int x,int y)
 {
  return x+y;
 }
 public int sub(int x,int y)
 {
  return x-y;
 }
 public int mul(int x,int y)
 {
  return x*y;
 }
 public double div(int x,int y)
 {
  return (double)x/y;
 }
 public int mod(int x,int y)
 {
  return x%y;
 }
}
