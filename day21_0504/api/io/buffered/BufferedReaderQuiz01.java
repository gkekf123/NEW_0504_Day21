package day21_0504.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BufferedReaderQuiz01 {

	public static void main(String[] args) {
		
		 /*
	       * 1. Date클래스를 이용해서 현재날짜를입력받은 폴더를  C:\\Users\\taeju\\eclipse-workspace\\File 하위폴더로 생성합니다
	       * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
	       * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
	       *    \r\n을 적절하게 이용해서 파일 출력을 완료 
	       *    
	       * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
	       */
		
		
		
		/*
		// 현재 날짜로 폴더 생성
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String dirName = dateFormat.format(date) + "File";
		
		// 파일 경로
		String path = "C:\\Users\\taeju\\eclipse-workspace\\File\\" + dirName;
		
		// 폴더 생성
		File file = new File(path);
		
		if(file.exists() == false) {
			file.mkdir();
			System.out.println("date 폴더 생성 완료");
		} else {
			System.out.println("같은 이름의 폴더가 이미 존재합니다");
		}
		
		// 파일명 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명을 입력하시오 : ");
		String fileName = sc.nextLine();
		String filePath = path + "\\" + dirName + ".txt";
		
		
		// 파일 생성
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))){
			
			String result = "";
			while(!result.equals("그만")) {
				System.out.println("그만하시려면 '그만'을 입력하세요");
				result = sc.nextLine();
				bw.write(result);
				bw.newLine();
			}
			
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		// 파일 읽기
		try{
			
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			
			String result;
			while ((result = br.readLine()) != null) {
				System.out.println(result);
			}
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str  = br.readLine();
	
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date) + "file";
		
		String filePath = "C:\\Users\\taeju\\eclipse-workspace\\File\\" + now;
		String path = filePath + "\\" + ".txt";
	
		File file = new File(now);
		if(file.exists() == false) {
			file.mkdir();
			System.out.println("폴더 생성 완료");
		} else {
			System.out.println("폴더가 이미 존재 합니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 > ");
		String filename = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path));
				BufferedWriter bw = new BufferedWriter(new FileWriter(path));) {
			
			// 쓰는 작업
			while(true) {
				System.out.println(">");
				String str = sc.nextLine();
				
				if(str.equals("그만")) {
					System.out.println("종료하시려면 '그만'을 입력하세요");
					break;
				}
				
				bw.write(str);	//쓴다
				
				bw.flush();
			}
			
			// 읽는 작업
			String result;
			while((result = br.readLine()) != null) {
				System.out.println(result);
			}
			br.close();		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
		
		
	}

}
