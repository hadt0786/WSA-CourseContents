

/**


* Program Description: This program is show how we traverse the List object from last to first 
* and first to last with the help of ListIterator interface
* @Author: Vikas

*/

import java.util.*;// ListIterator interface is present inside the java.util package


class ListIteratorTest{


	public static void main(String[] args){


		ArrayList<String> al = new ArrayList<String>();

		al.add("Trainer");
		al.add("Admin");
		al.add("Sales");
		al.add("Operation");

		
		System.out.println("from first to last --------------");


		ListIterator li1 = al.listIterator();// listIterator() method return the handle of ListIterator


		while(li1.hasNext()){

			System.out.println(li1.next());
		}
		
		System.out.println("from last to first -------------------");
	
		
		while(li1.hasPrevious()){

			System.out.println(li1.previous());
	
		}
		
	}



}
