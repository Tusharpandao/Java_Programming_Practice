package program.array;

// WAJP to swap first hafp an with the second with the array
public class Swaphap {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};

        int middle=arr.length/2;
      int copy=middle;
    
       for (int i = 0; i !=copy +1; i++) {
        
        
        
            int temp=arr[i];
        arr[i]=arr[middle];
            arr[middle]=temp;
        middle++;
        
       }
       for (int i : arr) {
        System.out.print( i + " ");
       }



    }
}
