package basicprograms;

public class ContinueJumpingStatement {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {
			if(i==5) { //it's not print the value  go to next iteration
				continue;//continue to next iteration and will not go to the sysout below statement
			}
			System.out.println(i);
		}
		
		
	}
	

}
