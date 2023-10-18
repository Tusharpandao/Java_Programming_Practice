package program.array;

import java.util.Scanner;

class ArraySum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[4];
		System.out.println("Enter the elements of array :" + " ");
       int sum=0;
		for (int i=0;i< arr.length ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		for (int j=0;j< arr.length ;j++ )
		{
			sum=sum+arr[j];
		}
		System.out.println("Sum of given array is ="+sum);
		sc.close();
	}
}
