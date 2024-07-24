package stringprograms;

public class ReplaceTheSpacesOfStringWithSpecificCharacter {

	public static void main(String[] args) {
		
		String s="Aruna Software Engineer";
		
		
//		s=s.replaceAll("\s","?" );
//		System.out.println(s);
		
		
		//ANother way
		//char ch = '-';    
        //Replace space with specific character ch    
       // s = s.replace(' ', ch);    

		char[] ch=s.toCharArray();
		
		char replace = '?'; 
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				ch[i]=replace;
			}
		}
		
		s = new String(ch);//convert array to string
        System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
