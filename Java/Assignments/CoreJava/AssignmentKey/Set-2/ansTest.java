import java.util.Scanner;


public class ansTest {
public static void main(String[] args){
	int i;
    int n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");      
    n = in.nextInt();
	for(i=0;i<n;i++){
		for(int j=0;j<=i;j++){
		System.out.print("*");
	}
		System.out.println();
}
}
}