package day21_0504.api.io.file;

import java.io.File;

public class CreateFileEx {

	public static void main(String[] args) {

		/* 
		 * File 클래스
		 * 외부경로에 폴더 or 단순한 파일 생성이나 삭제를 할 수 있다
		 */
		
		String path = "C:\\Users\\taeju\\eclipse-workspace\\File\\20230504";
		
		try {
		
			File file = new File(path);	
		
			// 생성
			if(file.exists() == false) {	// 존재하면 true, 존재하지 않으면 false
				file.mkdir();	// make directory	
				System.out.println("폴더 생성 완료");
			} else {
				System.out.println("같은 이름의 폴더가 존재한다");
			}
			
			//삭제
			if(file.exists() == true) {
				file.delete();
				System.out.println("폴더가 삭제되었습니다.");	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
