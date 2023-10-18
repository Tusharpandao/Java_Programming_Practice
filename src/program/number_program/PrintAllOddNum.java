package program.number_program;

// wap to difine a method which print all odd digit present inside given number
import java.util.Scanner;
class PrintAllOddNum 
{
	public static void odd(int digit){
		int lastdigit=0;
		while(digit != 0)
		{
			lastdigit = digit%10;
			if( lastdigit%2 != 0){
				System.out.print(lastdigit + " ");
			}
			digit = digit/10;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter the Number :");
		int digit=scanner.nextInt();
		
		odd(digit);
		scanner.close();
	}
}
