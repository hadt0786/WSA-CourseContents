


/**


* Program Description: This is to show how we get the information from properties file by passing key 
* @Author: Vikas


*/


import java.util.*;

import java.io.*;


public class PropertiesClassTest3{


	public static void main(String[] args) throws IOException{
		
		

		FileReader reader=new FileReader("info.properties");// reading the properties file uisng FileReader class  
      
    		Properties p=new Properties(); 
    		p.load(reader); // loading the from Reader object

		// getProperty() method return value based on the key
       
    		System.out.println(p.getProperty("name"));  
    		System.out.println(p.getProperty("email")); 



	}


}
