package program.array;

//Wajp to create an array store same elemnet inside it and print all the elements presnet inside that array.

class  ArrayPrint
{
	public static void main(String[] args) 
	{
		 int [] arr= new int[5];
		   arr[0]=10;
		   arr[1]=20;
		   arr[2]=30;
		   arr[3]=40;
		   arr[4]=50;

		   for (int i=0;i< arr.length ;i++ )
		   {
			   System.out.println(arr[i]);
		   }
	}
}
