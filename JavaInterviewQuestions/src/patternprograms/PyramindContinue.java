package patternprograms;

public class PyramindContinue {

	public static void main(String[] args) {
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=5;j>=i;j--) 
//			{
//				System.out.print(" ");
//				
//			}
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print('*');
//			}
//			
//		
//		for(int l=2;l<=i;l++)
//		{
//			System.out.print('*');
//		}
//		
//		System.out.println();
//		}
		
		
		//another approach
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--) 
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<(i*2);k++)
			{
				System.out.print('*');
			}
		
		System.out.println();
		}
		
		
		
//		 *
//	    ***
//	   *****
//	  *******
//	 *********
	}

}
