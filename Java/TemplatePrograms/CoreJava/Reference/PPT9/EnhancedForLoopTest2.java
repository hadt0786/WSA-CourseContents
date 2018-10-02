

/**


* Program Description: The program is to implement enhanced for loop in Array or Collection
* @Author: Vikas

*/

import java.util.*;



public class EnhancedForLoopTest2{


	public static void main(String[] args){

		String[] movie = new String[5];
		
		movie[0] = "God Father";
		
		movie[1] = "Pulp Fiction";
	
		movie[2] = "12 Angry Men";

		movie[3] = "Fight Club";

		movie[4] = "Gladiator";

		//Iterating using an enhanced for loop in an array:
	
		for(String str: movie){

			System.out.println(str);
		}
	
		System.out.println("-----------------------------------------------------------------------------");

		//Iterating using an enhanced for loop in collections:

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Al Pacino");
		al.add("John Travolta");
		al.add("Henry Fonda");
		al.add("Brad Pitt");
		al.add("Russel Crowe");
		
		for(String str1: al){

			System.out.println(str1);

		}
		
			
	}


}
