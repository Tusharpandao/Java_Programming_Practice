package program.array;

//wap to check the number from given array is prime or not


import java.util.Scanner;

class ArrayPrimeNumber 
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
				if (arr[i] % 2==0)
				{
					count++;
				}
			}

			if (count==2)
			{
				System.out.println(arr[i] + " is  prime number");
			}
			else
			{
				System.out.println(arr[i] + " is not a  prime number");
			}
		}
		scanner.close();
	}
}
