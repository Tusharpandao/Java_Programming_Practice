package program.array;

//wap to check a number is positive or negative in a given array


import java.util.Scanner;

class  ArrayPositive
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("Enter array elements :");

		for (int i=0; i<arr.length ; i++)
		{
			arr[i]=scanner.nextInt();
		}
		for (int i=0; i<arr.length ;i++ )
		{
			if (arr[i]>=0)
			{
				System.out.println(arr[i] +" is positive number.");
			}
			else 
			{
				System.out.println(arr[i] +" is negative number.");
			}
		}
		scanner.close();
	}
}
