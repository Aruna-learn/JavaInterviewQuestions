package arrayprograms;

import java.util.HashSet;

public class DuplicateElementArray {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,7,2,9,3,6,9};
		
//		System.out.println("Duplicate found");
		boolean status=false; //status for do not repeat the if block extra info means everytime executes the text will be there to remove we set the status
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.println(a[i]);
//					status=true;
//					
//				}
//			}
//		}
//		
//		if(status==false) {
//			System.out.println("Duplicate not found");
//		}
//		
		
		
		
		HashSet<Integer> duplic=new HashSet();
		
		for(int v:a) {
			if(duplic.add(v)==false) {
				System.out.println("duplicate found"+v);
				status=true;
			}
		}
		if(status=false) {
			System.out.println("no duplicates");
		}
		
		
		
		
		
		
		
		
		

	}

}
