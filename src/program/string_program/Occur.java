package program.string_program;

 //removint duplicate 
import java.util.HashSet;
import java.util.Set;
 
class Occur 
{
	public static void main(String[] args) 
	{
		String str="Hello World";
		Set<Character> set= new HashSet<>();
        int count=0;
		for (int i=0;i< str.length() ;i++ )
		{
			set.add(str.charAt(i));
		}
		for ( char ch : set )
		{
			count =0;

			for (int j=0; j<str.length() ;j++ )
			{
				if (str.charAt(j)==ch)
				{
					count++;
				}
			}
			System.out.println(ch+" = "+ count);
		}
	}
}
