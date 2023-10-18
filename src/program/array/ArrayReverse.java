package program.array;

// WAJP to reverse element in a given array
public class ArrayReverse {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
           System.out.println("Array before reversing");
           for (int i : arr) {
            System.out.print(i +" ");
           }

           int start=0;
           int end=arr.length-1;
           int temp=0;
           while (start < end) {
            
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
           }
           System.out.println("\nArray after reversing");
           for (int i : arr) {
            System.out.print(i +" ");
            
           }
    }
}
