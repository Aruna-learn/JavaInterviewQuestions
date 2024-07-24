package arrayprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int a[]= {10,50,45,87,23,765,243};
		int total=a.length;
		int temp=0;
	
		
		//to find the largest element in array we can do in 3ways
		//1.using arratys.sort and get the last index 1
		//2.using collections and get the  index values or length
		//3. get the elements in ascending order ad get the second largest  element using index or length and  get the elements in descending order ad get the 1st element using index or length
		
		//1.using arratys.sort and get the last index
//				Arrays.sort(a);
//		System.out.println(a[5]);
//		System.out.println(a[total-2]);//used length
		
		

		//2.using collections and get the last index values or length-1
//		Integer b[]= {10,45,87,23,765,243};
//		int total1=b.length;
//		List<Integer>li=Arrays.asList(b);
//		Collections.sort(li);
//		int lar=li.get(4);
//		System.out.println(lar);
//		System.out.println(b[total1-2]);//used length
		
		
		//3. get the elements in ascending order ad get the first element using index or length
		for(int i=0;i<=a.length-1;i++) {//select the element
			for(int j=i+1;j<=a.length-1;j++) {//compare the selected element with rest of the elements
				if(a[i]>a[j]) {//using ascending order and used index 0 to get the largest number
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
		
		
		}
		System.out.println(a[5]);//second largest number using index
		//System.out.println("second largest number is is:"+a[total-2]);
		
		
		

	}

}
