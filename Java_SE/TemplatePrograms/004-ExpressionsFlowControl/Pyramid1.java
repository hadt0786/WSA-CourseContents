/*   Program  to display

   A
   A B
   A B C
   A B C D*/

public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;
        for(i=65;i<=69;i++)
        {
        	for(j=65;j<=i;j++)
        	{
        		System.out.print((char)j);
        	}
        	System.out.println();
        }
	}

}
