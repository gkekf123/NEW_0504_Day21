package day21_0504.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Date;

public class BufferedReaderQuiz01 {

	public static void main(String[] args) {
		
		 /*
	       * 1. Date클래스를 이용해서 File경로에 하위폴더로 20200421file 폴더를 생성합니다
	       * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
	       * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
	       *    \r\n을 적절하게 이용해서 파일 출력을 완료 
	       *    
	       * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
	       */
		
		Date day = new Date();
		
		String path = "C:\\Users\\taeju\\eclipse-workspace\\File\\20200421file";
		
		
		File file = new File(path);
		
		if(file.exists() == false) {
			file.mkdir();
			System.out.println("date 폴더 생성 완료");
		} else {
			System.out.println("같은 이름의 폴더가 이미 존재합니다");
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.print("txt파일을 생성하세요");
			String a = br.readLine();
			bw.write(a);
			bw.flush();
			System.out.println("txt파일 생성 완료");

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
