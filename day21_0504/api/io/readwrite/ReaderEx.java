package day21_0504.api.io.readwrite;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {

	public static void main(String[] args) {

		/* 
		 * 문자기반 파일을 읽어서 사용할 때는 FileReader클래스를 사용합니다
		 * 2byte 기반
		 */
		
		String path = "C:\\Users\\taeju\\eclipse-workspace\\File\\text.txt";
		
		try(Reader fr = new FileReader(path);) {
			
			int result;
			while( (result = fr.read()) != -1) {
				System.out.print((char)result);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
