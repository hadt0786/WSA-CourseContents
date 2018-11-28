// Example of displaying elements forward and reverse order using ListIterator
// ListIterator gives ability to access the collection in either forward or backward direction
//Author :Sandhya
import java.util.*;

public class TestListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a3= new ArrayList<Integer>();
		a3.add(1);
		a3.add(2);
		a3.add(3);
		
		ListIterator<Integer> itr1=a3.listIterator();  
		 while(itr1.hasNext()){  
		    System.out.println(itr1.next());  
		  }  
		 // display content in backward direction
		 System.out.println("Display in backward direction");
		 while(itr1.hasPrevious()){  
			    System.out.println(itr1.previous());  
			  }  
	}

}
