package day21_0504.api.io.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) throws FileNotFoundException {

		// 추상클래스이기 때문에 객체생성 문법은 안된다
		// 부모클래스 용도로만 사용
		/* 
		 * 파일을 쓸 때 사용한믄 클래스는 FileOutputStream입니다
		 * 생성자 매개값으로 파일을 쓸 경로가 들어간다
		 * 
		 * io 패키지 거의 모든 클래스들은 생정자에 throws가 있기 때문에
		 * 반드시 예외처리 문장 안에서 사용해야 한다
		 */

	String path = "C:\\Users\\taeju\\eclipse-workspace\\File\\example.txt" ;
	
	try {
		//FileOutputStream out = new FileOutputStream(path);사용 가능
		//OutputStream : 부모타입 사용
		OutputStream out = new FileOutputStream(path);	
		
		// 1. 한 글자씩 씀
//		out.write(65);	
//		out.write(66);
//		out.write(67);
	
		// 2. 배열에 들어있는 데이터를 한번에 씀
//		byte[] arr = {65, 66, 67, 68, 69};
//		out.write(arr);
		
		// 3. 문자열을 바이트 배열로 변환
			// 한글을 사용하면 안된다 - 1byte이기 때문에 잘린다 - 읽을 때 문제가 된다
		String str = "한글~";
		byte[] arr2 = str.getBytes();
		out.write(arr2);
		
		// 자원 해제 - 스트림을 계속 만들게 되면 혼합 될 수 있기 때문에 끝내줘야 한다
		out.close();
		
		// 모든 예외 처리 받게 Exception 사용 - FileNotFoundException사용 안됌
	} catch (Exception e) {	
		e.printStackTrace();
	}
	
	}

}
