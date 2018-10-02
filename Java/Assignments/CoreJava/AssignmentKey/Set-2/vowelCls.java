import java.util.Scanner;


public class vowelCls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s;
		char ch;
		 Scanner in = new Scanner(System.in);
		    System.out.println("Enter a Character: ");      
		    s = in.next();
		    ch=s.charAt(0);
		    System.out.println("The given char:"+s);
		    switch (ch)
		    {
		    case 'a':
		    	System.out.println ("The given character is vowel.");
		        break;

		    case 'e':
		    	System.out.println ("The given character is vowel.");
		        break;

		    case 'i':
		    	System.out.println ("The given character is vowel.");
		        break;

		    case 'o':
		    	System.out.println ("The given character is vowel.");
		        break;

		    case 'u':
		    	System.out.println ("The given character is vowel.");
		        break;

		    default:
		    	System.out.println ("The given character/String is not vowel.");

		    }

	}

}
