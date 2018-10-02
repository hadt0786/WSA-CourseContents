 
//multilevel
class m {
	  int x;
	  int y;
	  int get(int p, int q){
	  x=p; 
	  y=q;
	  return(0);
	  }
	  void Show(){
	  System.out.println(x);
	  }
	}
	class n extends m{
	  void Showb(){
	  System.out.println(y);
	  }
	}

	class Multilevel extends n
	{
	    public static void main(String args[]){
	  Multilevel a = new Multilevel();
	  a.get(5,6);
	  a.Show();
	   a.Showb();
	  }
	}