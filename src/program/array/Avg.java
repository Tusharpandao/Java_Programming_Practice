package program.array;

//wap to calculate avg of given array.
import java.util.Scanner;
class Avg 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		int [] arr=new int[4];
		System.out.println("Enter the elements of array :" + " ");
       int sum=0;
	   int avg=0;
		for (int i=0;i< arr.length ;i++ )
		{
			arr[i]=sc.nextInt();
		}
		for (int j=0;j< arr.length ;j++ )
		{
			sum=sum+arr[j];
		}
		avg=sum/arr.length;
		System.out.println(" Avg of given array = "+ avg);

		sc.close();
	}
}
