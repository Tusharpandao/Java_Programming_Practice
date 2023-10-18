package program.array;

// WAJP to short an array  in assending order using short method 
public class sortArray2 {
    public static void main(String[] args) 
	{
	int arr[]={59,69,74,2,6,1};
    System.out.println("Array before shorting");
    for (int i : arr) {
        System.out.print(i + " ");
    }

	for (int i =0;i<arr.length ;i++ )
	{
		for (int j=0;j<arr.length -1 ;j++ )
		{
			if (arr[j] > arr[j +1])
			{
				int tem = arr[j];
				arr[j]=arr[j +1];
				arr[j+1]=tem;
			}
		}
		
	}
    System.out.println("\nArray after sorting ");
	for (int i : arr) {
        System.out.print(i +" ");
        
    }
	}
    
}
