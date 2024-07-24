package patternprograms;

public class CharPattern13 {

	public static void main(String[] args) {
		char alpha='A';

//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(alpha);
//			}
//			System.out.println();
//		}
//		for(int i=2;i<=6;i++) {
//			for(int j=6;j>=i;j--) {
//				System.out.print(alpha);
//			}
//			System.out.println();
//		}

//		A
//		AA
//		AAA
//		AAAA
//		AAAAA
//		AAAAAA
//		AAAAA
//		AAAA
//		AAA
//		AA
//		A
//
		
		
		for(int i=1;i<=6;i++,alpha++) {
			for(int j=1;j<=i;j++) {
				System.out.print(alpha);
			}
			System.out.println();
		}
		for(int i=2;i<=6;i++,alpha--) {
			for(int j=6;j>=i;j--) {
				System.out.print(alpha);
			}
			System.out.println();
		}
		
		
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
//		GGGGG
//		FFFF
//		EEE
//		DD
//		C

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
