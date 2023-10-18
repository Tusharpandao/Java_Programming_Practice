package program.array;


import java.util.Scanner;
class  ArrayDelete
{

	//wajp to delete an element in the specified index of given array.	
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		int arr[]={10,20,30,40,50,60,0};
		System.out.print("Enter the index position which you want to delete :");
		int index=scanner.nextInt();

		for (int i=index; i< arr.length-1 ;i++ )
		{
			arr[i]=arr[i+1];

		}
		for ( int a : arr )
		{
			if (a !=0)
			{
				System.out.print(a+" ");
			}
		}
		scanner.close();	
	}
}
