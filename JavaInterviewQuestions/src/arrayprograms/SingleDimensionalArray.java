package arrayprograms;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		int a[]= new int[5];//declaring array or we can write like this it is like static array we can't add more values than 5
		//int []a= new int[5];//declaring array
		
		
		//adding values to array  // index start form zero
		a[0]=10;
		a[1]=15;
		a[2]=1000;
		a[3]=167;
		a[4]=23;
		
		System.out.println(a[4]);//get single value based on index
		
		
		System.out.println(a.length);//length/size of the array
		
		
		//read all the values in an array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//read all the value using foreach loop
		for (int i : a) {
			System.out.println(i);
		}
		
		//anotheR way To declare an array , dynamic array
		int arr[]= {1,2,87,45,90,355};
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
