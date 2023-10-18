package program.array;

//wajp to check whether number is perfect or not from given array

import java.util.Scanner;

class ArrayPerfect 
{
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter array elements:");
         
		for (int i=0;i<arr.length ; i++)
		{
			arr[i]=scanner.nextInt();
		}
        int sum=0;
		for (int i=0;i< arr.length ;i++ )
		{
			sum=0;
			for (int j=1;j<arr[i] ;j++ )
			{
				if (arr[i] % j==0)
				{
					sum=sum+j;
				}
			}

			if (sum==arr[i])
			{
				System.out.println(arr[i]+" is a perfect number.");
			}
		    else
			{
				System.out.println(arr[i]+" is  not  a perfect number.");
			}
		}
		scanner.close();
	}
}
