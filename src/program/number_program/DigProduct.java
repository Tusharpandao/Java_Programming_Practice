package program.number_program;

class DigProduct  
{
	public static void main(String[] args) 
	{
		int n=2345;
		int prod=1;
		
		while(n>0)
		{
			int lastdigit=n%10;
			if (lastdigit %2 !=0)
			{
				prod=prod*lastdigit;
			}
			
			n=n/10;

		}
		System.out.println(prod);
	}
}
