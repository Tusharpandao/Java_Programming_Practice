package program.pattern_program;

public class CharReverseParamide {

		public static void main(String[] args) {
	
		        int numRows = 9;

		        for (int i = 1; i <= 5; i++) {
		        	for (int k=1;k<i;k++) {
		        		System.out.print("-");
		        	}
		        	char startChar = 'A';
		            for (int j = 1; j <=numRows; j++) {
		                System.out.print(startChar );
		                startChar++;
		            }
		            startChar = 'A';
		            numRows -=2;
		            System.out.println();
		        }
		       
		       
		    }
		
	
		}

//ABCDEFGHI
// ABCDEFG
//  ABCDE
//   ABC
//    A


