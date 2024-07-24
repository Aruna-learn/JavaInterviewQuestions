package patternprograms;

public class CharPattern14 {

	public static void main(String[] args) {
		char alpha='A';

		for(int i=7;i>=0;i--,alpha='A') {
			for(int j=0;j<=i;j++) {

				System.out.print(alpha++);
			}

			System.out.println();
		}

		for(int i=1;i<=7;i++,alpha='A') {
			for(int j=1;j<=i;j++) {

				System.out.print(alpha++);
			}

			System.out.println();
		}
	}

}

//ABCDEFGH
//ABCDEFG
//ABCDEF
//ABCDE
//ABCD
//ABC
//AB
//A
//A
//AB
//ABC
//ABCD
//ABCDE
//ABCDEF
//ABCDEFG
