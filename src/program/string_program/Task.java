package program.string_program;

class Task 
{
	public static void main(String[] args) 
	{
		String str="7o0d &orning, Have a nice day! ";
		String str2="";
		String arr[]=str.split(" ");
		
		for (int i=0;i< arr.length ;i++ )
		{
			String word=arr[i];
			char ch=word.charAt(0);
			if (Character.isAlphabetic(ch))
			{
				if (ch>='a' && ch<='z')
				{
					str2 =str2+ word.replace((ch),((char)(ch-32)))+" ";
					//str2 =str2+ word.replace((ch),(Character.toUpperCase(ch)))+" ";
				}
				else
				{
					str2 = str2+ word +" ";
				}

			}
		}
		System.out.println(str2);
	}
}
