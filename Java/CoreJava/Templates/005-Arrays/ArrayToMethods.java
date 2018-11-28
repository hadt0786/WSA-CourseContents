

/**


* Program Description: This is program is to show how we pass the array ro methods
* @Author: Vikas

*/



public class ArrayToMethods{
	
	public static void printArray(int[] array){
  
		for (int i = 0; i < array.length; i++){
    		
			System.out.print(array[i] + " ");
  		}
	}

	public static void main(String[] args){

		
		printArray(new int[]{3, 5, 7, 8, 10});

	}

}
