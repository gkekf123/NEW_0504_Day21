package day21_0504.api.io.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {

		/* 
		 * 1. Scanner를 통해서 파일명을 입력 받는다
		 * 2. 입력받은 파일을 filecopy로 복사해서 옮겨주면 된다
		 */
		Scanner sc = new Scanner(System.in);
		
		String org = sc.next();
	
		
		String readPath = "C:\\Users\\taeju\\eclipse-workspace\\File" + org;
		String writePath = "C:\\Users\\taeju\\eclipse-workspace\\FileCopy" + org;
	
		
		try (InputStream is = new FileInputStream(readPath);
				OutputStream out = new FileOutputStream(writePath)){
			 
			byte[] arr = new byte[2048];
			
			int result;
			while( (result = is.read(arr) ) != -1) {
				out.write(arr, 0, result);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
