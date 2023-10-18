package program.string_program;

//Wajp to calculate sum of digits persent in a given string.

class SumOfDigit 
{
	public static void main(String[] args) 
	{
		String str="qwe1234^%$";
		String str2="";
		int sum=0;
		for (int i=0; i<str.length() ;i++ )
		{
			char ch=str.charAt(i);

			if (Character.isDigit(ch))
			{
				str2=str2+ch;
			}
		}
		int num=Integer.parseInt(str2);
		while (num !=0)
		{
		 int digit=num %10;
			sum=sum+digit;
			num=num /10;
		}
		System.out.println(sum);
	}
}
  