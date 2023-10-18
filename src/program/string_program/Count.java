package program.string_program;

//WAP to count the  character present in given string.
class Count 
{
	public static void main(String[] args) 
	{
		String str="Good morning, have a nice day!";
		//System.out.println(str.length());
		int count=0;
		for (int i=0;i<str.length() ;i++ )
		{
			count++;
		}
		System.out.println(count);
	}
}
