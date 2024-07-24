package arrayprograms;

public class ReverseArray {

	public static void main(String[] args) {
		
		int a[]= {23,76,85,12,86,45};
		
		
		
		//read and print all elements in an array
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		//to reverse abn array we have to take index form last step we use the a.lenght-1 and i>=0 is we have check and print the all the elements that is greater than zero as index and decrement because we have to read the elements from the last index to first index
		System.out.println("After Reversing an array:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		

	}

}
