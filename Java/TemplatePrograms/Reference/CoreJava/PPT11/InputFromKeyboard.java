


/**


* Program Description: This program is to show how we take take input from keyboard
* @Author: Vikas


*/



import java.util.*;
import java.io.*;


// taking input from keboard using Scanner class

/*public class InputFromKeyboard{


	public static void main(String[] args){

		
		System.out.println("Enter the number");
		
		//Scanner class is present inside java.util package

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();


		for(int i=1;i<=10;i++){


			System.out.println(a+"*"+i+"="+a*i);

		}	
		
	
	}


}*/



// taking input from keboard using Console class

/*public class InputFromKeyboard{



	public static void main(String[] args){

		Console c=System.console();  
		System.out.println("Enter your name: ");  
		String n=c.readLine();  
		System.out.println("Welcome "+n);  

	}


}*/


//Console class Example to read password

/*public class InputFromKeyboard{



	public static void main(String[] args){

		Console c=System.console();  
		System.out.println("Enter password: ");  
		
		char[] ch=c.readPassword();  
		
		String pass=String.valueOf(ch);//converting char array into string  
		
		System.out.println("Password is: "+pass);  

	}


}*/

// Taking input from keyboard using InputStreamReader class

public class InputFromKeyboard{



	public static void main(String[] args) throws IOException{


		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter the name");

		String name = br.readLine();

		System.out.println("Your name is:"+name);

	}

}


