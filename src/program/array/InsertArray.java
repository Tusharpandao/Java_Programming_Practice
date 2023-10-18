package program.array;

// WAJP to insert the given element to given position
import java.util.Scanner;
public class InsertArray {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[]={10,20,30,40,50,0};
        for (int i : arr) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nenter the number you went to added ");
        int element=scanner.nextInt();
        System.out.println("enter the index position");
        int index=scanner.nextInt();

        for (int i = arr.length-1; i >=index; i--) {

            arr[i]=arr[i-1];
            if (i == index) {
                arr[i]= element;
            }
        }
        for (int i : arr) {
            
            System.out.print(i + " ");
        }
        scanner.close();
    }
    
}
