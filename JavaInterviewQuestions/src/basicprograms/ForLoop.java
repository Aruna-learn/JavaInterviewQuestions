package basicprograms;

public class ForLoop {

	public static void main(String[] args) {
		
		/*
		 * for(int i=0;i<=10;i++) { System.out.println(i); }
		 */
		
		
		//print even from 1 to 10
		/*
		 * for(int i=2;i<=10;i+=2) { System.out.println(i); }
		 */
		
		
		
		
		//print even and odd'
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				System.out.println(i +"even");
			else
				System.out.println(i+"odd");
			
		}
		
		
		//decrement from 10 to1
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
	}

}
