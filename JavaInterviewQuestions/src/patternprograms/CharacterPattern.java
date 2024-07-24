package patternprograms;

public class CharacterPattern {

	public static void main(String[] args) {
		
//		char i,j;
//		for(i='A';i<='D';i++) {
//			for(j='A';j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
//		int charac=65;
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print((char)(charac+j)+" ");////adds the value of j in the ASCII value of A and prints the corresponding alphabet  
//			}
//			System.out.println();
//		}
		
		
		
//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
//		A B C D E F 
		
		
//		int charac=65;
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print((char)(charac+i)+" ");////adds the value of j in the ASCII value of A and prints the corresponding alphabet  
//			
//			}
//			System.out.println();
//		}
		
//		A 
//		B B 
//		C C C 
//		D D D D 
//		E E E E E 
//		F F F F F F 
//		
		int charac=65;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(charac)+" ");////adds the value of j in the ASCII value of A and prints the corresponding alphabet  
			
			}
			System.out.println();
		}
		
//		A 
//		A A 
//		A A A 
//		A A A A 
//		A A A A A 
//		A A A A A A
		

	}

}
