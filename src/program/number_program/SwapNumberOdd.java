package program.number_program;

public class SwapNumberOdd {


    public static void main(String[] args) {

       int num=1234567;
         System.out.println(num);
       int count=0;
       int swapnum=0;
       for (int i = num; i !=0; i /=10) {
        int lastdigit=i%10;
        count++;
        swapnum = swapnum*10+lastdigit;
       }

       int arr []= new int[count] ;
       for (int i = 0; i < arr.length; i++) {
          arr[i]=swapnum%10;
          swapnum=swapnum/10;
       }
       for (int i = 0; i < arr.length; i+=2) {
         try {
             int temp=arr[i];
          int temp1=arr[i+1];
               arr[i]=temp1;
               arr[i+1]=temp;
          
            
         } catch (Exception e) {
         }
        
       }
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
       }
      //  System.out.println(swapnum);
      //  System.out.println(count);
        
    }
    
}
