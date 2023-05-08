package day21_0504.api.io.buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderUTF8 {

	public static void main(String[] args) {
		
		/* 
		 * 인코딩 - 파일 or 텍스트문서가 저장될 때 -> 컴퓨터가 아는 형태로 저장하는 형식
		 * 디코딩 - 컴퓨터가 아는 이진수 형태 -> 인간이 알고있는 문자형식으로 변경]
		 * 
		 * InPutStreanReader = 1byte기반파일으ㅜㄹ -> 2byte기반으로 변경
		 * 파일을 읽을 때 인코딩 형식을 같이 지정할 수 있다
		 * 
		 * [ 방법 ]
		 * 1. 원본파일의 인코딩을 UTF-8로 변경
		 * 2. 임시적 - 파일의 인코딩형식이 다르면 (한글)이 깨지게 되는데 인코딩을 동일한 형태로 맞춰서 가지고 오면 된다.
		 */

		String path = "C:\\Users\\taeju\\eclipse-workspace\\File\\asd.txt";
		
//		FileInputStream fis = new FileInputStream(path); // 1바이트 기반
//		Reader rd = new InputStreamReader(fis, "UTF-8"); // 1바이트 기반을 2바이트 형식으로 변경 // System.in -> 키보드로 입력 
//		BufferedReader br = new BufferedReader(rd);	// 2바이트 기반 빠른읽기 - fis는 바이트 기반이므로 매개변수로 들어가지 못함
		// 위 세줄을 한줄로... \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"));){
		
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
				
	}

}
