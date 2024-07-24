package arrayprograms;

import java.util.Iterator;

public class RemoveDuplicateELementsInSortedArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 5, 6, 7};
        int j = 0;//for storing temp elements
        int temp[] = new int[a.length];
        
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) { //1!=2 
                temp[j] = a[i];//store 1 in the temp array
                j++;
            }
        }
        temp[j] = a[a.length - 1];//to get last element
        j++;

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }

		



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}

