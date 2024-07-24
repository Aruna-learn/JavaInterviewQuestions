package stringprograms;

public class FindMaximumAndMiniumOccuringCharacterInString {

	public static void main(String[] args) {
		String s = "abbcccddddd";


		int a[]=new int[127];//256 ascii value range

		char string[] = s.toCharArray(); 
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)]=a[s.charAt(i)]+1;
		}

		int max=0;
		int min=-1;
		char c=' ';
		char   minChar=' ';
		for(int i=0;i<s.length();i++)
		{
			if(max<a[s.charAt(i)]) {
				max=a[s.charAt(i)];
				c=s.charAt(i);
			}

		
		}


		System.out.println("maximum occurence characters are:"+max+" "+c);
		System.out.println("maximum occurence characters are:"+minChar);


	}






}
