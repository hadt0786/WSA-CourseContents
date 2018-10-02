/*
 * Write a Java program which reads student grades from a text file called grades.txt and
prints only the corresponding letter grades into a file called letter.txt. The letter grades are
assigned according to the following table. Assume that the grades.txt file can have any
number of students’ grades. Hint: The last number in the grades.txt file is -1
Score
 */
import java.io.*;
public class StudentGrade {
	
	public static void main(String args[])throws IOException
	{
		String ln; // reads a line from file 
		
		// Opening input File "grades.txt" for reading marks
		 BufferedReader gr = new BufferedReader(new FileReader("/home/likhitha/Desktop/grades")); 
		 
		 // Opening output File "letters.txt" for printing grades in to it 
		 PrintWriter lt = new PrintWriter(new FileWriter("/home/likhitha/Desktop/letters.txt"));
		 
		 ln = gr.readLine(); // Reads the first line of the File "grades.txt" 
		
		 while(ln != null) // Loop until the end of grades.txt file 
		 { 
			int mark=Integer.parseInt(ln); //converting string to integer to decide the grade
			
				 if(mark>=90)
				 {
					 lt.println("A+");
				 }	
				 else if(mark>=85 &&mark<90)
				 {
					 lt.println("A");
				 }
				 else if(mark>=80 &&mark<85)
				 {
					 lt.println("B+");
				 }
				else if(mark>=75 &&mark<80)
				{
					 lt.println("B");
				}
				else if(mark>=65 &&mark<75)
				{
					 lt.println("C+");
				}
				else if(mark>=60 &&mark<65)
				{
					 lt.println("C");
				}
				else if(mark>=55 &&mark<60)
				{
					 lt.println("D+");
				}
				else if(mark>=50 &&mark<55)
				{
					 lt.println("D");
				}
				else if(mark<50)
				{
					 lt.println("F");
		 		}
		 		ln = gr.readLine(); // Reads the marks from the File "grades.txt" 
		 
		 } 
		 
		 
		 gr.close(); // close the output file grades.txt 
		 lt.close(); // close the input file letters.txt
	}

}
