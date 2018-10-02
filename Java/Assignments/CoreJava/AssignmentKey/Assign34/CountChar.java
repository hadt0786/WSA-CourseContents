/*
 * Count number of characters in a file
 */
import java.io.*;
import java.util.*;
class CountChar{
     public static void main(String arg[]) throws Exception
        {
          int cntchar=0;
          String s;
          StringTokenizer st;
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.print("Enter the filename : "); //Ex:  home/likhitha/Desktop/hai.txt 
          s=br.readLine();
          br=new BufferedReader(new FileReader(s));
          while((s=br.readLine())!=null)
           {
            st=new StringTokenizer(s," ,;:.");
            while(st.hasMoreTokens())
             {
               s=st.nextToken();
               cntchar+=s.length();
             }
          }
         System.out.println("Character Count : "+cntchar);
         br.close();
        }
}