package arrayprograms;

import java.util.HashSet;

public class DuplicateElementinArray {

	public static void main(String[] args) {
		
		
		String s[]= {"Aruna","Chinni","Pooroi","Madhu","Aruna"};
		
		
		//approach1
		boolean flag=false;
//		for(int i=0;i<s.length;i++) { //repeat complete loop //Aruna [next iteration i=1 Chinni and repeats
//			for(int j=i+1;j<s.length;j++) { //get next every element of  i=0 //chinni(next element) pooroi madhu Aruna[//get next every element of  i=1 pooroi(next element),madhu aruna like this repeats
//				if(s[i]==s[j]) {//compare the element //Aruna==chinni Aruna==pooroi Aruna==madhu Aruna=Aruna then prints and in next iteratio[Chinni==pooroi,chinni==madhu,chinni=aruna, an drepea
//					
//					
//					System.out.println("Found duplicate element:"+s[i]);
//					flag=true;
//				}
//			}
//		}
//		 if(flag==false) {
//			 System.out.println("duplicate element not found");
//		 }
		
		
		 
		//approach2 using hashset(only unique values no duplicates allow in hashset)
		
		
		HashSet<String> duplic=new HashSet();
		
//		System.out.println(duplic.add("aruna"));//true
//		System.out.println(duplic.add("chinni"));//true
//		System.out.println(duplic.add("aruna"));//false due to duplicate
//		System.out.println(duplic.add("aruna1"));//true
		
		for(String v:s) {
			if(duplic.add(v)==false) {
				System.out.println("duplicate found"+v);
				flag=true;
			}
		}
		if(flag=false) {
			System.out.println("no duplicates");
		}
		
		
		
		

	}

}
