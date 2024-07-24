package basicprograms;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		
		//while loop
		int i=10;
		while(i<=5) { //if the condition false it will not execute
			System.out.println(i);
			i++;
		}
		
		
		//do while
		
		do { //if the condition is false it will execute atlease once
			System.out.println(i);
			i++;
		}while(i<=5);
		
		
		
		
	}

}
