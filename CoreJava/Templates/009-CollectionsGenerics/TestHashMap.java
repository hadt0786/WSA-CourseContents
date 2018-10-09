// HashMap Example
//Map contains value based on the key means key and value pair

import java.util.*;
public class TestHashMap {

	public static void main(String[] args) {	// TODO Auto-generated method stub

		HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
		hm1.put(0, null);
		hm1.put(11,"Mac");
		hm1.put(12,"Smith");
 		//entrySet returns all keys and values
	   for(Map.Entry m1:hm1.entrySet())// Each pair is entry
	   {
System.out.println(m1.getKey()+" " +m1.getValue());// getKey to obtain key
		   // getValue to obtain value            
		   
	   }
} 
}
