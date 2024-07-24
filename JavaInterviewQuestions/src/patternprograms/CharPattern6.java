package patternprograms;

public class CharPattern6 {

	public static void main(String[] args) {
char alpha='A';
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				
		System.out.print(" ");
		}
			for(int k=7;k>i;k--) {
				System.out.print(alpha);
			}
		System.out.println();
		}
		

	}

}
//AAAAAA
// AAAAA
//  AAAA
//   AAA
//    AA
//     A