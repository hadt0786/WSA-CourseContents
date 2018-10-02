 
class A {
	  int x;
	  int y;
	  int get(int p, int q){
	  x=p;
	  y=q; 
	  return(0);
	  }
	  void Show(){
	  System.out.println(x);
	  System.out.println(y);
	  }
	}
	class Single extends A
	{
	  public static void main(String args[]){
	  Single a = new Single();
	  a.get(5,6);
	  a.Show();
	  }
	 	}