package program.number_program;

// wap to display even number between 1 and 10
class  EvenNumber
{
	public static void main(String[] args) 
	{
		int a=10;
		System.out.print("the even number between 1 to 10 is : ");
		for (int i =1 ;i<=a ;i++ )
		{
			if (i%2==0)
			{
				System.out.print(i +" ");
			}
		}
	}
}

// wap to display odd number between 1 and 10
class  OddNumber
{
	public static void main(String[] args) 
	{
		int a=10;
		System.out.print("the odd number between 1 to 10 is : ");
		for (int i =1 ;i<=a ;i++ )
		{
			if (i%2==1)
			{
				System.out.print(i +" ");
			}
		}
	}
}
