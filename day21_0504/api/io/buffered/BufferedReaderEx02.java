package day21_0504.api.io.buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx02 {

	public static void main(String[] args) {

		/*
		 * UnputStreamReader
		 * 1byte 데이터를 -> 2byte 기반으로 변경
		 */
		
//		Reader rw = new InputStreamReader(System.in);
//		BufferedReader bw = new BufferedReader(rw);
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		
			System.out.print(">");
			String name = br.readLine();
			
			System.out.println(name); //입력받은 결과
			
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
		
	
	
	}

}
