package patternprograms;

public class CharPattern12 {

	public static void main(String[] args) {
		char alpha='A';
		//
		//		for(int i=1;i<=5;i++) {
		//
		//			for(int j=5;j>=i;j--)
		//			{
		//				System.out.print(" ");
		//			}
		//
		//			for(int k=1;k<(i*2);k++) {
		//				if(k>1&&k<(i*2)-1) {
		//					System.out.print(" ");
		//				}
		//				else
		//					System.out.print(alpha);
		//			}
		//			System.out.println();
		//		}

		//        A
		//      A   A
		//    A       A
		//  A           A
		//A               A



		for(int i=1;i<=5;i++) {

			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}

			for(int k=1;k<(i*2);k++) {
				if(k>1&&k<(i*2)-1) {
					System.out.print(" ");
				}
				else
					System.out.print(alpha);
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}


			for(int k=1;k<(i*2);k++) {
				if(k>1&&k<(i*2)-1) {
					System.out.print(" ");
				}
				else
					System.out.print(alpha);

			}
			System.out.println();

			//
			//	     A
			//	    A A
			//	   A   A
			//	  A     A
			//	 A       A
			//	 A       A
			//	  A     A
			//	   A   A
			//	    A A
			//	     A


			//		for(int i=5;i>=1;i--) {
			//			for(int j=5;j>=i;j--) {
			//				System.out.print(" ");
			//			}
			//
			//
			//			for(int k=1;k<(i*2);k++) {
			//				if(k>1&&k<(i*2)-1) {
			//					System.out.print(" ");
			//				}
			//				else
			//					System.out.print(alpha);
			//
			//			}
			//			System.out.println();

			//			A       A
			//			  A     A
			//			   A   A
			//			    A A
			//			     A

			//	}





			//			char alpha='A';
			//
			//			for(int i=1;i<=5;i++,alpha++) {
			//
			//				for(int j=5;j>=i;j--)
			//				{
			//					System.out.print(" ");
			//				}
			//
			//				for(int k=1;k<(i*2);k++) {
			//					if(k>1&&k<(i*2)-1) {
			//						System.out.print(" ");
			//					}
			//					else
			//						System.out.print(alpha);
			//				}
			//				System.out.println();
			//			}
			//
			//
			//			for(int i=5;i>=1;i--,alpha--) {
			//				for(int j=5;j>=i;j--) {
			//					System.out.print(" ");
			//				}
			//
			//
			//				for(int k=1;k<(i*2);k++) {
			//					if(k>1&&k<(i*2)-1) {
			//						System.out.print(" ");
			//					}
			//					else
			//						System.out.print(alpha);
			//
			//				}
			//				System.out.println();
			//
			//			
			//			}
			//			
			//			
			//			     A
			//			    B B
			//			   C   C
			//			  D     D
			//			 E       E
			//			 F       F
			//			  E     E
			//			   D   D
			//			    C C
			//			     B








			//		char alpha='A';
			//			for(int i=5;i>=1;i--) {
			//			for(int j=5;j>=i;j--) {
			//				System.out.print(" ");
			//			}
			//
			//
			//			for(int k=1;k<(i*2);k++) {
			//				if(k>1&&k<(i*2)-1) {
			//					System.out.print(" ");
			//				}
			//				else
			//					System.out.print(alpha);
			//
			//			}
			//			System.out.println();
			//			}
			//			
			//			for(int i=1;i<=5;i++) {
			//			
			//						for(int j=5;j>=i;j--)
			//						{
			//							System.out.print(" ");
			//						}
			//			
			//						for(int k=1;k<(i*2);k++) {
			//							if(k>1&&k<(i*2)-1) {
			//								System.out.print(" ");
			//							}
			//							else
			//								System.out.print(alpha);
			//						}
			//						System.out.println();
			//					}
			//
			//			

			//			 A       A
			//			  A     A
			//			   A   A
			//			    A A
			//			     A
			//			     A
			//			    A A
			//			   A   A
			//			  A     A
			//			 A       A






		}


	}

}
