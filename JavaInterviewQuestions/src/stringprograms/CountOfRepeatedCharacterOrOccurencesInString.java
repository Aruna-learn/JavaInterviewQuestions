package stringprograms;

public class CountOfRepeatedCharacterOrOccurencesInString {

	public static void main(String[] args) {
		
		String s="poolaarunaaruna394@gmail.com";
		
		int totalstringlength=s.length();
		System.out.println("total string length is:"+totalstringlength);
		
		int replacerepeatedstring =s.replace("a", "").length();
		System.out.println("after a is replace with space:"+replacerepeatedstring);
		
		int repeatedcharacterscount=totalstringlength-replacerepeatedstring;
		
		System.out.println("repeated char count is:"+repeatedcharacterscount);
		

		
		
		
		
		
		
		
		
		
		String str = "sangeeta";
        char[] ch = str.toCharArray();
        for (int i = 0; i <str.length(); i++) {//take 1st char s, then compare a with n,g,e,e,t,a so match found return and compare again remaining char
            for (int j = i + 1; j <str.length(); j++) {//compare s with a if not true increment j value then comparte with n if not true increase j value then compare with g and goes on and one j loop done increment i and compare again
                if (ch[i] == ch[j]) {
                    System.out.println("repeated or duplicated characters are:"+ch[i]);
                }
            }
        }
	}

}
