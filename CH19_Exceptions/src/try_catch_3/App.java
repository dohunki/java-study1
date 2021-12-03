package try_catch_3;

import java.util.Scanner;

public class App {
	private static Scanner scanner= new Scanner(System.in);
	
	public static void main(String[] args) {
		// ���ܸ� ó���ϴ� try-catch ��
		
		int number= getNumber();
		System.out.println("�Է��� ���ڴ� : "+ number);
		scanner.close(); // ��ĳ�� ����
	}
	
	private static int getNumber() {
		int number= 0;
		boolean isNumber= false;
		
	
		// ���ڸ� �Է��� ������ �ݺ� do while�� ���
		do {
			System.out.print("���ڸ� �Է� : ");
			String line= scanner.nextLine();
			
			try { // ���ܰ� �߻��� �� �ִ� �ڵ带 ����
				number= Integer.parseInt(line); // ���ڿ��� ������ ��ȯ
				isNumber= true; // ���� �Էµ�
			} catch (NumberFormatException e) {  
				System.out.println("������ ��ȯ�� �� �����ϴ�.");
			} 
		} while (!isNumber);
		
		return number;
	}

}
