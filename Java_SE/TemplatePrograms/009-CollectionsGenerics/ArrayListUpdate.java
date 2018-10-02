
// Example of set method to update the element with specified index
//Author :Sandhya
import java.util.*;
public class ArrayListUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Integer> a4 =new ArrayList<Integer>();
		a4.add(1);
		a4.add(2);
		a4.add(3);
		
		System.out.println("Content of ArrayList"+a4);
		a4.set(0, 10);
		a4.set(1, 11);
		a4.set(2, 12);
		System.out.println("Content of ArrayList after updating"+a4);
	}

}
