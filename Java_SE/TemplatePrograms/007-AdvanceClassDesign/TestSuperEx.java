// Example of super keyword
// Author :Sandhya

class Book //super class
{  String BookName;
   int BookId;
   Book(String BookName,int BookId)
   {
	   this.BookName=BookName;
	   this.BookId=BookId;
   }
}

class Amount extends Book  //subclass Amount extending properties of super class
{
	float cost;
	Amount(String BookName,int BookId,float cost)
	{
		super(BookName,BookId);
		this.cost=cost;
		
		System.out.println("BookName :"+BookName);
		System.out.println("Book Id :"+BookId);
		System.out.println("Cost :"+cost);
	}
	
}
public class TestSuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Amount  a1=new Amount("java",10,560.56f);
   
	}

}
