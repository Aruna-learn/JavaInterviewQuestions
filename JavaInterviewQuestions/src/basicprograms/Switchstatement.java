package basicprograms;

public class Switchstatement {

	public static void main(String[] args) {
		int weekno=4;
		
		switch(weekno) // instead of using multiple else if ladder wecan use the switch case so line of code will reduce
		{
		case 1: System.out.println("sunday");break;//if we didn't use break it will automatocally print the next statement without checlking the condition
		case 2: System.out.println("monday");break;
		case 3: System.out.println("tuesday");break;
		case 4: System.out.println("wednesday");break;
		case 5: System.out.println("thursday");break;
		case 6: System.out.println("friday");break;
		case 7: System.out.println("saturday");break;
		default: System.out.println("invalid weekno");
		
		}

	}

}
