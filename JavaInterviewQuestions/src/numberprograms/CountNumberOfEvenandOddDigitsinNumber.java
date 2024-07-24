package numberprograms;

public class CountNumberOfEvenandOddDigitsinNumber {

	public static void main(String[] args) {
		
		int number=54362;
		int even_digit=0;
		int odd_digit=0;
		
		while(number>0) {    //54362   5436  543 54 5 0 after 0 loop exists becoz 0>0
			int digit=number/10;//take last digit //2 6 3 4 5
			if(digit%2==0)
			{
				even_digit++;//1 2 3
			}
			else 
			{
				odd_digit++;//1 2
			}
			number=number/10;//eliminate last digit //5436 543 54 5 0
		}
		
		
		System.out.println("number of even digits:"+even_digit);
		System.out.println("number of even digits:"+odd_digit);
		
//		//iteration1
//		while(54362>0) {
//			int digit=54362/10;//take last digit 2
//			if(2%2==0) {
//				even_digit++;//if 2%2 and remainder is zero then even count will increase otherwise odd count will increase
//			}
//			else 
//			{
//				odd_digit++;
//			}
//			5436=54362/10;//eliminate last digit 2 and went to while loop
//		}
//		
//		//iteration2
//		while(5436>0) {
//			int digit=5436/10;//take last digit 6
//			if(6%2==0) {
//				even_digit++;//if 6%2 and remainder is zero then even count will increase otherwise odd count will increase
//			}
//			else 
//			{
//				odd_digit++;
//			}
//			543=5436/10;//eliminate last digit 6
//		}
//		
//		//iteration3
//		while(543>0) {
//			int digit=543/10;//take last digit 3
//			if(3%2==0) {
//				even_digit++;//if 3%2 and remainder is zero then even count will increase otherwise odd count will increase
//			}
//			else 
//			{
//				odd_digit++;////if 3%2 and remainder is  not zero then odd count will increase 
//			}
//			54=543/10;//eliminate last digit 3
//		}
//
//		//iteration4
//		while(54>0) {
//			int digit=54/10;//take last digit 4
//			if(4%2==0) {
//				even_digit++;//if 4%2 and remainder is zero then even count will increase otherwise odd count will increase
//			}
//			else 
//			{
//				odd_digit++;
//			}
//			5=54/10;//eliminate last digit 4
//		}
//		
//		//iteration5
//		while(5>0) {
//			int digit=5/10;//take last digit 5
//			if(5%2==0) {
//				even_digit++;
//			}
//			else 
//			{
//				odd_digit++;////if 5%2 and remainder is  not zero then odd count will increase 
//			}
//			0=5/10;//eliminate last digit 5
//		}
//		
//		//iteration6
//		while(0>0) {
//			exit loop;
//		}
	}

}
