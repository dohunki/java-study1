package writing_lineByline_5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// ������ ��ġ
		String fileLocation= "C:\\JAVA\\java-study3\\CH20_Reading_Writing\\test.txt";
		// ���� ���� �ּҷ� ���ϰ�ü ���� �޼��� exists�� ������ ������ true, ������ false
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
		// ���� ����
		try(BufferedWriter br= new BufferedWriter(new FileWriter(fileLocation));) {
			br.write("������");
			br.newLine();
			br.write("����");
			br.newLine();
			br.write("�ٳ���");
			br.newLine();
			br.write("��");
			br.newLine();
			
		} catch (IOException e) {
			// ���� �� �� ����
			System.out.println("������ �� �� ���� : "+ fileLocation);
			
		}

	}

}
