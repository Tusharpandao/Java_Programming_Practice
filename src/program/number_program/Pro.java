package program.number_program;

import java.util.Scanner;

class Pro 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int a =scanner.nextInt();

		System.out.println(a*a*a);
		scanner.close();
	}
}
