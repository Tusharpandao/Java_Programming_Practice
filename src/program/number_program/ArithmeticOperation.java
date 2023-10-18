package program.number_program;


//wap to difine method to perform arithemetic operation any two value
import java.util.Scanner;

class ArithmeticOperation 
{

	public static int sub(int a ,int b)
	{
		return (a-b);
	}
	public static int add(int a ,int b)
	{
		return (a+b);
	}
	public static void div(int a ,int b)
	{
		System.out.println( a +"/"+b +"=" + a/b);
	}
	public static int multi(int a ,int b)
	{
		return (a*b);
	}




	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		int a=0;
		int b=0;
		System.out.println("1. subtraction of two number");
		System.out.println("2. addition of  two number" );
		System.out.println("3. mutiplication of  two number" );
		System.out.println("4. division of  two number" );
		
		System.out.println("chose your option" );
		int option=scanner.nextInt();
		
		

		switch (option)
		{
		case 1 :{
			System.out.println("Enter first value");
		   a =scanner.nextInt();
		   System.out.println("Enter secound value");
		  b=scanner.nextInt();
			System.out.println(a +"-"+b +"="  + sub(a,b));
			break;
			
		}
		case 2 :{
			System.out.println("Enter first value");
		 a =scanner.nextInt();
		System.out.println("Enter secound value");
		 b=scanner.nextInt();
			System.out.println(a +"+"+b +"=" + add(a,b));
			break;
			
		}
		case 3:{
			System.out.println("Enter first value");
		 a =scanner.nextInt();
		System.out.println("Enter secound value");
		 b=scanner.nextInt();
			System.out.println(a +"*"+b +"=" + multi(a,b));
			break;
			
		}
		case 4:{
			System.out.println("Enter first value");
		 a =scanner.nextInt();
		System.out.println("Enter secound value");
		 b=scanner.nextInt();
		  div(a,b);
			break;
			
		}

		default:
			System.out.println("Invalid Choses");
		
		}
		scanner.close();
	}
}
