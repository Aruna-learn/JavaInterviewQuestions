package patternprograms;

public class Pattern11 {

	public static void main(String[] args) {
		int n=5;
		for (int i = 0; i <=n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j+1);
			}
			System.out.println(" ");
		}
		
	}

}

//STEP 1: START
//STEP 2: SET n=5.
//STEP 3: SET i=0. REPEAT STEP 4 to STEP 8 UNTIL i<=n.
//STEP 4: SET j=0.REPEAT STEP 5 to STEP 6 UNTIL j
//STEP 5: PRINT j+1
//STEP 6: SET j=j+1
//STEP 7: PRINT new line.
//STEP 8: SET i=i+1.
//STEP 9: END