//Example of adding  and removing elements in LinkedList 
//LinkedList implements List,Deque,queue
//Author :Sandhya
import java.util.*;
public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> l1= new LinkedList<String>();

   l1.add("A");
   l1.add("B");
   l1.add("C");
   l1.add("D");
   l1.add("E");
   System.out.println("original Content"+l1);
   
   l1.add(2,"F");
   System.out.println("After adding  Content"+l1);
   
   l1.remove("C");
   System.out.println("After removing "+l1);
   
   
   
   
   
	}

}
