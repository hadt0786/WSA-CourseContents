package hello;

 

 class NestingTest {

	int m,n;
	NestingTest(int x, int y)
	{
		m=x;
		n=y;
			}
	int largest()
	{
		if(m>=n)
			return m;
		else
			return n;
	}
	void display()
	{
		int large=largest();
		System.out.println("Largest value="+large);
	}
}
	class Nesting
	{
	public static void main(String[] args) {
  NestingTest nest=new NestingTest(50,123);
  nest.display();
	}
  }
