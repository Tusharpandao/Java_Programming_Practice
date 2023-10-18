package program.array;

//wajp to check whether number is strong or not from given array


import java.util.Scanner;

class ArrayStrong 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[7];
		System.out.println("Enter elements of array: ");
		
		int digit=0;
		int sum=0;
        int fact=1;
		int num=0;
		
		for (int i=0;i< arr.length ;i++ )
		{
			arr[i]=scanner.nextInt();
		}

		for (int i=0; i< arr.length ;i++ )
		{
			num=arr[i];
			fact=1;
			sum=0;
			digit=0;

			while (num !=0)
			{
				digit= num % 10;
                fact=1;

				for (int j=1;j <=digit ; j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
				num=num/10;
			}
            
			if (arr[i]==sum)
			{
				System.out.println(arr[i]+" is strong number.");
			}
			else
			{
				System.out.println(arr[i]+" is not a strong number.");
			}
		}
		scanner.close();

	}
}
