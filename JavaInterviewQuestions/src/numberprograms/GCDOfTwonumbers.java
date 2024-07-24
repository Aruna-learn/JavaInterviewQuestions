package numberprograms;

public class GCDOfTwonumbers {

	public static void main(String[] args) {
		//GCD greatest common divisor/factor
		//logic take 2 numbers  12, 8
		//write all the factors of two numbers
		//12->1,2,3,4,6,16
		//8->1,2,4,8
		//take common factors in above=1,2,4
		//take greatest factor 4
		
		int x=12;
		int y=75;
		int gcd=1;
		
		for(int i=1;i<=x&&i<=y;i++) {
			if(x%i==0&&y%i==0) 
				gcd=i;
			}
		System.out.println("common factor is:"+gcd);
		}
		
		
		
		
		
		
		

	}


