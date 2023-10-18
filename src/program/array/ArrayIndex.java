package program.array;

//wajp to insert an element in an array at a specified index
import java.util.Scanner;
class  ArrayIndex
{
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		int arr[]={10,20,30,40,50,60,0};
		System.out.print("Enter a number to add in array :");
		int num=scanner.nextInt();
		System.out.print("Enter the index position which you want add the number :");
		int index=scanner.nextInt();

		for (int i=arr.length-1; i>=index ;i-- )
		{
			arr[i]=arr[i-1];
			if (index== i)
			{
				arr[i]=num;
			}

		}
		for ( int a : arr )
		{
			System.out.print(a+" ");
		}
		scanner.close();
	}
}
