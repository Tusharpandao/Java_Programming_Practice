package program.number_program;

// wap to check the given number is Neon number or not
import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter the number: ");

		int num=scanner.nextInt();

		int square=num*num;
		
		int add=0;
		for (int i=square;i !=0 ; i /= 10 )
		{
			int lastDigit= i%10;
			add += lastDigit;


		}
		if (add == num)
		{
			System.out.println(num + " is an Neon Number");
		}
		else{
			System.out.println( num + " is not Neon Number");
		}
		scanner.close();
	}
}
