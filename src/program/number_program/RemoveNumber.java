package program.number_program;

class RemoveNumber 
{
	public static void main(String[] args) 
	{
		int n = 23453;
		int sum=0;
		while (n>0)
		{
				int lastdigit=n%10;
				sum=sum+lastdigit;
				n=n/10;
		}
	

		System.out.println(sum);
		
	}
}
