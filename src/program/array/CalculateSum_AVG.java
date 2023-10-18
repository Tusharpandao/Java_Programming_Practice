package program.array;

import java.util.Scanner;
// WAJP to calculate sum ad avg of even number givin array
public class CalculateSum_AVG {

    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int arr[]=new int[5];
        System.out.println("Enter a number");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        int sum=0;
       
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                sum +=arr[i];
                count++;
            }
        }
        System.out.println("Sum of even number " + sum);
        System.out.println("AVG of even number "+ sum/count);


      scanner.close();
    }
    
}
