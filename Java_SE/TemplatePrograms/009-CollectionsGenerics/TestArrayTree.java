// Example of Copying  ArrayList to TreeSet
//Author :Sandhya
package ClassWork2;

import java.util.*;
public class TestArraytree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a1 =new ArrayList<Integer>();
		
		a1.add(1);
		a1.add(5);
		a1.add(3);
		System.out.println("ArrayList  "+a1);
		TreeSet<Integer> t2=new TreeSet<Integer>(a1);
		System.out.println(" new set "+t2);
		
	}

}
