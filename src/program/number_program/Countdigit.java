package program.number_program;

// wap to count numberof digit present inside number
class Countdigit
{
	public static void main(String[] args) 
	{
		int digit=3332345;
		int count=0;
		/* while (digit>0)
		{
			
			count++;
			digit = digit/10;
		} */
		for (int i=digit; i != 0 ;i=i/10 )
		{
			count++;
			
		}

		System.out.println(count);
	}
}
