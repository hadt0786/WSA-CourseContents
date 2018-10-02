package hello;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WrInvest {

public static void  main(String args[]) throws IOException {
Float Prinamt=new Float(0);//converting number to object
Float intRat=new Float(0);
int numYears=0;
BufferedReader br=new BufferedReader(new InputStreamReader
		(System.in));
System.out.println("enter prinicipal amount");
String  prinstr=br.readLine();

Prinamt=Float.valueOf(prinstr);//string to number object
System.out.println("enter Rate of intrest");
String  intrstr=br.readLine();
intRat=Float.valueOf(intrstr);//string to number object
System.out.println("enter number of years");
String  yearstr=br.readLine();
numYears=Integer.parseInt(yearstr);//Numeric string to number 
float value=loan(Prinamt.floatValue(),intRat.floatValue(),
		                                             numYears);
printline();
System.out.println("finaal value="+value);
printline();
	}
	//method to compute final value
static float loan(float p,float r,int n)
{
	int year=1;
	float sum=p;
	while(year<=n)
	{
		sum=sum*(1+r);
		year=year+1;
	}
	return sum;
}
//method to draw line
static void printline()
{
	for(int i=1;i<=30;i++)
	{
		System.out.print("=");
		
	}
System.out.println("");
}
}

