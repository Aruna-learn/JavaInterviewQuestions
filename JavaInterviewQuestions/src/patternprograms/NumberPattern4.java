package patternprograms;

public class NumberPattern4 {

	public static void main(String[] args) {
		
		int rows=5;
		for(int i=1;i<=rows;i++) {
			int n=i;
			for(int j=1;j<=i;j++) {
				
				System.out.print(n+" ");
				n=n+rows-j;
			}
			System.out.println();
		}
		
		
		
//		1 
//		2 6 
//		3 7 10 
//		4 8 11 13 
//		5 9 12 14 15 

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
