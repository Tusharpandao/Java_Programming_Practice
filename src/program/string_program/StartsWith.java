package program.string_program;

//wap to count how many word starts with vowel.

class StartsWith 
{
	public static void main(String[] args) 
	{
        String str="Good morning, have a nice day!";
		String str2=str.toLowerCase();
		String arr[]=str2.split(" ");
		int count=0;
		for (int i=0 ; i< arr.length ;i++ )
		{
			String word = arr[i];
			char ch=word.charAt(0);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

/*if (word.startsWith("a"))
			{
				count++;
			}
			else if (word.startsWith("e"))
			{
				count++;
			}
			else if (word.startsWith("i"))
			{
				count++;
			}
			else if (word.startsWith("o"))
			{
				count++;
			}
			else if (word.startsWith("u"))
			{
				count++;
			}
*/