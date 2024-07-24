package stringprograms;

public class FrequencyOfCharacters {

	public static void main(String[] args) {

//		String s = "Aruna Reddy";
//        s = s.toLowerCase(); // Convert to lowercase for case insensitivity
//        char[] ch = s.toCharArray();
//        
//        System.out.println("Character frequencies in the given string:");
//
//        // To track characters that have already been counted
//        boolean[] counted = new boolean[s.length()];
//
//        for (int i = 0; i < s.length(); i++) {
//            // Skip this character if it has already been counted
//            if (counted[i] || ch[i] == ' ') {
//                continue;
//            }
//            
//            int count = 1;
//            for (int j = i + 1; j < s.length(); j++) {
//                if (ch[i] == ch[j]) {
//                    count++;
//                    counted[j] = true; // Mark this character as counted
//                }
//            }
//            System.out.println(ch[i] + " -> " + count);
//        }
//    }








	String str = "sangeeta";
    char[] ch = str.toCharArray();
    int count;
    boolean[] counted = new boolean[str.length()];
    for (int i = 0; i <str.length(); i++) 
    {
    	if (counted[i] || ch[i] == ' ') {
        continue;
     }
    	count=1;
        for (int j = i + 1; j <str.length(); j++) {//compare s with a if not true increment j value then comparte with n if not true increase j value then compare with g and goes on and one j loop done increment i and compare again
            if (ch[i] == ch[j]) {
            	count++;
            	counted[j]=true;
            }
                //System.out.println("repeated or duplicated characters are:"+ch[i]+"->"+count);
            }
        System.out.println("repeated or duplicated characters are:"+ch[i]+"->"+count);
        }
    
    }

	









	}


