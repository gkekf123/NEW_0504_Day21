package day21_0504.api.io.buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderUTF8 {

	public static void main(String[] args) {
		
		/* 
		 * 인코딩 - 파일 or 텍스트문서가 저장될 때 -> 컴퓨터가 아는 형태로 저장하는 형식
		 * 디코딩 - 컴퓨터가 아는 이진수 형태 -> 인간이 알고있는 문자형식으로 변경
		 */

		String path = "C:\\Users\\taeju\\eclipse-workspace\\File\\asd.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
		
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
				
	}

}
