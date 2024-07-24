package patternprograms;

import java.util.Iterator;

public class Pattern10 {

	public static void main(String[] args) {
		int i,j;
		int n=6;
		for(i=n; i<0;i--) {
			for(j=0;j<i;j++) {
				System.out.println("*");
			}
			System.out.println("");
		}

	}
}

