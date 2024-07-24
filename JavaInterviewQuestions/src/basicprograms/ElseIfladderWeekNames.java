package basicprograms;

public class ElseIfladderWeekNames {

	public static void main(String[] args) {
		int wn=0;//wn is week number

		if(wn==1) {
			System.out.println("sunday");
		}
		
		else if(wn==2) {
			System.out.println("monday");
		}
		
		else if(wn==3) {
			System.out.println("tuesday");
		}
		
		else if(wn==4) {
			System.out.println("wednesday");
		}
		
		else if(wn==5) {
			System.out.println("thursday");
		}
		
		else if(wn==6) {
			System.out.println("friday");//instead of using the mutiple eklse if statements using this code lines will more to reduce this we use the switch case
		}
		
		else if(wn==7) {
			System.out.println("saturday");
		}
		
		else
			System.out.println("invalid  weeek number");
		
		
	}

}
