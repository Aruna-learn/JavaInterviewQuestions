package numberprograms;

public class GivenNumberPrimeorNot {

	public static void main(String[] args) {
		
	//natural number >1
	// which has only 2 factors 1 and itself	
	//19-> 1and 19 is prime
	//28->1,2, 4,7,14,28 not prime	
		
		int num=7;
		int count=0;
		
		if(num>1) {  //natural number >1
			
			for(int i=1;i<=num;i++) { //check 7 from 1 to 7 whether it is divisible by 1,2,3,4,5,6,7 or not 
				if (num%i==0)//and if divisible by i and reminder 0 then increment count
					count++;
			}
			if(count==2)//which has only 2 factors 1 and itself	is 1 and 7 and is divisibl and  by 1 and 7 and reminder is zero
			{
				System.out.println("primenumber:"+num);
			}
			
			else
				System.out.println("not prime number");
			
			
		}
		
		else
			System.out.println("not prime");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
