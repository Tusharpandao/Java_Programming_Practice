package program.number_program;

// wap to display number from 1to 10 using while loop & for loop
// using do while loop

class Looping
{
	 
	public static void whileloop(){
		int a=1;
		System.out.println("using whileloop ");
		while (a<=10)
		{
			
			System.out.print(a + " ");
			a++;
			

		}
		System.out.println("\n=========================");
	}
	public static void dowhileloop()
	{
		int a=1;
		System.out.println("using dowhileloop ");
		do
		{
			System.out.print(a +" ");
				a++;
		}
		while (a<=10);
		System.out.println("\n=========================");
	}
	public static void forloop()
	{
		System.out.println("using forloop ");
		for (int i=1;i<=10 ;i++ )
		{
			System.out.print(i +" ");
		}
		System.out.println("\n=========================");
	}
	public static void main(String[] args) 
	{
		whileloop();
		dowhileloop();
		forloop();
	}
}
