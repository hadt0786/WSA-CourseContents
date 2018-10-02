import java.util.Scanner;


public class studentCls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int marks;
		Scanner in = new Scanner(System.in); 
	       System.out.printf("Enter Marks :  ");
	       marks = in.nextInt();
		String message =greet(marks);
		System.out.println(" The greet message of the student based on marks is :"+message);
		
		
	}
	static String greet(int marks) {
		if(marks >=90) {
			return "Excelent and grade is A+";			
		} else if(marks >= 70) {
			return "Good and grade is A";
		} else if(marks >= 60) {
			return "OK and grade is B+";
		} else if( marks >=40 ){
			return "Not bad and grade is B";
		} else	{
			return "Poor and the grade is C";
		}
		
	}

}
