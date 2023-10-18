package program.array;



public class Find_Arrary_armstrongNum{
    public static void main(String[] args) 
	{
        int arr []={12,34,124,123,145,153};
        for (int j = 0; j < arr.length; j++) {
            int num=arr[j];

        
			
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

		
	
        }

		
		
	}
}