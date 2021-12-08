package file_location_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation= "C:\\JAVA\\java-study3\\CH20_Reading_Writing\\test.txt";
		// 위의 파일 주소로 파일객체 생성 메서드 extsts는 파일이 있으면 true, 없으면 false
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
//		try  { // 파일을 읽기 위한 객체 생성 //...(1)
//			BufferedReader reader= new BufferedReader(new FileReader(fileLocation));  //...(1)
		try(BufferedReader reader= new BufferedReader(new FileReader(fileLocation))) { // (1)이 이 한 줄로 바뀜(자동 닫기)
			 // 파일 읽기
			String line= null;
				// 한 줄 읽기
			while((line= reader.readLine()) != null) { // 파일의 끝에 더이상 문자가 없으면 null
				System.out.println(line); // 더이상 읽을 줄이 없을 때까지 읽어서 한 줄씩 출력한다.
			}
//			reader.close();  //...(1)
		} catch (FileNotFoundException e) {
			// 실제 파일을 찾지 못했을 겨우
//			e.printStackTrace(); // 빨간색 예외처리
			System.out.println("파일을 찾지 못했음 : "+ fileLocation);			
		} catch (IOException e) {
			// 파일 읽지 못함 예외
//			e.printStackTrace();
			System.out.println("파일을 읽지 못함 : "+ fileLocation);
		}
		
	}
}
