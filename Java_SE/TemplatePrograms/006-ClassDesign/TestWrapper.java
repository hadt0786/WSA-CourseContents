
public class TestWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Integer a=new Integer(3);
     int i =a.intValue();//converting integer to int
     int j=a;//unboxing ,compiler will write a.intValue()  
		System.out.println(a+" "+i+" "+ j);
	}

}
