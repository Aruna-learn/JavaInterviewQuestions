 package patternprograms;

public class CharPattern11 {

	public static void main(String[] args) {
		char alpha='A';

		for(int i=1;i<=5;i++,alpha++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");

			}
			for(int k=1;k<=(i*2-1);k++) {
				System.out.print(alpha+"");
				
			}
			System.out.println();
		}
		char alpha1='D';
		for(int i=4;i>=1;i--,alpha1--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");

			}
			for(int k=1;k<=(i*2-1);k++) {
				System.out.print(alpha1+"");
				
			}
			System.out.println();
		}

		
//		    A
//		   BBB
//		  CCCCC
//		 DDDDDDD
//		EEEEEEEEE
//		 DDDDDDD
//		  CCCCC
//		   BBB
//		    A

	}

}
