package arrayprograms;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int sum=0;
		
//		for(int i=0;i<=a.length-1;i++) {
//			System.out.println(a[i]);
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
		
		
		//using for each loop
		for(int value:a) {
			sum=sum+value;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
