package arrayprograms;

public class Copyarrayelements {

	public static void main(String[] args) {
		int[] arr1=new int[] {1,2,3,4,90,23};//array1
		int[] arr2=new int[arr1.length];//array2 with length of array1
			
		
		for (int i = 0; i < arr1.length; i++) {//copying all elements from array1 to array2
			arr2=arr1;
		}
		
		
		//display elements of array1
		System.out.println("Elements of array1:");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] +"");
		}
		
		//display elements of array2
		System.out.println("Elements of array2:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+"");
		}
				
				
		}
	}


