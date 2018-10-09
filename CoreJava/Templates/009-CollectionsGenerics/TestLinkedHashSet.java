// Example of LinkedHashSet
//LinkedHashSet is class in that Elements will be returned in the order which they are inserted
//Author :Sandhya
import java.util.*;
public class TestLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> h2=new LinkedHashSet<String>();//create a LinkedHashset

		//Adding elements to the LinkedHashhashset

		h2.add("E");
		h2.add("B");
		h2.add("C");
		h2.add("A");
		h2.add("D");
		System.out.println(h2);
	}

}
