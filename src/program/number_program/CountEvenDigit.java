package program.number_program;

// Wap to count even digit present in a given number
import java.util.Scanner;
class  CountEvenDigit
{
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter the Number :");
		int digit=scanner.nextInt();
	//12345
		int count=0;
		
		while(digit != 0)
		{
			int lastdigit = digit%10;
			if( lastdigit%2==0){
				count++;
			}
			digit = digit/10;
		}
		System.out.println(count);
		
		

		
		scanner.close();

	}
}
