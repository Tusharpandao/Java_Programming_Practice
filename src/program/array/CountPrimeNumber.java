package program.array;

// WAJP to count number of prime number in a given array
public class CountPrimeNumber {

    public static void main(String[] args) {
        

        int [] arr= {10,20,304,7,5,8};

        int CountPrime=0;
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = 1; j <= arr[i]; j++) {
              if (  arr[i] %j==0) {
                count++;
              }
            }
            if (count == 2) {
                CountPrime++;
            }
        }
        System.out.println( CountPrime +" prime number in an array");

    }
    
    
}
