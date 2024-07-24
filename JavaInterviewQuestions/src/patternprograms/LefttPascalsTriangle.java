package patternprograms;

public class LefttPascalsTriangle {

	public static void main(String[] args) {
		

		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
            for(int i=5;i>=1;i--)
            {
			
			for(int j=i;j<=6;j++)// space start with 2 because uif we give give 1 it will space so remove we use 2
			{
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++)
				{
					System.out.print('*');
				}
				System.out.println();
			}
		
		
		
		
//             *
//            **
//           ***
//          ****
//         *****
//        ******
//         *****
//          ****
//           ***
//            **
//             *

		
		
		
		
		
		

	}

}
