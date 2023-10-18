package program.string_program;

//wap to count lowercase alphabet and upperCase alphabet

class AlphaCount 
{
	public static void main(String[] args) 
	{
		String str="Good morning, have a nice day!";
		int upperCount=0;
		int lowerCount=0;

		for (int i=0;i< str.length() ;i++ )
		{
			char ch=str.charAt(i);
			if (ch>='A' && ch<='Z')
			{
				upperCount++;
			}
			else if (ch>='a' && ch<='z')
			{
				lowerCount++;
			}
		}
		System.out.println("Uppercase Count : "+upperCount);
		System.out.println("Lowercase Count : "+lowerCount);
	}
}
