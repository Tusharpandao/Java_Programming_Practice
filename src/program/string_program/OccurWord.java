package program.string_program;

//Wajp to count number of occurence of each character in a given string. 

class  OccurWord
{
	public static void main(String[] args) 
	{
		String str="Hello World";
		//String arr[]=str.split(" ");
		int count=0;

		for (int i=0;i < str.length() ;i++ )
		{
			count=0;
			for (int j=0;j< str.length() ;j++ )
			{
                   if (str.charAt(j)==str.charAt(i))
                   {
					   count++;
                   } 
			}
			System.out.println(str.charAt(i)+ " = " + count);
		}
	}
}
