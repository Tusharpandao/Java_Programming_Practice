package program.string_program;

//wajp to print only non repating character in a given string  
class  PrintChar
{
	public static void main(String[] args) 
	{
		String str="Hello worledH ";
      
        int count=0;
		for (int i=0; i< str.length() ;i++ )
		{
			count=0;
			for (int j=0; j<str.length() ;j++ )
			{
               if (str.charAt(j)== str.charAt(i))
               {
				   count++;
               }
			}
			if(count==1)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}
			
		

	}
}
