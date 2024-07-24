package patternprograms;

public class CharPattern3 {

	public static void main(String[] args) {
		char alpha='A';
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.print((alpha)+" ");////adds the value of j in the ASCII value of A and prints the corresponding alphabet  
			alpha++;
			}
			System.out.println();
		}

	}

}

//A B C D E F 
//G H I J K L 
//M N O P Q R 
//S T U V W X 
//Y Z [ \ ] ^ 
//_ ` a b c d