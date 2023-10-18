package program.array;

//wajp to delete the dulpicate elements from the array.

import java.util.Scanner;
class  ArrayDuplicate
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[6];
		int [] arr2= new int[arr.length];
		int count=0;
		int index=0;
		System.out.println("Enter a array elements: ");
		for (int i=0;i< arr.length ;i++ )
		{
			arr[i]=scanner.nextInt();
		}

		for (int i=0;i<arr.length ;i++ )
		{
			count=0;
			for (int j=i+1; j< arr.length;j++ )
			{
				if (arr[i]==arr[j])
				{
					count++;
				}
		
			}
			if (count==0)
			{
              arr2[index]=arr[i];
			  index++;
			}
			
		}
		for (int i=0;i<arr2.length ; i++)
		{
			if (arr2[i] !=0)
			{
				System.out.print(arr2[i]+" ");
			}
		}
		
		scanner.close();
	}
}
