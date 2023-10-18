package program.number_program;

// wap to Check the given Number is Strong Number or Not 
import java.util.Scanner;
class  StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=scanner.nextInt();	
		int add=0;

		for (int i=num;i != 0 ;i /=10 )
		{
			int lastdigit=i%10;
			int fact=1;
			for (int a=lastdigit; a !=0 ;a-- )
			{
				fact *=a;
			}
			//System.out.println(fact);
			add += fact;
		}
		if (num == add)
			{System.out.println(num + " is  Strong Number ");}
		
		else
			{System.out.println(num + " is not Strong Number ");}

			scanner.close();
	}
}
