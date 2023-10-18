package program.string_program;

// wajp to count number of alphabet,no of digit,no of white spaces and no special character.

class Check 
{
	public static void main(String[] args) 
	{
		String str="Good morning, Have a nice day1!";
        int alphaCount=0;
		int space=0;
		int special=0;
		int digit=0;

		for (int i=0;i<str.length() ;i++ )
		{
		   char ch=str.charAt(i);
		   
		  if (ch>='a' && ch<='z' || ch>='A' && ch<='Z'  )
		  {
			alphaCount++;
		  }
		  else if (ch==' ')
		  {
			  space++;
		  }
		  else if(ch>='0' && ch<='9')
		  {
              digit++;
		  }
		  else 
		  {
			  special++;
		  }
		}
		System.out.println(alphaCount+" number of alphabet. ");
		System.out.println(space+" number of space. ");
		System.out.println(special+" number of Special character. ");
		System.out.println(digit+" number of digit. ");

		
	}
}
