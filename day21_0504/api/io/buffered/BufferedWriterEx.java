package day21_0504.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
public class BufferedWriterEx {

	public static void main(String[] args) {

		/* 
		 * Buffered가 붙으면 입출력을 빠르게 하는 성능향상 스트림(보조)
		 * 
		 * 보조스트림이라고 부르고 Reader, Writer, InputStream, OutputStream과 같이 사용 된다
		 * 
		 * Writer객체에 두번째 매개변수에 true주면, 기존파일에 추가 한다
		 */
		
		String path = "C:\\Users\\taeju\\eclipse-workspace\\File\\test.txt";
		
		//Writer fw = new FileWriter(path);
		//BufferedWriter bw = new BufferedWriter(fw);
		// 위 코드를 줄여서 사용 한 것 - BufferedWriter bw = new BufferedWriter(new FileWriter(path))
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)) ) {
			
			String str = "오늘은 날씨가 맑습니다\n내일은 쉽니다.\n"; // \r 빼고 사용 해도 된다
			bw.write(str);
			
			System.out.println("파일 쓰기 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
