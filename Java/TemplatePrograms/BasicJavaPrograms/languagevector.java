package hello;
 
import java.util.Vector;
public class LanguageVector 
{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector l=new Vector();
		int len=args.length;
		for(int i=0;i<len;i++)
		{
			l.addElement(args[i]);
		}
		l.insertElementAt("keerthi",2);
	
int size= l.size();
String larr[]= new String[size];
l.copyInto(larr);

for(int i=0;i<size;i++)
{
	System.out.println(larr[i]);
}

l.removeElementAt(1);
l.copyInto(larr);
size=l.size();
System.out.println("After removing");
for(int i=0;i<size;i++)
{
	System.out.println(larr[i]);
}
}
}
