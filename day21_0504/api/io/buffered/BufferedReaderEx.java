package day21_0504.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {

	public static void main(String[] args) {

		String path = "C:\\Users\\taeju\\eclipse-workspace\\File\\text.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
//			String result = br.readLine();
//			System.out.println(result);
			
			String result;
			while( (result = br.readLine()) != null) {	//read() - 한 글자씩, read(char[]) - 배열씩, readLine() - 한줄씩
				System.out.println(result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
