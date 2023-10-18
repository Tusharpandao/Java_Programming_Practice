package program.string_program;

// wap to print the word which has even length

class EvenCount 
{
	public static void main(String[] args) 
	{
		String str="Good morning, have a nice day";
		String arr[]=str.split(" ");
	    
		for (int i=0;i< arr.length ; i++)
		{
			String word=arr[i];
			if (word.length() % 2==0)
			{
				System.out.println(word);
			}
		}
	}
}
