package patternprograms;

public class CharPattern5 {

	public static void main(String[] args) {
		char alpha='A'; //odd a, even b
		for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++) {
			if(i%2==0) {
				System.out.print("B");
			}
			else {
				System.out.print("A");
			}
			}
			System.out.println();
		}

	}

}

//A
//BB
//AAA
//BBBB
//AAAAA