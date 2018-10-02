package hello;

abstract class x
	{
		abstract void call();
		void callmet()
		{
		System.out.println("this is a concrete method.");
		}
	}
		class B extends x
		{
			void call()
			{
			System.out.println("B's implementation of callme");
			}
		}
		class Ab
		{
			public static void main(String[]args)
			{
			B b=new B();
			b.call();
			b.callmet();
			}
		}

