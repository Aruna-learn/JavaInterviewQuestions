package patternprograms;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
		

		//input is
//		*
//		**
//		***
//		****
		
		
		
		
//		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print('*');
//			}
//			System.out.println();
//		}
		
		//output is
//		*
//		**
//		***
//		****
		
		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=4;j>=i;j--)
//				
//			{
//				System.out.print('*');
//			}
//				
//				System.out.println();
//		}
		
		
		
		for(int i=0;i<=8;i++)
		{
			for(int j=8;j>=i;j--)
				
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print('*');
			}
				
				System.out.println();
		}
		
//
//		    *
//	       **
//	      ***
//	     ****
//	    *****
//	   ******
//	  *******
//	 ********
	}

}
