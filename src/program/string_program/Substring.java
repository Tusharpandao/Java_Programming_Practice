package program.string_program;

//Wajp to define a method to check substring for a given string

class  Substring
{
	public static void main(String[] args) 
	{
		String str="Hello World!";
		String subStr="Hello";
		subString(str,subStr);
	}
	public static void subString(String str1,String str2)
	{ 
		if (str1.contains(str2))
		{
			System.out.println(str2+" is a substring of  "+str1);
		}
		else
		{
              System.out.println(str2+" is not a substring of  "+str1);
		}

	}
}
