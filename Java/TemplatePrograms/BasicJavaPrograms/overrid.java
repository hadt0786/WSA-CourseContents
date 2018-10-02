 

class base
{
	 int x;
	base(int x)
	
	{
		this.x=x;
	}
void display()
	{
		System.out.println("base x"+x);
		
	}
}
class Deriv extends base
{
	int y;
	Deriv(int x,int y)
		{
		super (x);
		this.y=y;
	}
	void display()
	{
		System.out.println("basee x="+x);
		System.out.println("dervi y="+y);

	}
}
class Overrid
{
	public static void main (String args[])
	{
	Deriv d1=new Deriv(132,45);
	d1.display();
	}
}
       
