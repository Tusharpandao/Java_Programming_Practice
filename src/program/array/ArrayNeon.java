package program.array;

//wajp to check whether number is neon or not from given array

import java.util.Scanner;
class ArrayNeon 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter elements of array: ");

        
        
		for (int i=0;i< arr.length ;i++ )
		{
			arr[i]=scanner.nextInt();
		}

		for (int i=0; i< arr.length ;i++ )
		{
		int	sq=0;
		int	sum=0;
		int digit=0;
			sq=arr[i]*arr[i];

			while (sq !=0)
			{
				digit=sq%10;
               sum=sum+digit;
				sq=sq/10;
			}

			if (sum==arr[i])
			{
				System.out.println(arr[i]+ " is neon number.");
			}
			else{
				{
				System.out.println(arr[i]+ " is not a neon number.");
			}
			}
		}
		scanner.close();
	}
}
