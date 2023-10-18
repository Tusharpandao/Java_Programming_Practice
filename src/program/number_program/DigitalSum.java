package program.number_program;

class DigitalSum 
{
	public static void main(String[] args) 
	{
		int a=2324;
		int sum=0;
		while (a>0)
		{
				int lastdigit=a%10;
				if (lastdigit % 2==0)
				{
					sum=sum+lastdigit;
				}


				a=a/10;
		}
		System.out.println(sum);
	}
}
