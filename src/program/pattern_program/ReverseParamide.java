package program.pattern_program;

public class ReverseParamide {
	public static void main(String[] args) {

    int numRows = 6;
        for (int i = 1; i <= numRows; i++) {
        	for (int k=1;k<i;k++) {
        		System.out.print(" ");
        	}
        	int startnum=i;
            for (int j = 1; j <= numRows - i + 1; j++) {
                System.out.print(startnum + " ");
                startnum++;
            }
            System.out.println();
        }
	}

}
//1 2 3 4 5 6 
// 2 3 4 5 6 
//  3 4 5 6 
//   4 5 6 
//    5 6 
//     6 

