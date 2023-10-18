package program.array;


import java.util.Scanner;

class ArrayArmstrong 
{
	//wajp to check whether number is armstrong or not from given array

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("Enter elements of array: ");
		
		int digit=0;
		int sum=0;
        int pro=1;
		int copy=0;
		int copy2=0;
		int count=0;
		
		for (int i=0;i< arr.length ;i++ )
		{
			arr[i]=scanner.nextInt();
		}

		for (int i=0; i< arr.length ;i++ )
		{
			copy=arr[i];
			copy2=arr[i];
			count=0;
			pro=1;
			sum=0;
			digit=0;
			while (copy !=0)
			{
				count++;
				copy=copy/10;
			}

			while (copy2 != 0)
			{
				digit=copy2%10;
				pro=1;
				for (int j=1;j<=count ;j++ )
				{
					pro=pro*digit;
				}
				sum=sum+pro;
				copy2=copy2/10;
			}

			if (arr[i]==sum)
			{
				System.out.println(arr[i]+" is armstrong number.");
			}
			else
			{
                System.out.println(arr[i]+" is not armstrong number.");
			}

		}
		scanner.close();
	}
}
