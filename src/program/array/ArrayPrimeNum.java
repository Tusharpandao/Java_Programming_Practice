package program.array;

//wajp to check whether number is prime or not from given array


import java.util.Scanner;

class ArrayPrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter a array element: ");
        int count=0;
		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=scanner.nextInt();
		}

		for (int i=0;i< arr.length ;i++ )
		{
			count=0;
			for (int j=1; j<=arr[i] ;j++ )
			{
				if (arr[i] % j==0)
				{
					count++;
				}
			}

			if (count==2)
			{
				System.out.println(arr[i] + " is  prime number.");
			}
			else
			{
				System.out.println(arr[i] + " is not a  prime number.");
			}
		}
		scanner.close();
	}
}
