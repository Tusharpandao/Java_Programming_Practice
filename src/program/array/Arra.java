package program.array;

import java.util.Scanner;
public class Arra {
    public static void main(String[] args) {
    	// WAJP to count Number of even and odd number
        
        Scanner scanner=new Scanner(System.in);


        int [] arr=new int[5];
        int evenCount=0;
        int oddCount=0;
        System.out.println("Enter the numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
            
        }

       for (int i = 0; i < arr.length; i++) {
        if(arr[i]%2 ==0){
            evenCount++;
        }
        else{
            oddCount++;
        }
       }
        System.out.println("enven count : " + evenCount);
        System.out.println("odd count : "+ oddCount);
       scanner.close();
    }
    
}
