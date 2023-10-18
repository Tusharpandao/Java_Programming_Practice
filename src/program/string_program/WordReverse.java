package program.string_program;

//wajp to reverse words in a given string
class  WordReverse
{
	public static void main(String[] args) 
	{
		String str="Hello Good Morning";
		String arr[]=str.split(" ");
		String str2="";

		for (int i=0;i < arr.length ;i++ )
		{
			String word=arr[i];
			String rev="";
			for (int j=word.length()-1;j>=0 ;j-- )
			{
				rev=rev + word.charAt(j);
			}
		    str2=str2+rev+" ";
		}
		System.out.println(str2);	
		
	}
}
