package day21_0504.api.io.output;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {

		/* 
		 * 1. 파일을 읽는데 사용하는 클래스 FileInputStream
		 * 2. 생송자 매개변수에 읽을 파일의 경로가 들어간다
		 */
		
		String path = "C:\\\\Users\\\\taeju\\\\eclipse-workspace\\\\File\\\\example.txt";
		
		try {
			
			InputStream in = new FileInputStream(path);	
			
			// 한글자 읽을 때
//			int result = in.read();
//			System.out.println((char)result);
			
//			System.out.println(in.read());
			
			// 1.
			// read()함수는 하나씩 데이터를 읽고, 더 읽을 값이 없다면 -1을 반환
//			while(true) {
//				int result = in.read();
//				if(result == -1) break; //그만 
//				System.out.println((char)result);
//			}
			
			// 2.
			//read(배열)
			byte[] arr = new byte[100];
			
			// 읽어들인 크기 반환
			int result = in.read(arr);
			System.out.println(result);
			//System.out.println(Arrays.toString(arr));
			
			int i = 0;
			while(true) {
				if(arr[i] == 0) break;
				System.out.println((char)arr[i]);
				i++;
			}
			
			// 더 읽을 값이 없다면 -1 반환
			int result2 = in.read(arr);
			System.out.println(result2);
			
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
