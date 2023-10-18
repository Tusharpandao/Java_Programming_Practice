package program.number_program;

/* wap to check the given Number is Armstsrong Number or not 
what is Armstsrong number? 
=> given number each digit pawer addition 
   and given number is same
   example
   	Number =153
			
			1*1*1+5*5*5+3*3*3
			1+125+27
			153
			
   */

   

import java.util.Scanner;
class ArmstsrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		//153
			int num =scanner.nextInt();
			
			int add=0;
			int count=0;
			for (int i=num;i !=0 ;i /=10 )
			{
				count++;
			}
			for (int i=num;i!=0 ;i /=10 )
			{
				int temp=i%10;
				int product=1;
				
				for (int a=1;a<=count ;a++ )
				{
					product *=temp;
					
				}
				add += product;

			}
			if (num == add)
			{
				System.out.println(num + " is Armstsrong Number ");
			}
			else
			{
				System.out.println(	num + " is  not Armstsrong Number ");
			}

		
	
	

	 scanner.close();	
		
	}
}
