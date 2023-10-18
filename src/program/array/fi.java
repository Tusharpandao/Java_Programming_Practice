package program.array;

// WAJP  to check the array element which are diviable 3,4,5
public class fi {

    public static void main(String[] args) {
        
        int [] arr={1,3,44,24,55,23,54,67,23};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3 ==0) {
                
                System.out.println( arr[i] + " is divisiable by 3");
            }
             if (arr[i]%4 ==0) {
                
                System.out.println( arr[i] + " is divisiable by 4");
            }
             if (arr[i]%5 ==0) {
                
                System.out.println( arr[i] + " is divisiable by 5");
            }
            
        }

    }
    
}
