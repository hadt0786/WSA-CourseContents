 

public class Continlabel {
 
  public static void main(String[] args) {
   
    int intArray[][] = new int[][]{{1,2},{2,3}};
   
    Outer:
    for(int i=0; i < intArray.length; i++)
    {
      for(int j=0; j < intArray[i].length ; j++)
      {
        if(intArray[i][j] == 3)
          continue Outer;
        System.out.println("Element is : " + intArray[i][j]);
      }
    }
     
  }
}