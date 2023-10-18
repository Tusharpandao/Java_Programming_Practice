package program.number_program;

// wap to take mobile number from user and print the largest digit present digit
import java.util.Scanner;
class LargestDigit

{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter Mobile number " );
		long mobile=scanner.nextLong();
		//long copy=mobile;
		long large=0;
		long temp=0;

		while (mobile != 0 )
		{
			temp= mobile%10;
			if (large < temp)
			{
				large = temp;
			}
			
			mobile =mobile/10;
		}

		System.out.println(large);
		scanner.close();
	}
}
