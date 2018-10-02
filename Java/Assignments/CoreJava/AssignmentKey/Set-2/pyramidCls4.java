import java.util.Scanner;


public class pyramidCls4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
	    int n;
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a number: ");      
	    n = in.nextInt();
		for(i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
			System.out.print(i+" ");
		}
			System.out.println();
	}


	}

}
