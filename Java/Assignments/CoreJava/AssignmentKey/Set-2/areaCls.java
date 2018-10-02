import java.util.Scanner;


public class areaCls {
	public enum Shape {
        CIRCLE,
        RECTANGLE,
        SQUARE
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String(CIRCLE, RECTANGLE,SQUARE) :");
        String input = scanner.next();
        Shape shape = Shape.valueOf(input);
        switch(shape) {
        case CIRCLE:{
        	System.out.println("Enter the radius:");
        	double radius = scanner.nextDouble();
        	System.out.println("The value of area is:"+ Math.PI * radius * radius);
        	break;
        } case RECTANGLE: {
        	double width,length;
        	System.out.println("Enter width of the Rectangle: ");
        	width = scanner.nextDouble();
        	System.out.println("Enter the length of the Rectangle:");
        	length = scanner.nextDouble();
        	System.out.println("The value of area is:"+ (width*length));
        	break;
        } case SQUARE: {
        	double length;
        	System.out.println("Enter the length of the Square:");
        	length = scanner.nextDouble();
        	System.out.println("The value of area is:"+ (length*length));
        	break;
        } default: {
        	System.out.println("Invalid input");
        }
        
        }
	}

}
