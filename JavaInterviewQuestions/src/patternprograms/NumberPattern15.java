package patternprograms;

public class NumberPattern15 {

	public static void main(String[] args) {
		
		int i,j;
		for(i=1;i<8;i++){// this loop is used to print the lines  
	        for(j=1;j<=8/2;j++){// this loop is used to print numbers  
	            if(i==j){  
	                System.out.print(j);  
	            }  
	            else if(i>4 && j==8-i){  
	                System.out.print(j);  
	            }  
	            else{  
	               System.out.print(" ");  
	            }  
	        }  
	        j=j-2;  
	        while(j>0){ //this loop is used to print numbers  
	            if(i==j){  
	            System.out.print(j);  
	            }  
	            else if(i>4 && j==8-i){  
	                System.out.print(j);  
	            }  
	            else{  
	                System.out.print(" ");  
	            }  
	               
	            j--;  
	        }  
	        System.out.println("");   
	               
	               
	        }      
			 
	               
	               
	                  
//		1     1
//		 2   2 
//		  3 3  
//		   4   
//		  3 3  
//		 2   2 
//		1     1
	               
          
	               
	}

}
