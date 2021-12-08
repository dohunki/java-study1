package reading_writing_txt_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
	public static void main(String[] args) throws IOException {
		// 텍스트 읽고 쓰기
		
		String text= "헬로우! \n 하우 아 유?"; // 쓸 내용
		
		Path path= Paths.get("C:\\JAVA\\new.txt");
//		Path path= Paths.get(".");
		// 파일의 경로 (c:\JAVA\java-study3\CH20_Reading_Writing\text.txt)
				
		// text.txt에 위의 text 내용을 쓰기
		// Files클래스의 스테틱 메서드 write(쓸 파일의 경로, 쓸 내용(byte단위))
//		Files.write(path, text.getBytes()); // 파일이 없을 경우 만든다.
		
		// 읽기
		String recivedText= Files.readString(path);
		System.out.println(recivedText);
	}

}
