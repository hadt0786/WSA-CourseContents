


/**

* Program Description: This program is to show how we create List object and List interface implementation  
* @Author: Vikas

*/

/*List iterface is the child interface of Collection interface of collection framework*/

import java.util.*;// List interface is present inside java.util package

public class ListTest{



	public static void main(String[] args){


		List list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		// duplicate, is added
		list.add("second");//duplicate, is added
		list.add(new Integer(4)); // duplicate, is added
		System.out.println(list);

	}

} 
