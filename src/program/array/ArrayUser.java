package program.array;

//wap to get user input and print that element.

import java.util.Scanner;

class ArrayUser 
{
	public static void main(String[] args) 
	{
		int [] arr= new int[4];
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a value :");
		
		for (int i=0;i< arr.length ; i++ )
		{
			arr[i]=scanner.nextInt();
		}
		for (int j=0;j< arr.length ;j++ )
		{
          System.out.print(arr[j]+" ");
		}
		scanner.close();

	}
}
