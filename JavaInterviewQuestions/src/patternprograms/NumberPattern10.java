package patternprograms;

public class NumberPattern10 {

	public static void main(String[] args) {
		for(int i=8;i>=1;i--) {
			for(int j=8;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
//if we use i
//8
//77
//666
//5555
//44444
//333333
//2222222
//11111111


//if we use j
//8
//87
//876
//8765
//87654
//876543
//8765432
//87654321
