package program.string_program;

//wap to convert first character of each word to uppercase

class AlphaUpper 
{
	public static void main(String[] args) 
	{
		String str="good morning, have a nice day";
		String str2="";
		String arr[]=str.split(" ");

		for (int i=0; i < arr.length ;i++ )
		{
			String word=arr[i];
			if (word.charAt(0) >= 'a' && word.charAt(0)<='z')
			{
				//str2=str2 + word.replace(word.charAt(0),((char)(word.charAt(0)-32)))+" ";
				str2=str2 + word.replace(word.charAt(0),Character.toUpperCase(word.charAt(0)))+" ";
			}
			else{
			  str2 = str2 + word +" ";
			}
		}
		System.out.println(str2);
	}
}
