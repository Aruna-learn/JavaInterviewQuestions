package patternprograms;

public class NumberPattern8 {

	public static void main(String[] args) {
		for(int i=1;i<=6+1;i++)
		{
			
			for(int j=i;j<=6+1;j++) {
				System.out.print(j+" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
//		1 2 3 4 5 6 7 1 
//		2 3 4 5 6 7 1 2 
//		3 4 5 6 7 1 2 3 
//		4 5 6 7 1 2 3 4 
//		5 6 7 1 2 3 4 5 
//		6 7 1 2 3 4 5 6 
//		7 1 2 3 4 5 6 7
		
	}
}
