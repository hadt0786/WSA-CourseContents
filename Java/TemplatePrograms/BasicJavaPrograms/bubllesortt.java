package hello;

public class BublleSortt {
	 
    public static void main(String[] args) {
           

         int a[] = new int[]{5,90,35,45,150,3};
           

            System.out.println("Array Before Bubble Sort");
            for(int i=0; i < a.length; i++){
                    System.out.print(a[i] + " ");
            }
           
            //sort an array using bubble sort algorithm
            bubbleSort(a);
           
            System.out.println("");
           
            //print array after sorting using bubble sort algorithm
            System.out.println("Array After Bubble Sort");
            for(int i=0; i < a.length; i++){
                    System.out.print(a[i] + " ");
            }

    }

    private static void bubbleSort(int[] a) {
           
                         
           
            int n = a.length;
            int temp = 0;
           
            for(int i=0; i < n; i++){
                    for(int j=1; j < (n-i); j++){
                           
                            if(a[j-1] > a[j]){
                                    //swap the elements!
                                    temp = a[j-1];
                                    a[j-1] = a[j];
                                    a[j] = temp;
                            }
                           
                    }
            }
   
    }
}



