package stringprograms;

public class RemoveJunkorSpecialCharinString {

	public static void main(String[] args) {
		
		String s="� ��� �Sheet1�12Page";
		String s1="Entry1209^,��";
		
		
		//using replcae all method with regular expression(we need) and replacement(replace with space)
		 String junk=s.replaceAll("[^a-zA-Z0-9]", "");
		 String junk1=s1.replaceAll("[^a-zA-Z0-9]", "");
		
		
		System.out.println(junk);
		System.out.println(junk1);
		
		
		
		
		

	}

}
