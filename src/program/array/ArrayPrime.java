package program.array;

//wajp to count number of prime numbers in a given array.

import java.util.Scanner;
class  ArrayPrime 
{
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		int [] arr= new int[5];
		System.out.println("Enter array elements :");

		for (int i=0;i< arr.length ;i++ )
		{
			arr[i]=scanner.nextInt();
		}


		int primeCount=0;
		int count=0;

		for (int i=0; i< arr.length ;i++ )
		{
			count=0;
			for (int j=1;j<=arr[i] ;j++ )
			{
				if (arr[i] % j==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				primeCount++;
			}
		}
		System.out.println("Prime number count : "+primeCount);

		scanner.close();
	}
}
