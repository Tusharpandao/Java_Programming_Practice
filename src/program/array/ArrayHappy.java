package program.array;

//wajp to check whether number is happy or not from given array

import java.util.Scanner;
class ArrayHappy 
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
		   
		int result=arr[i];
		while ( result !=1 && result != 4)
		{
			result=getResult(result);
		}
		if (result==1)
		{
			System.out.println(arr[i]+" is a happy number.");
		}
		else
		{
			System.out.println(arr[i]+" is not a happy number.");
		}

       }
	   scanner.close();

	}

	public static int getResult(int num)
	{
		int sum=0;
        int digit=0;
		while (num !=0)
		{
			digit=num %10;
			sum=sum+(digit*digit);
			num=num /10; 
		}
			return sum;
	}
}
