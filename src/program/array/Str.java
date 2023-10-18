package program.array;

public class Str {
    
    public static void main(String[] args) {
        
        String str="hello this is tushar";

        char arr[]= new char[str.length()];
        
        String ms="";
        
        for(int  i =0 ;i<str.length();i++){
            int count =0;
            char ch=' ';
            for (int j = 0; j < str.length(); j++) {
                
                if(str.charAt(j)==str.charAt(i)){
                    count++;
                    ch=str.charAt(j);
                    arr[i]=str.charAt(j);
                }
            }

             if (count == 1) {
           // ms=ms.concat(String.valueOf(ch));
               ms +=String.valueOf(ch);  
            } 

        }
        System.out.println(ms);
        
       /*  String st="";
        for (int i = 0; i < arr.length; i++) {
            int  count =0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] ==arr[j]) {
                    count++;
                }
            }
           

        }
        for (char c : arr) {
            System.out.println(c);
        }
        System.out.println(st);
            */

    }
}
