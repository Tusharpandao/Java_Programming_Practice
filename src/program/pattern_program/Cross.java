package program.pattern_program;

public class Cross {
    public static void main(String[] args) {
        int number=2;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5; j++) {
                 if (j+i==6  || i+j == number) {
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            number +=2;
            System.out.println();
        }

    }
}
