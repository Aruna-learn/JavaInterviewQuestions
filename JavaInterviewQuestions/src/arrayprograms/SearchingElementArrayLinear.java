package arrayprograms;

public class SearchingElementArrayLinear {

	public static void main(String[] args) {
		int a[]= {12,30,600,40,50,11};//declaring array and add elements to array
		
		int find_element=600;//element that need to be find in an aray
		
		boolean status=false;
		//logic read all elements and compare the matching element with every element if match found sysout otherwise we have to use the status to print math not found
		//if we have duplicate elements it will find the 1st matching element and then exit the loop
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==find_element) {
				System.out.println("Element found at position:"+i);
				status=true;//element found and make status as true
				break;
			}
			
			//System.out.println(a[i]);//print all elements in an array
		}
		
		if(status==false) {
			System.out.println("element not found");
		}
		
		
		
	}

}
