package patternprograms;

public class NumberPattern7 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=5;i++) {
			if(i%2!=0) {
				for(int j=0;j<=3;j++) {
					count=count+1;
					System.out.print(count+" ");
				}
			}
				else {
					int temp=count+1;
					for(int j=count+3;j>=temp;j--) {
						count=count+1;
						System.out.print(j+" ");
					}
				}
			System.out.println();
			}
			
		
		
		
//		1 2 3 4 
//		7 6 5 
//		8 9 10 11 
//		14 13 12 
//		15 16 17 18 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
