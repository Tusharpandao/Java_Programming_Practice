package program.number_program;

// wap to check the given number is SpyNumber is or not 
import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=scanner.nextInt();
		int copy=n;
		int prod=1;
		int sum=0;
		while(n>0)
		{
			int lastdigit=n%10;
			prod=prod*lastdigit;
			sum=sum+lastdigit;
			
			n=n/10;

		}
		if (prod==sum)
		{
			System.out.println(copy+ " is SpyNumber");
		}
		else{
			System.out.println(copy +" is not SpyNumber");
		}
		scanner.close();
	}
}
