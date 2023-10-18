package program.array;
import java.util.Scanner;
//wajp to check the array elements which are divisible by 3,4,5.
class  ArrayDiv
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter array elements :");

		for (int i=0;i<arr.length ;i++ )
		{
			arr[i]=scanner.nextInt();
		}

		for (int i=0;i< arr.length ;i++ )
		{
			if (arr[i]% 3==0)
			{
				System.out.println(arr[i]+" is divisible by 3");
			}

			if (arr[i]% 4==0)
			{
				System.out.println(arr[i]+" is divisible by 4");
			}

		    if (arr[i]% 5==0)
			{
				System.out.println(arr[i]+" is divisible by 5");
			}
	scanner.close();
		}
	}
}
