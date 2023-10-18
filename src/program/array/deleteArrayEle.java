package program.array;

// WAJP to delete element given index position

import java.util.Scanner;

public class deleteArrayEle {


     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        for (int i : arr) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
       
        System.out.println("\nenter the index position you want delete element");
        int index=scanner.nextInt();

        for (int i = index; i <arr.length - 1; i++) {

            arr[i]=arr[i +1];
            
            
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print( arr[i] + " ");
        }
        scanner.close();
    
}
}