package try_catch_2;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		// ���ܸ� ó���ϴ� try-catch ��
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("���ڸ� �Է� : ");
		String line= scanner.nextLine();
		scanner.close(); // ��ĳ�� ����
		
		int number= 0;
		boolean isNumber= false;
		
//		number= Integer.parseInt(line); // (��)
		try { // ���ܰ� �߻��� �� �ִ� �ڵ带 ����
			number= Integer.parseInt(line); // (��) ���ڿ��� ������ ��ȯ
//			Double.parseDouble(line); // ���ڿ��� �Ǽ� double�� ��ȯ
//			Float.parseFloat(line); // ���ڿ��� �Ǽ� float�� ��ȯ
			
//		} catch (Exception e) { // (��) ���� �߻��� ���α׷� ���ᰡ �ƴ϶� ����� �̵�
//			System.out.println("���� �߻�");
//		}
		
//			number= Integer.parseInt(line); // ���ڿ��� ������ ��ȯ
			isNumber= true;
		} catch (NumberFormatException e) {  // (��)
			System.out.println("������ ��ȯ�� �� �����ϴ�.");
		} 
		
		if (isNumber) {
		System.out.println("�Է��� ���ڴ� : "+ number);
		}
	}

}
