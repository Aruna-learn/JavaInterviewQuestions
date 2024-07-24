package patternprograms;

public class CharPattern4 {

	public static void main(String[] args) {

//		char alpha='A';
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				
//		 System.out.print((alpha)+" ");
//		 alpha++;
//		}
//		System.out.println();
//		}
		//A B C D E 
		//F G H I 
		//J K L 
		//M N 
		//O
		
		
//		char alpha='A';
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				if(i>=2&&j<=(i-1)) {
//					System.out.print(" ");
//				}
//				else
//				System.out.print(alpha);
//			}
//		System.out.println();
//		}
		
//		
//		A
//		 A
//		  A
//		   A
//		    A
		
		
		char alpha='A';
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(i>=2&&k>1) {
					System.out.print(" ");
				}
					
				else {
					System.out.print(alpha);
				}
				}
					
		System.out.println();
		}
		
		
//		     A
//		    A 
//		   A  
//		  A   
//		 A    
		
		
		
		
		
		
	}

}
 