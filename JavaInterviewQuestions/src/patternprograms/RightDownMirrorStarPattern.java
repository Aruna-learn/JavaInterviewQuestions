package patternprograms;

public class RightDownMirrorStarPattern {

	public static void main(String[] args) {
		
//		******
//		 *****
//		  ****
//		   ***
//		    **  
//		     * 
		
		for(int i=1;i<=6;i++) {
			
			for(int j=2;j<=i;j++)// space start with 2 because uif we give give 1 it will space so remove we use 2
			{
				System.out.print(" ");
			}
				for(int k=6;k>=i;k--)
				{
					System.out.print('*');
				}
				System.out.println();
			}
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		

	}

}
