package stringprograms;

public class FirstRepeatingAndNonRepeatingChar {

	public static void main(String[] args) {
		String s="JavaLearning";
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
//			if(count==1) {
//				System.out.println("FirstNonRepeatingChar:"+count+" "+s.charAt(i));
//				break;
//			}
			if(count>1) {
				System.out.println("First Repeating Char:"+count+" "+s.charAt(i));
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
