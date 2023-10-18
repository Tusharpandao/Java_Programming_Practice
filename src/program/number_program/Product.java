package program.number_program;

// Wap to find Product(multiplication) of  given number 
import java.util.Scanner;
class Product 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number for find Product : ");
		int n=scanner.nextInt();
		int a=n;
		int prod=1;
		
		while(n>0)
		{
			int lastdigit=n%10;
			prod=prod*lastdigit;
			// System.out.println(prod);
			n=n/10;

		}
		System.out.println("Product of "+ a +" is : " + prod);

		scanner.close();
	}
}
