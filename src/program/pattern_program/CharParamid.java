package program.pattern_program;

public class CharParamid {
	public static void main(String[] args) {
		
		char Char='A';
		for(int i=1;i<=5;i++) {
			//black space
			for (int j = 1; j <=5 - i; j++) {
            System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
			System.out.print(" "+ Char);
			Char++;
			}
			
			System.out.println();
		}
		
	}
	

}
//     A
//    B C
//   D E F
//  G H I J
// K L M N O


