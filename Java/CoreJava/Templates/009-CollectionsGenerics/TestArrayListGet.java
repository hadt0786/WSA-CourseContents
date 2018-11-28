import java.util.*;
// Example of displaying particular element from ArrayList using get method
//Author :Sandhya
public class TestArrayListGet {

	public static void main(String[] args) {
ArrayList<String> a2=new ArrayList<String>();

    a2.add("Mango");
    a2.add("Apple");
    a2.add("orange");
    System.out.println("Content"+a2);
    	
    System.out.println("First Element"+a2.get(0));
    System.out.println("Second Element"+a2.get(1));
    System.out.println("Third Element"+a2.get(2));

	}

}
