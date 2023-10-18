package program.number_program;

// wap to print lastdigit of given number
import java.util.Scanner;
class lastDigit 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number");

		int n=scanner.nextInt();
		System.out.println("last digit of "+n+" is "+n%10);
		scanner.close();
	}
}
