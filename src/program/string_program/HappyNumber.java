package program.string_program;

import java.util.Scanner;

class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=scanner.nextInt();
		int result=num;

		while (result !=1 && result !=4)
		{
			result=getResult(result);
		}
		if (result==1)
		{
			System.out.println(num+" is a happy number.");
		}
		else
		{
			System.out.println(num+" is not a happy number.");
		}
			scanner.close();
	}

	public static int getResult(int num)
	{
		int digit=0;
		int sum=0;

		while (num !=0)
		{
			digit=num%10;
			sum=sum+(digit * digit );
			num=num/10;
		}
		return sum;
	}

}
