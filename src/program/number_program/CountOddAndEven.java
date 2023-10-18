package program.number_program;

// wap to count even Number and odd number present between 1 and N
import java.util.Scanner;
class CountOddAndEven  
{
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N Number");
		int n=scanner.nextInt();
		int countOdd=0;
		int countEven=0;
		for (int i=1 ;i<=n;i++ )
		{
			if (i%2==0)
			{
				countOdd++;
			}
			else
			{
				countEven++;
			}
		}
		System.out.println("Count of odd number " + countOdd);
		System.out.println("Count of even number " + countEven);
		
		scanner.close();
	}
}
