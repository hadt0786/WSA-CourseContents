 

class square
{
	  int sqarea(int side)
	  {
		  int area = side * side;
		  return(area);
		  }
		  int sqpari(int side)
		  {
		  int pari = 4 * side;
		  return(pari);
		  }
		}
		class rectangle
		{
		  int rectarea(int length,int breadth)
		  {
		  int area = length * breadth;
		  return(area);
		  }
		  int rectpari(int length,int breadth)
		  {
		  int pari = 2*(length + breadth);
		  return(pari);
		  }
		}
		public class ObjectClass{
		  public static void main(String args[]){
		  int sarea1,pari1;
		  int rectarea1,rectpari1;
		  square sq = new square();
		  rectangle rect = new rectangle();
		  
		  
		  sarea1 = sq.sqarea(20);
		  pari1 = sq.sqpari(20);
		  System.out.println("Area of first square = " + sarea1);
	  System.out.println("Parimeter of first square = " + pari1);
		 
		 
		  rectarea1 = rect.rectarea(5,6);
		  rectpari1 = rect.rectpari(5,6);
  System.out.println("Area of first Rectangle = " + rectarea1);
System.out.println("Parimeter of first Rectangle = " + rectpari1);
		  
		  }
		}