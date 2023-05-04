package day21_0504.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx02 {

	public static void main(String[] args) {

		/* 
		 * flush() - 중간에 파일을 즉시 사용하고 싶으면 사용
		 * 			
		 * bufferwrite가 끝나면 자동으로 flush() -> 나감
		 */
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\Users\\taeju\\eclipse-workspace\\File\\test2.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			System.out.print(">");
			String word1 = sc.next();
			bw.write(word1);
			
			// buffer에 있는 내용을 내보낸다
			bw.flush();
			
			System.out.print(">");
			String word2 = sc.next();
			bw.write(word2);
			
			System.out.println("파일 출력 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
