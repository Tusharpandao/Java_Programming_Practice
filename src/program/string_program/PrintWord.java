package program.string_program;

//wap to print word in a given string
class PrintWord 
{
	public static void main(String[] args) 
	{
		String str="Good morning, Have a nice day!";
		String arr[]=str.split(" ");
		for (int i=0;i< arr.length ;i++ )
		{
			System.out.println(arr[i]);
		}
	}
}
