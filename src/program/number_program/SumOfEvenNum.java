package program.number_program;

// wap to find the sum of even number between 1 and N Numbers?
import java.util.Scanner;
class SumOfEvenNum 
{
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the N number");
		int n=scanner.nextInt();
		int sum=0;
		for (int i=1;i<=n ;i++ )
		{
			if (i%2==0)
			{
				sum += i;
				
			}
		}
		System.out.println("Sum of N number "+ sum);
		scanner.close();
	}
}
