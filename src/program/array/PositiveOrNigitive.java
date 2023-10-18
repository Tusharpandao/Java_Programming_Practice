package program.array;

// WAJP to check a number is positive or nigitive in an array
import java.util.Scanner;
public class PositiveOrNigitive {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr=new int[5];
        System.out.println("Enter the numbers");
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i]>0) {
                System.out.println(arr[i] + " is positive number");
            }
            else{
                System.out.println(arr[i] + " is nigitive number");
            }
        }
        scanner.close();
    }
}
