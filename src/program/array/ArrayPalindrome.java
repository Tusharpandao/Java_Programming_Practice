package program.array;

//wajp to check whether number is palindrome or not from given array

import java.util.Scanner;

class ArrayPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("Enter elements of array: ");

        int rev=0;
		int digit=0;
		int  num=0;
        
		for (int i=0;i< arr.length ;i++ )
		{
			arr[i]=scanner.nextInt();
		}

		for (int i=0;i< arr.length ;i++ )
		{
			num=arr[i];
			digit=0;
			rev=0;

			while (num !=0)
			{
				digit=num%10;
                rev=rev*10+digit;
				num=num/10;
			}

			if (arr[i]==rev)
			{
				System.out.println(arr[i]+" is palindrome number.");
			}
			else
			{
				System.out.println(arr[i]+ " is not a pallindrome number.");
			}
            
		}
		scanner.close();
	}
}
