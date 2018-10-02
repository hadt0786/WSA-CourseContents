package hello;
public class JavaStringArray {
public static void main(String args[]){
      
String[] str1 = new String[]{"Sangeeta", "fareeha", "Sowmya"};
       
        //first declare String array
        String[] str2 = new String[3];
       

     
       str2[0] = "Likhitha";
        str2[1] = "Praveena";
       str2[2] = "Anjani";
            
//this will retrieve second element of first String array
        System.out.println(str1[1]);
        
        //length of array
        int length = str1.length;
        
        System.out.println("String array length is: " + length);
       
        //iterate the String array using loop
        for(int i=0; i < str2.length; i++){
                System.out.println(str2[i]);
        }
}
}