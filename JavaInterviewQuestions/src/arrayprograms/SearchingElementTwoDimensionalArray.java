package arrayprograms;

public class SearchingElementTwoDimensionalArray {

	public static void main(String[] args) {
		int a[][]= {{100,20},{37,46},{10,25},{101,59}};
		
	int find_element=10;
		boolean status=false;
		
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<=1;c++) {
				//System.out.println(a[r][c]);
				if(a[r][c]==find_element) {
					System.out.println("element found");
					status=true;
					break;
				}
			}
			
		}
		
		if(status==false) {
			System.out.println("element not found");
		}
		
		
		
		
		
		
		
		

	}

}
