package hello;

 
class e{
	  int a;
	  float b;
	  void Show(){
	  System.out.println("b in super class:  " + b);
	  }
	}
	class sup extends e{
	  int a; 
	  float b;
	  sup(int p, float q){
	  a = p;
	  super.b = q;
	  }
	  void Show(){
	  super.Show();
	  System.out.println("b in super class:  " + super.b);
	  System.out.println("a in sub class:  " + a);
	  }
	  public static void main(String[] args){
	  sup s = new sup(1, 5);
	  s.Show();
	  }
	}