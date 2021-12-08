package file_location_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// ������ ��ġ
		String fileLocation= "C:\\JAVA\\java-study3\\CH20_Reading_Writing\\test.txt";
		// ���� ���� �ּҷ� ���ϰ�ü ���� �޼��� extsts�� ������ ������ true, ������ false
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
//		try  { // ������ �б� ���� ��ü ���� //...(1)
//			BufferedReader reader= new BufferedReader(new FileReader(fileLocation));  //...(1)
		try(BufferedReader reader= new BufferedReader(new FileReader(fileLocation))) { // (1)�� �� �� �ٷ� �ٲ�(�ڵ� �ݱ�)
			 // ���� �б�
			String line= null;
				// �� �� �б�
			while((line= reader.readLine()) != null) { // ������ ���� ���̻� ���ڰ� ������ null
				System.out.println(line); // ���̻� ���� ���� ���� ������ �о �� �پ� ����Ѵ�.
			}
//			reader.close();  //...(1)
		} catch (FileNotFoundException e) {
			// ���� ������ ã�� ������ �ܿ�
//			e.printStackTrace(); // ������ ����ó��
			System.out.println("������ ã�� ������ : "+ fileLocation);			
		} catch (IOException e) {
			// ���� ���� ���� ����
//			e.printStackTrace();
			System.out.println("������ ���� ���� : "+ fileLocation);
		}
		
	}
}
