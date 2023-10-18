package program.string_program;

//wap to count a character present inside a each word.

class Count2 
{
	public static void main(String[] args) 
	{
		String str="good morning, have a nice day!";
		String arr[]=str.split(" ");
		for (int i=0;i< arr.length ;i++ )
		{
			String word=arr[i];
			System.out.println( "Count of "+word+" = "+word.length());
		}
	}
}
