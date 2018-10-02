// Example of displaying arrayList using Iterator
// Iterator can access each element in the collection
//Author :Sandhya
import java.util.*;
public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a3= new ArrayList<Integer>();
		a3.add(1);
		a3.add(2);
		a3.add(3);
		
		Iterator<Integer> itr=a3.iterator();  
		 while(itr.hasNext()){  
		    System.out.println(itr.next());  
		  }  
	}

}
