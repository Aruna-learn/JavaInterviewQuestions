package basicprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MostRepeatedWordInTextFile {

	public static void main(String[] args) throws Exception {

		FileReader fr=new FileReader("./Java.txt");

		BufferedReader br=new BufferedReader(fr);


		ArrayList<String> repeat = new ArrayList<String>();    
		String line;
		String	word = "";   


		int count,maxcount=0;
		//Reads each line    
		while((line=br.readLine())!=null) {
			String[] words=line.toLowerCase().split("([,.\\s]+ )");

			for(String st:words) {
				repeat.add(st);

			}

		}

		for(int i=0;i<repeat.size();i++)
		{
			count=1;
			for(int j=i+1;j<repeat.size();j++) {
				if(repeat.get(i).equals(repeat.get(j))) {
					count++;
				}
			}
			if(count > maxcount){    
				maxcount = count;    
				word = repeat.get(i);    
			}    

		}
		System.out.println("Most repeated word: " + word);    
		br.close();    















	}

}
