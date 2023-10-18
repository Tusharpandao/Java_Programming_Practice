package program.string_program;

//wap to check the given string is pangram or not pangram
//(all alphabet are present from a to z then it is called as pangram string)

class ReturnAlpha 
{
	public static void main(String[] args) 
	{
		String str="Hello World!";
		String str2=str.toLowerCase();
		int count=0;

		for (char ch='a'; ch<='z' ;ch++ )
		{
			for (int i=0;i< str2.length() ;i++ )
			{
				if (str2.charAt(i)==ch)
				{
					count++;
					break;
				}
			}
		}
		if (count==26)
		{
			System.out.println("Pangram String");
		}
		else
		{
			System.out.println("Not a Pangram String");
		}
	 
	}
}
