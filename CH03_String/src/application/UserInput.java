package application;

import java.util.Scanner; // java.util ��Ű�� �ȿ� Scanner Ŭ������ �ҷ��ͼ� ��밡��

public class UserInput {

	public static void main(String[] args) {
		// �Է��� �޴� Ŭ����
		Scanner scanner= new Scanner(System.in);  //��ĳ�� ��ü�� ����
		
		System.out.print("�µ��� �Է��� �ּ��� : ");
		int x= scanner.nextInt(); // ��ĳ�ʷ� ���� �Է��� �޾� x�� �Է�, 
		// ����� �Է��� ����ϰ� ����Ű�� �ԷµǸ� ����
		System.out.println(x);
		
		System.out.print("ȭ���� ��ȯ�� �µ��� �Է��� �ּ��� : ");
		double c= scanner.nextDouble();
		double f= (c* 9/5)+ 32;
		
		System.out.printf("���� %.1f�� ȭ�� %.1f �̴�.", c, f);
		

	}

}
