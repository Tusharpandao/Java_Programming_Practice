package program.string_program;

//wap to calculate count of word .
class Word 
{
	public static void main(String[] args) 
	{
		String str = "Good Morning, Have a nice day!";
		String arr[]=str.split(" ");
		System.out.println(arr.length);
	}
}
