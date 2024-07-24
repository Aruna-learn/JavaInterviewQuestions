package numberprograms;

public class CountNumberofDigitsinNumber {

	public static void main(String[] args) {
		
		int number=1763570;
		int digits_count=0;
		
		
		while(number>0)
		{
			number=number/10;// to eliminate last digits we use / and once eliminate last digit and increment the count by 1 from last(backward) to first until 0>0
			digits_count++;//eliminated number  count increment and  stored here
		}
		System.out.println("Number of digits are:"+digits_count);
		
		
		
		
		

	}

}
