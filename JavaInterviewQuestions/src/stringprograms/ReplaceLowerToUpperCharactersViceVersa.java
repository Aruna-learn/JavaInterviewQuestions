package stringprograms;

public class ReplaceLowerToUpperCharactersViceVersa {

	public static void main(String[] args) {
		
		String s="Aruna Reddy";
		
		
		//DEFINE newstr as StringBuffer object .
		StringBuffer sb=new StringBuffer(s);
		
		for(int i=0;i<s.length();i++)
		{
			//Checks for lower case character    
			if(Character.isLowerCase(s.charAt(i)))
			{
				
				//Convert it into upper case using toUpperCase() function   
				sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
				
				
			}
			//Checks for Upper case character   
			else if (Character.isUpperCase(s.charAt(i)))
			{
				
				//Convert it into upper case using toLowerCase() function   
				sb.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}
				
			
		}
		System.out.println("After Case Conversion:"+sb);
			
			
			
			
			
			
			
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
