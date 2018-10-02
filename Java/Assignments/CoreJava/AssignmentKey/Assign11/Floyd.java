/*
(b). Modify the program to produce the following form of Floyd’s triangle. (Floyd.java)
1 
01 
101 
0101 
10101 
*/
class Floyd
 { 
    public static void main(String ar[])
     { 
       int i,j,c;
       c = 0;
	//loop repeats 5 times
	for (i = 1; i<= 5; i++)
 	 {
   	   c=i;
   	 	for(j=1;j<=i;j++)
   	  	{
          	  if((c%2)==0)
           	  {
           	  System.out.print(0+" ");
          	  }
          	  else
           	  {
            	   System.out.print(1+" ");
           	  } 
            	   c++;
   	  	}
          	   System.out.println();
         }
     }
 }
