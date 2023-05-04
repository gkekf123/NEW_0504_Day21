package day21_0504.api.io.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx {

	public static void main(String[] args) {

		// 다 읽을 수 있다(동영상, 문서, 텍스트...)
		/* 
		 * FileInputStrean, FileOutputStream은
		 * 동영상, 이미지 파일을 읽거나 쓸때 사용한다
		 */
		
		
		// readPath는 파일명까지 들어가야 된다
		String readPaht = "C:\\Users\\taeju\\eclipse-workspace\\File\\메서드1.mp4";	
		String writePath = "C:\\Users\\taeju\\eclipse-workspace\\FileCopy\\메서드1_copy.mp4";
		
		// 향상된 try ~ catch문 
		//	-> Closeable 인터페이스를 상속 받고 있어야만 사용 가능
		// close 작업을 대신한다
		
//		InputStream is = null;
//		OutputStream out = null;
				
		try (InputStream is = new FileInputStream(readPaht);
				OutputStream out = new FileOutputStream(writePath)){
			
			// 읽음
			byte[] arr = new byte[2048]; //2048byte-> 2kb
			
			int result;
			while((result = is.read(arr) ) != -1)	 {	// 읽은 값이 -1이 아닐때까지
				// 밑 코드를 심플하게 변경 -> (result = is.read() ) != -1
//				int result = is.read(arr);
//				System.out.println(result);
//				if(result == -1) break;
				
				//쓰기
				// out.write(byte[] b)
				//	-> 마지막에 원치않는 데이터가 들어가기 때문에
				
				// arr데이터를 0 ~ byte배열의 ressult까지만 사용
				out.write(arr, 0, result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
//		finally {
//			 try {
//				 is.close();
//					out.close();
//			} catch (Exception e2) {
//				System.out.println("파일 close 에러");
//			}
//		}
		
	}

}
