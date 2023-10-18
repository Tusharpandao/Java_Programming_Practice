package program.array;

import java.util.Scanner;
// wjp to count number of even and odd number in a given array
public class CountEvenandOdd {
    public static void main(String[] args) 
	{
		int [] arr= new int [5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a element for array : ");
		for (int i=0;i< arr.length ; i++)
		{
			arr[i]=scanner.nextInt();
		}

		 int evenCount=0;
		 int oddCount=0;

		for (int i=0; i< arr.length ;i++ )
		{
			if (arr[i] % 2==0)
			{
				evenCount++;
			}
			else{
				oddCount++;
			}
		}
         
		 System.out.println("Even count  : "+evenCount);
		 System.out.println("Odd count  : "+oddCount);
		 scanner.close();
	}
}
