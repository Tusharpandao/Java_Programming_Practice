package program.pattern_program;

class Pattern1{
    public static void main(String[] args) {
        // String st=" *";
        // int count=2;

        for (int i = 1; i <=5; i++) {
            
            // for (int j = 1; j <= 5; j++) {
                
            //     if (i+j==count) {
            //         System.out.println(st);
            //     count=count+2;
            //     st= st + " "+ " *";
            //     }
                // Or 
                for(int j = 1;j<=i;j++)
                  {
                    System.out.print("*  ");
                  }
                  System.out.println();
                 
                
            }
        }
    }
