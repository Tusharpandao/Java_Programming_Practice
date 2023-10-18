package program.number_program;

// wap to print factors of a given number
import java.util.Scanner;
class PrintFactor
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();

		for (int i=1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				System.out.println(i);
			}
		}
		scanner.close();
	}
}
