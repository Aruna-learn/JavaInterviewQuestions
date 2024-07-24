package stringprograms;

public class DetermineWhetherOneStringIsRotationOfanother {

	public static void main(String[] args) {
		
		String s1="abcde";
		String s2="deabc";
		
		
		if(s1.length()!=s2.length())
		{
				System.out.println("Second String is not the rotation og first string");
				
		}
		else 
			s1=s1.concat(s2);
		
				if(s1.indexOf(s2)!=-1) { // If the string or character is not found, -1 is returned.
					System.out.println("Second string is a rotation of first string");
				}
				else
					System.out.println("Second string is not a rotation of first string");    
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
