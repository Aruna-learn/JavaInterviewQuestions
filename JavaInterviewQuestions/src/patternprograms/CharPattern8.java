package patternprograms;

public class CharPattern8 {

	public static void main(String[] args) {
//		char alpha='A';
//
//		for(int i=0;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print(" ");
//
//			}
//			for(int k=1;k<(i*2);k++) {
//				System.out.print(alpha);
//			}
//			System.out.println();
//		}

		//		
		//		 A
		//	    AAA
		//	   AAAAA
		//	  AAAAAAA
		//	 AAAAAAAAA



//		char alpha='A';
//
//		for(int i=0;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print(" ");
//
//			}
//			for(int k=1;k<(i*2);k++) {
//				System.out.print(alpha+"");
//				alpha++;
//			}
//			System.out.println();
//		}


//		     A
//		    BCD
//		   EFGHI
//		  JKLMNOP
//		 QRSTUVWXY



		char alpha='A';

		for(int i=0;i<=5;i++,alpha++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");

			}
			for(int k=1;k<(i*2);k++) {
				System.out.print(alpha+"");
				
			}
			System.out.println();
		}

//		 B
//	    CCC
//	   DDDDD
//	  EEEEEEE
//	 FFFFFFFFF















	}

}
