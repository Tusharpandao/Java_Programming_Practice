package program.number_program;

// WAP to find of multiple of 5 between 1 to N

import java.util.Scanner;
class MultileByFive 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the N value : ");
		int n=scanner.nextInt();

		System.out.print("Multiple of 5 Between 1 to " +n+" = ");
		for (int i = 1;i<=n ;i++ )
		{
			if (i%5==0)
			{
				System.out.print(i + ",");

			} 
		}
		scanner.close();
	}
}
