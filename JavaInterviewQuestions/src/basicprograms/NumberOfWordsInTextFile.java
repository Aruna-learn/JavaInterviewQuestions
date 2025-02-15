package basicprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfWordsInTextFile {

	public static void main(String[] args) throws IOException {
		int count=0;
		//Opens a file in read mode  
		FileReader fr=new FileReader("./Java.txt");

		BufferedReader br=new BufferedReader(fr);

		String line;
		
		//Reads each line    
		while((line=br.readLine())!=null) {
			//Splits each line into words

			String[] words=line.split("");
			//Counts each word  
			count=count+words.length;
			System.out.println(line);
		}
		System.out.println("Number of words present in given file: " + count);  
		br.close();

	}

}
