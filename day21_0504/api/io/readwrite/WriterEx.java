package day21_0504.api.io.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {

	public static void main(String[] args) {

		/* 
		 * 문자를 사용해서 저장할 때는 2byte 기반 클래스 FileWriter()를 사용한다
		 * 
		 */
		
		String path = "C:\\Users\\taeju\\eclipse-workspace\\File\\text.txt";
		
		// FileWriter fw = new FileWriter();
		try (Writer fw = new FileWriter(path);){
			
			// \n - 줄바꿈
			// \r - 캐리지리턴 (맨 앞으로 당기기)
			String str = "그만 좀 자세요. \n\r그만 일어나. \n\r집에 가야지";
			fw.write(str);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}
