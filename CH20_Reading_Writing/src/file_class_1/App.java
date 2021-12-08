package file_class_1;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// ���� ��ü�� �����
		File currentDirectory= new File("."); // ���� ������ġ�� ��ü ����
		System.out.println(currentDirectory.getAbsolutePath()); // ���ϰ�ü�� ������ ���
		System.out.println(currentDirectory.getCanonicalPath()); // ���ϰ�ü�� ������ ���

		// ���� ���� ���ϵ��� ���
		for(String f : currentDirectory.list()) {
			System.out.println(f);
		}
	}

}
