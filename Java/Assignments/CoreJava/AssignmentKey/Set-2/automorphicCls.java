import java.util.Scanner;


public class automorphicCls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        int square = input * input;
        String inputAsString = input + "";
        String squareAsString = square + "";
        if (squareAsString.endsWith(inputAsString)) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic number");
        }
    }
	
}
