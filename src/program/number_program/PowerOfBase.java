package program.number_program;

class PowerOfBase 
{
	public static void main(String[] args) 
	{
		
		int power =4;
		int base = 2;
		int ans=1;
		for (int i=1;i<=power ;i++ )
		{
			ans *=base;
			
		}
		System.out.println(ans);
	}
}
