/*In a small firm employee numbers are given in serial numerical order, that is 1, 2, 3 etc. 
write a menu driven program to perform following operations: 
        a) Create a file of employee data with following information:  Employee No, Name, Sex, Gross Salary. 
        b) Append the data of a new employee joining the firm. 
        c) If a given employee leaves, delete his record. 
        d) If gross salary of a given employee increases, update the gross salary. 
        e) Display the record of (i) a given employee or (ii) all employees.   
*/
import java.util.*;
import java.io.*;
import java.text.*;
public class EmpFirm 
{
	public static void main(String[] args) throws IOException 
	{

 	 int ch = 0;
    	 int ch2 = 0;
	 Scanner sc = new Scanner(System.in) ;
	 boolean validFile = false;
	 int eno;
	 String name,sex,n;
	 Double grosssal;
	 String totalDetails;
	 boolean validName = false;
	 Scanner stringReader = new Scanner(System.in);

	 String fileName = "";
	 System.out.println("\n\t\t\tEmployee Firm");
	 System.out.println("--------------------------------------------------------------------------------");
         while (ch != 5)
	  {
		System.out.println("\n PRESS 1 TO CREATE EMPLOYEE FILE");
		System.out.println("PRESS 2 TO APPEND DATA OF NEW EMPLOYEE");
		System.out.println("PRESS 3 TO DELETE EMPLOYEE");
		System.out.println("PRESS 4 TO DISPLAY");
		System.out.println("PRESS 5 TO Exit");
		ArrayList nameList = new ArrayList();
		while(!sc.hasNextInt())
		{
			System.out.println("\nENTER ONLY NUMBERS IN THE RANGE 1 - 5");
			sc.nextLine();
		}
		
		ch = sc.nextInt();
		
		switch(ch)
		{
			case 1: System.out.println("\nENTER NAME OF file TO CREATE WITHOUT ANY FILE EXTENSION");
			validFile = false;
			
			while (!validFile)
			{
			   fileName = stringReader.nextLine();
			    if (fileName.equals(""))
			    {
			      System.out.println("\nFile NAME CANNOT BE EMPTY");
			      System.out.println("\nENTER NAME OF file TO CREATE WITHOUT ANY FILE EXTENSION");
			      continue;
			    }
			   if(!(fileName.contains("/")||fileName.contains("\\")||fileName.contains(":")||
			   fileName.contains("*")||fileName.contains("?")||fileName.contains("/")||
			   fileName.contains("\"")||fileName.contains("<")||fileName.contains(">")||
			   fileName.contains("|")))
			   {
			    fileName = fileName + ".txt";
			    File empfirm = new File("fileName");
			    if(!empfirm.exists())
			     {
			        System.out.println("\nNEW employee file CREATED::"+fileName);	   				
				validFile = true;
			     }
	   		    else
			     {
                              System.out.println("\nA File WITH NAME "+fileName+" ALREADY EXISTS\nPLEASE ENTER A DIFFERENT NAME" );
			     }
							
			   }
						
			   else
			    {
			      System.out.println("\nFILE NAME CANNOT CONTAIN : /,\\,\",*,?,<,>,|");
			      System.out.println("\nENTER NAME OF FILE TO CREATE WITHOUT FILE EXTENSION ");
			    }
			}
			      break;
			case 2: System.out.println("\nENTER NAME OF file  "); 
			        n = stringReader.nextLine();
				System.out.println("Append the data of new employee to joining the firm");
			
				FileWriter fr = new FileWriter(n,true);
				BufferedReader fileReader = new BufferedReader(new FileReader(n));
				BufferedWriter fileWriter = new BufferedWriter(fr);
				validName = false;
					
			        System.out.println("Enter employee name");
			        name = stringReader.nextLine();	 // read name of employee
				name = name.trim();
			        nameList.add(name);
				System.out.println("enter employee number");
				eno=sc.nextInt();
				System.out.println("enter sex");
				sex=sc.next();
				System.out.println("enter gross salary");
				grosssal=sc.nextDouble();
			        totalDetails = name+"="+eno+":"+sex+":"+grosssal;
				fileWriter.write(totalDetails);
				fileWriter.newLine();
				fileWriter.flush();
				break;
			case 3:
				System.out.println("\nENTER NAME OF file"); 
		                name = stringReader.nextLine();
				FileWriter frr = new FileWriter(name,true);
				BufferedReader removalReader = new BufferedReader(new FileReader(name));
		
				
				String name2 = "";
				String line2 = "";
				String nameRemoved = "";
				String finalString = "";
				
				System.out.println("\nENTER THE NAME TO BE REMOVED");
				nameRemoved = stringReader.nextLine();
							
					while((line2=removalReader.readLine())!=null)
					{
						name2 = line2.substring(0,line2.indexOf("="));
						if(!name2.equals(nameRemoved))
						{
							finalString = finalString+line2+System.getProperty("line.separator");
						}
					}	
					BufferedWriter removalWriter = new BufferedWriter(new FileWriter(name));
					removalWriter.write(finalString);
					removalWriter.close();
					System.out.println("employee"+nameRemoved+" REMOVED ");
				
				break;
			case 4:
				System.out.println("\nENTER NAME OF FILE"); 
	          		n = stringReader.nextLine();
				FileWriter fw = new FileWriter(n,true);
				BufferedReader fileRead = new BufferedReader(new FileReader(n));
				System.out.println("enter employee name");
				for(int i=1;i<n.length();i++)
				{
					System.out.println(fileRead.readLine());
					
				}
				break;
				default:
					System.out.println("Exit");
					break;
		}
          }
        }
}


				
			         
			
					
