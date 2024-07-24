package arrayprograms;

public class PrintElementsInArrayOnEvenPosition {

	public static void main(String[] args) {
		// 1 2  3  4  5  6-position
		// 5 7  4  2  8  9 
		// 0 1  2  3  4  5  -- indices i

		int a[]= {5 ,7 , 4 , 2 , 8 , 9};

		for(int i=1; i<a.length;i=i+2) { //Here, i will start from 1 as first even positioned element is present at position 1.  
			System.out.println(a[i]);

		}

	}

}
