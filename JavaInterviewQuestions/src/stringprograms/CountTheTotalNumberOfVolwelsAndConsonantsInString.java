package stringprograms;

public class CountTheTotalNumberOfVolwelsAndConsonantsInString {

	public static void main(String[] args) {
		
		String s="This is Aruna reddy";
		
		int vcount=0;
		int Ccount=0;
		
		//Converting entire string to lower case to reduce the comparisons    
       s = s.toLowerCase(); 
        
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||  s.charAt(i)=='i'||    s.charAt(i)=='o'||   s.charAt(i)=='u')
			   {
				vcount++;//increment vowel count
			   }
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				Ccount++;//increment consonanat count
			}
		}
		
		System.out.println("total number of vowels:"+vcount);
		System.out.println("total number of consonanats:"+Ccount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
