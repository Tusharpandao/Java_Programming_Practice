package program.array;

// WAJP to dilete duplicate element from the arr
public class DeleteDuplicat {
     public static int size(int arr[]){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }   
        }
        return count;
    } 
    
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,2,4,6};
        int ar[]=new int[arr.length+1];
        
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int count=0;
           // int num=0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    count++;
                }  
            } 
            if(count ==0){
                ar[index]= arr[i];
                index++;
            } 
        }

        for (int i = 0; i < size(ar); i++) {
            System.out.print( ar[i] +" ");
            
        }
       
    }
   
}
