package application;

import java.util.Scanner; // java.util ��Ű�� �ȿ� Scanner Ŭ������ �ҷ��ͼ� ��밡��

public class UserInput {

	public static void main(String[] args) {
		// �Է��� �޴� Ŭ����
		Scanner scanner= new Scanner(System.in);  //��ĳ�� ��ü�� ����
		
		System.out.print("�µ��� �Է��� �ּ��� : ");
//		String input= scanner.nextLine();
//		int x= Integer.parseInt(input); 
		// ���� �� ���� �Ʒ� �� �ٰ� ����.
		int x= scanner.nextInt(); // ��ĳ�ʷ� ���� �Է��� �޾� x�� �Է�, 
		// ����� �Է��� ����ϰ� ����Ű�� �ԷµǸ� ����
		System.out.println(x);
		
		System.out.print("ȭ���� ��ȯ�� �µ��� �Է��� �ּ��� : ");
		double c= scanner.nextDouble();
		double f= (c* 9/5)+ 32;
		
		System.out.printf("���� %.1f�� ȭ�� %.1f �̴�.%n", c, f);
		
		System.out.print("ȭ���� ��ȯ�� �µ��� �Է��� �ּ��� : ");
		float C= scanner.nextFloat();
		float F= (C* 9/5)+ 32;
		
		System.out.printf("���� %.2f�� ȭ�� %.3f �̴�.%n", C, F);
		

	}

}
