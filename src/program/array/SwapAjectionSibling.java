package program.array;

public class SwapAjectionSibling {
    // WAJp to swap to adjesotion elements too given array
    public static void main(String[] args) {
        
        int arr[]={10,20,30,40,50};

        int temp=0;
        //int s=0;
        

        System.out.println("Before swaping adjection sibling");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println( "\nAfter swaping adjection sibling");
        // while (s<arr.length -1) {
        //     temp=arr[s];

        //     arr[s]=arr[s+1];
        //     arr[s+1]=temp;
        //     s =s+2;


        // }
        for (int i = 0; i < arr.length -1; i +=1) {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for (int i : arr) {
            System.out.print(i+ " ");
        }

    }
    
}
