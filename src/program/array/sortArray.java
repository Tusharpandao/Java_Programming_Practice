package program.array;

// WAJP to short an array  in assending order using short method 

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int arr[]={20,49,23,53,66,10};
        System.out.println("array before sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\narray after sorting ");

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i +" ");
        }

    }
}
