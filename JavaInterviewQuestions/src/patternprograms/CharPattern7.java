package patternprograms;

public class CharPattern7 {

	public static void main(String[] args) {
char alpha='A';
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				
		System.out.print(" ");
		}
			for(int k=7;k>i;k--) {
				if(i%2==0) {
					System.out.print("0");
				}
				else
					
				System.out.print("Z");
			}
		System.out.println();
		}
		

	}

}

//ZZZZZZ
// 00000
//  ZZZZ
//   000
//    ZZ
//     0
