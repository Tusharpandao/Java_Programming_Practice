package program.array;

// WAJP to create duplicate array
public class MakeDuplicateArray {
 public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    int ar[]=new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        ar[i]=arr[i];
    }
    for (int i : ar) {
        System.out.print(i + " ");
    }
 }   
}
