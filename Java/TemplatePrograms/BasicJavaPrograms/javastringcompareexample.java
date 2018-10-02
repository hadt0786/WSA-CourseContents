package hello;


 
public class JavaStringCompareExample{
 
  public static void main(String args[]){
 String str1 = "Hello World";
  String str2 = "hello world";
  
 int n;
 /* compare two strings, case sensitive */
 n= str1.compareTo(str2);
 if(n==0)
  System.out.println("both are equal" );
 else
	 System.out.println("Both are not equal");
  /* compare two strings, ignores character case  */
 n=str1.compareToIgnoreCase(str2);
 if(n==0)
	  System.out.println("both are equal" );
	 else
		 System.out.println("Both are not equal");
  
  }
}
