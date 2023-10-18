package program.array;

class StringDupli 
{
	public static void main(String[] args) 
	{
		String str="Hello Good morning ";
		String arr[]=str.split(" ");
		String copy="";
		String str2="";
		String word="";
      
		for (int i=0; i< arr.length ;i++ )
		{
			  word=arr[i];
              copy="";
			for (int j=0;j< word.length() ;j++ )
			{
				for (int k=j+1; k< word.length()  ;k++ )
				{
					if (word.charAt(j)==word.charAt(k))
					{
						copy=copy+word.charAt(k);
					}

				}
				
			}	

	        for (int a=0;a< copy.length() ;a++ )
			{
				    str2=word.replaceFirst(copy,"");
				    System.out.print(str2+" ");
			}
		}

		

	}
}
