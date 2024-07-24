package patternprograms;

public class NumberPattern14 {

	public static void main(String[] args) {
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				if(i>=2&&j<=(i-1)) {
//					System.out.print(" ");
//				}
//				else
//				System.out.print(j);
//			}
//			System.out.println();
//		}
	
//
//		1
//		 2
//		  3
//		   4
//	

      
//		for(int i=1;i<=4;i++) {
//			for(int j=4;j>=i;j--) {
//				
//				System.out.print(" ");
//				
//			}
//			for(int k=1;k<=i;k++) {
//				if(i>=2&&k>1) {
//					System.out.print(" ");
//				}
//					
//				else {
//					System.out.print(i);
//				}
//			}
//			System.out.println();
//		}
      
//		    1
//		   2 
//		  3  
//		 4   
      
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=1;j--) {
				if(!(i==j)) {
					System.out.print(" ");
				}
				else
				System.out.print(j);
			}
			System.out.println();
		}
		
//		   1
//		  2 
//		 3  
//		4   

		
		
		
		
		
		
		
}   
      
      
}
