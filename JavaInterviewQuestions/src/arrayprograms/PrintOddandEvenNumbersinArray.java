package arrayprograms;

public class PrintOddandEvenNumbersinArray {

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3, 6, 9,7,5,0};//array created
		
		
		
		System.out.println("oddnumbers");
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]%2!=0) {                  //if reminder is not equal to zero then it is odd number otherwise even number
//				System.out.println(arr[i]);// If it is divided by 2, it is even number otherwise it is odd number.
//			}
//		}
		
		//using for each loop
		for(int odd:arr) {
			if(odd%2!=0) {
				System.out.println(odd);
			}
		}
		
		
		
		
		
		
		
		
		System.out.println("evennumbers");
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]%2==0) {
//				System.out.println(arr[i]);
//			}
//		}
		
		
		
		//using for each loop
				for(int evn:arr) {
					if(evn%2==0) {
						System.out.println(evn);
					}
				}

	}

}
