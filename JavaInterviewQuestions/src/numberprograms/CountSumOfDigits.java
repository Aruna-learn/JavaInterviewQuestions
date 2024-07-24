package numberprograms;

public class CountSumOfDigits {

	public static void main(String[] args) {
		int num=1234; 
		int sum=0;
		while(num>0) {  //1234 123 12 1 0
			sum=sum+num%10;//4 +3 +2+1
			num=num/10;//123 12 1 0
		}
		System.out.println(sum);
	}

}

//while(1234>0) {  //1234 
//	4=0+1234%10;//1234%10 is  take last digit 4 and add to sum and now sum is 4
//	num=num/10;//1234/10 eliminate 4 and now num is 123 and go to while loop
//}
//while(123>0) {  //123 
//	7=4+1234%10;//123%10 is  take last digit 3 and add to sum and now sum is 
//	num=num/10;//123/10 eliminate 3 and now num is 12 and go to while loop
//}
//while(12>0) {  //12 
//	9=7+12%10;//12%10 is  take last digit 2 and add to sum and now sum is 
//	num=num/10;//12/10 eliminate 2 and now num is 1 and go to while loop
//}
//while(1>0) {  //1
//	10=9+1%10;//1%10 is  take last digit 1 and add to sum and now sum is 
//	num=num/10;//1/10 eliminate 1 and now num is 0 and go to while loop
//}
//while(0>0) {  
//	loop exists
//}

	