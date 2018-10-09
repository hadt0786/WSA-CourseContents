//Example of adding and Removing elements in ArrayList
//Author :Sandhya
import java.util.*;

public class TestArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a1=new ArrayList<String>();//creating ArrayList

//adding values to ArrayList
   a1.add("A");
   a1.add("B");
   a1.add("C");
   a1.add("D");
   a1.add("E");
   //display the arraylist
   System.out.println("Contents of A1"+a1);
   //after addition
   a1.add(2,"A3");
   System.out.println("Contents of A1 after adding"+a1);
   System.out.println("size of a1 after additon"+a1.size());
 //display the arraylist
   System.out.println("Contents of A1"+a1);
   //removing the elements from array list
   a1.remove(1);
   System.out.println("size of a1 after removing"+a1.size());
   //display the arraylist
     System.out.println("Contents of A1"+a1);
     
   
   



	}

}
