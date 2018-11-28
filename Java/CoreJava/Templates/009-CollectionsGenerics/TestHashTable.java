// Hashtable example
//Hashtable does not have any null key or null value
//Author :Sandhya
import java.util.*;
public class TestHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
    ht.put(100, "john");
    ht.put(102,"Mac");
    ht.put(101, "Smith");
    
    for(Map.Entry a:ht.entrySet())
    {
    	System.out.println(a.getKey()+ " "+ a.getValue());
    }
    
	}

}
