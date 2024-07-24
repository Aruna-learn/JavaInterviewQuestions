package patternprograms;

public class CharacterPattern1 {

	public static void main(String[] args) {
		
		int alpha=65;
		
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				
		System.out.print((char)(alpha+j)+" ");
		}
		System.out.println();
		}
		
		
		
	}

}

//F E D C B A 
//F E D C B 
//F E D C 
//F E D 
//F E 
//F 