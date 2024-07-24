package patternprograms;

public class NumberPattern13 {

	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(i*j+" ");
//			}
//			System.out.println();
//	}
	


//1 
//2 4 
//3 6 9 
//4 8 12 16 
//5 10 15 20 25 



for(int i=1;i<=10;i++) {
	for(int j=10;j>=1;j--)
	{
		if(j!=i)
		System.out.print(j+" ");
		else
			System.out.print('*');
	}
	System.out.println();
}

//10 9 8 7 6 5 4 3 2 *
//10 9 8 7 6 5 4 3 *1 
//10 9 8 7 6 5 4 *2 1 
//10 9 8 7 6 5 *3 2 1 
//10 9 8 7 6 *4 3 2 1 
//10 9 8 7 *5 4 3 2 1 
//10 9 8 *6 5 4 3 2 1 
//10 9 *7 6 5 4 3 2 1 
//10 *8 7 6 5 4 3 2 1 
//*9 8 7 6 5 4 3 2 1 















	}


}