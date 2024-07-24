package arrayprograms;

public class DuplicationinTwoDimensionalArray {

	public static void main(String[] args) {
		int a[][]= {{10,20},{37,46},{10,25},{10,59}};
		int find_element=10;
		int count=0;

		//		for(int r=0;r<a.length;r++) {
		//			for(int c=0;c<=1;c++) {
		//				if(a[r][c]==find_element) {
		//					count++;
		//				}
		//			}
		//		}
		//		
		//		System.out.println(count);
		//		

		for(int arr[]:a) {
			for(int fn:arr) {
				if(fn==find_element) {
					count++;
				}
			}
		}

		System.out.println(count);





	}

}
