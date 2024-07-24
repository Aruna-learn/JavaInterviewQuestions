package arrayprograms;

public class MisingNumberInArray {

	public static void main(String[] args) {
		//prerequisites to find the missing nunber in array
		//Arrays should not have duplicates values
		//no need of order
		//should be proper range

		//logic sum1=1+2+3+5=11
		//sum2=1+2+3+4+5=15
		//sum2-sum1=missing number 4
		int a[]= {1,2,3,4,6};
		int sum1=0;

		//to get sum of elements in array
		for (int i=0;i<a.length;i++)

		{
			sum1=sum1+a[i];
		}
		System.out.println(sum1);

		
		//get sum of range of the elements

		int sum2=0;
		for (int i=1;i<=5;i++)

		{
			sum2=sum2+i;
		}
		System.out.println(sum2);

		System.out.println("Missing number:"+(sum2-sum1));















	}

}
