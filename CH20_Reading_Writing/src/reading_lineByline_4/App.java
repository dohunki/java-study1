package reading_lineByline_4;

import java.io.File;

public class App {

	public static void main(String[] args) {
		// ������ ��ġ
		String fileLocation= "C:\\JAVA\\java-study3\\CH20_Reading_Writing\\test.txt";
		// ���� ���� �ּҷ� ���ϰ�ü ���� �޼��� exists�� ������ ������ true, ������ false
		System.out.println(new File(fileLocation).exists());

	}

}
