package program.string_program;

//wap to count vowels and consonents.

class  CountVowel
{
	public static void main(String[] args) 
	{
		String str="Good morning, have a nice day!";
		String str2=str.toLowerCase();
		int vowelCount=0;
		int conCount=0;
		for (int i=0;i< str2.length() ;i++ )
		{
			char ch=str2.charAt(i);
		   if (Character.isAlphabetic(ch))
		   {
			   if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			   {
				   vowelCount++;
			   }
			   else{
				   conCount++;
			   }
		   }
			
		}
		System.out.println("Vowel "+vowelCount);
		System.out.println("Consonent  "+conCount);
		}
	}

