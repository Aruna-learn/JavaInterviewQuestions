package patternprograms;

public class CharPattern9 {

	public static void main(String[] args) {
		char alpha='A';

		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");

			}
			for(int k=1;k<=(i*2-1);k++) {
				System.out.print(alpha+"");
				
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");

			}
			for(int k=1;k<=(i*2-1);k++) {
				System.out.print(alpha+"");
				
			}
			System.out.println();
		}
		
	}
//	    A
//	   AAA
//	  AAAAA
//	 AAAAAAA
//	AAAAAAAAA
//	 AAAAAAA
//	  AAAAA
//	   AAA
//	    A

}
