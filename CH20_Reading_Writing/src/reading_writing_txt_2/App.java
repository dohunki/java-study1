package reading_writing_txt_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
	public static void main(String[] args) throws IOException {
		// �ؽ�Ʈ �а� ����
		
		String text= "��ο�! \n �Ͽ� �� ��?"; // �� ����
		
		Path path= Paths.get("C:\\JAVA\\new.txt");
//		Path path= Paths.get(".");
		// ������ ��� (c:\JAVA\java-study3\CH20_Reading_Writing\text.txt)
				
		// text.txt�� ���� text ������ ����
		// FilesŬ������ ����ƽ �޼��� write(�� ������ ���, �� ����(byte����))
//		Files.write(path, text.getBytes()); // ������ ���� ��� �����.
		
		// �б�
		String recivedText= Files.readString(path);
		System.out.println(recivedText);
	}

}
