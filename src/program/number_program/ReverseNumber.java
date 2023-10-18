package program.number_program;

class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int number = 987654, reverse = 0;  
		while(number != 0)   
		{  
		int lastdigit = number % 10;  
		reverse = reverse * 10 + lastdigit;
		number = number/10;  
		}	
		System.out.println(reverse);
	}
}
