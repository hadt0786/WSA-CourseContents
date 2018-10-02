 
public class StringOrdering {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("Keerthi Sowmya");
	System.out.println("Original String="+str);
	//string length
	System.out.println("length of String is"+str.length());
	//accessing characters in String
	for(int i=0;i<str.length();i++)
	{
		int p=i+1;
System.out.println("character at position "+ p + " is "
		                                        + str.charAt(i));
}
//inserting String in the middle
	String astr=new String(str.toString());
	int pos=astr.indexOf("Sowmya");
	str.insert(pos," likhitha ");
	System.out.println("Modified String "+str);
//Modifying Characters
	str.setCharAt(8,'-');
	System.out.println("String now "+str);
//Appending String at end
	str.append(" pavithra ");
	System.out.println("Appended String "+str);
	}
  }
