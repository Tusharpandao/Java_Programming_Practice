package program.pattern_program;

public class StarParamid {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			//black space
			for (int j = 1; j <=6 - i; j++) {
            System.out.print("-");
			}
			
			for(int k=1;k<=i;k++) {
			System.out.print(" *");
			
			}
			
			System.out.println();
		}
		
	}

}
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
// * * * * * *
