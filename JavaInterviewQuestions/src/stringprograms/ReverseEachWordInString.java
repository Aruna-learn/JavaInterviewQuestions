package stringprograms;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		//1.take string 
		//2.split the string into multiplewords and store in array
		//3.reverse each word using foreach and for loop and store
		//4.add all the reversed words into string

		//		String s="Poololla Aruna Reddy";
		//		String words[]=	s.split(" ");//whenever space is there then split the words
		//
		//		String reversedstring="";//store reversed final string 
		//
		//		for(String w:words) {//words= Poololla(1st) assign to w, then Aruna, Reddy
		//			String wordreverse="";
		//
		//			for(int i=w.length()-1;i>=0;i--) {//word in w is  Poololla and using index from last or backward take each and every char, same process for Aruna and Reddy
		//				wordreverse=wordreverse+w.charAt(i);//and store in wordreverse allolooP
		//
		//			}
		//
		//
		//			reversedstring=reversedstring+wordreverse+" ";//store the wordreverse in reversedstring with space separator
		//		}
		//
		//		System.out.println(reversedstring);


		//approach 2 using string builder cxlass
		String s="Aruna Reddy";

		String words[]=s.split("\\s");

		String reversedstring="";
		for(String w:words)//words= Reddy(1st) assign to w, then Aruna
		{
			StringBuilder sbl=new StringBuilder(s);//assign string to stringbuilder and converti to string builder
			sbl.reverse();//reverse

			reversedstring=reversedstring+sbl.toString()+" ";//after reverse the word and convert the stringbuilder string to normal string using sbl.string and give word space

		}




		System.out.println(reversedstring);









	}

}
