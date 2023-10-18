package program.number_program;

// wap to count nunmber of factor for a given number
import java.util.Scanner;
class CountNumberFactor
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the number : ");
		int num=scanner.nextInt();
		int count=0;
		for (int i=1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				count++;
			}
		}
		System.out.println("Number of factor " + num+ " is " + count); 
		
		scanner.close();
	}
}
