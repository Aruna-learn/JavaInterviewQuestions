package numberprograms;

public class PrimeNumbersBetweenOnetoN {

	public static void main(String[] args) {
		
		int num=27;
		
		for(int i=2; i<=num;i++) {
			boolean flag=true;
			for(int j=2; j<=i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(i+" is prime");
			}
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
