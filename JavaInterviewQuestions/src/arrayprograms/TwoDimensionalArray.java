package arrayprograms;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a[][]=new int[3][2];//declaring  static array
		
		//index starts from zero and 0 row having 2columns and assigning the values
		a[0][0]=100;
		a[0][1]=200;
		
		
		// 1 row having 2columns and assigning the values
		a[1][0]=300;
		a[1][1]=400;
		
		// 2 row having 2columns and assigning the values
		a[2][0]=500;
		a[2][1]=600;
		
		//print the length of the array
		System.out.println(a.length);
		
		//print columns data with specific row
		System.out.println(a[0].length);//0 row having 2 columns
		System.out.println(a[1].length);//1 row having 2 columns
		System.out.println(a[2].length);//2row having 2 columns
		
		
		//print all values in array rows and columns
		
		for(int r=0;r<a.length;r++) //row iteration [r<a.length or r<=a.length-1]
		{	
			for(int c=0;c<=1;c++) { //column iteration
				System.out.print(a[r][c]+ " ");
			}
			System.out.println();
		

	}
		
		//using for each loop
		for(int arr[]:a) {
			for(int x:arr) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		
	//another way to declaring arrAY
		int arr[][]= {{100,200},{300,400},{500,600}};		
		

}
}
