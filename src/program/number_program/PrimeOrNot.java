package program.number_program;

// wap
import java.util.Scanner;
class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scanner.nextInt();

		if (num %2==0 && num %num==0)
		{
			System.out.println(num + " is prime number");
		}
		else{
			System.out.println(num + " is not prime number");
		}
		scanner.close();
	}
}
