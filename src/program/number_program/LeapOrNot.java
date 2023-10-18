package program.number_program;

// wap to print the given year is leap or not
import java.util.Scanner;
class LeapOrNot 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print( "Enter an Year : ");
		int year=scanner.nextInt();

		if (((year%4==0)&&(year%100 !=0)) || (year%400 ==0))
		{
			System.out.println("this is leap year");

		}
		else{
			System.out.println("this is not leap year");

		}
		scanner.close();
	}
}
