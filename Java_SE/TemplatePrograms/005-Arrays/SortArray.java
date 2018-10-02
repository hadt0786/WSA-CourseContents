// Program Description : This  program to sort an array
// Author :Sandhya
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = new int[]{5,90,35,45,150,3};
         

         System.out.println("Array Before Bubble Sort");
         for(int i=0; i < a.length; i++){
                 System.out.print(a[i] + " ");
         }
         int n = a.length;
         int temp = 0;
        
         for(int i=0; i < n; i++){
                 for(int j=1; j < (n-i); j++){
                        
                         if(a[j-1] >a[j]){
                                 //swap the elements!
                                 temp = a[j-1];
                                 a[j-1] = a[j];
                                 a[j] = temp;
                         }
                        
                 }
         }
         System.out.println("Array After Bubble Sort");
         for(int i=0; i < a.length; i++){
                 System.out.print(a[i] + " ");
                 
                 
         }
         
         System.out.println("smaller value"+a[0]);
         System.out.println("larger value"+a[4]);

	}

}
