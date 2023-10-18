package program.pattern_program;

public class CharParamide2 {
	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++) {
			//black space
			for (int j = 1; j <=5 - i; j++) {
            System.out.print(" ");
			}
			char Char='A';
			for(int k=1;k<=i;k++) {
			System.out.print(" "+ Char);
			Char++;
			}
			
			System.out.println();
		}
		
	}

}
//      A
//     A B
//    A B C
//   A B C D
//  A B C D E

