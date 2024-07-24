package arrayprograms;

public class DuplicationCountElementsArray {

	public static void main(String[] args) {
		int a[]= {10,20,10,40,30,20,60,20,75,34,20,12,20};
		int num=20;//check 20 for repetetions
		int count=0;

		for(int i=0;i<a.length;i++) {
			if( a[i]==num) {
				count++;//whenever match happens increase the count of matching number by 1 and stores
			}
		}

		System.out.println(count);//print how many time the number repeats












	}

}
