

/**


* Program Description: This program is to show how to create a properties file and how to access the file
* @Author: Vikas

*/

import java.util.*;

import java.io.*;

public class PropertiesClassTest2{



	public static void main(String[] args) throws IOException{

		Properties p=new Properties();
  		
		//public void setProperty(String key,String value): sets the properties in the properties object

		p.setProperty("name","Vikash Kumar");  
		p.setProperty("email","vikash_kumar@emertxe.com");  
		
		// public void store(Writer w, String comment): store() method writes the properties in the writer object
		

		p.store(new FileWriter("/home/vikash/Desktop/info.properties"),"Properties file creation example");
  

	}

}
