package program.string_program;

//wap to count a character present inside a each word & print that count along with number
class AllChar 
{
	public static void main(String[] args) 
	{
		String str="Good morning, Have a nice day!";
		String arr[]=str.split(" ");
	
        
		for (int i=0;i<arr.length ;i++ )
		{
			String word=arr[i];
			System.out.println(word+"= "+ word.length());
		}
		
	}
}
