package application;

import java.util.Scanner; // java.util ��Ű�� �ȿ� Scanner Ŭ������ �ҷ��ͼ� ��밡��

public class UserInput {

	public static void main(String[] args) {
		// �Է��� �޴� Ŭ����
		Scanner scanner= new Scanner(System.in);  //��ĳ�� ��ü�� ����
		
		System.out.println("�µ��� �Է��� �ּ��� : ");
		int x= scanner.nextInt(); // ��ĳ�ʷ� ���� �Է��� �޾� x�� �Է�, 
		// ����� �Է��� ����ϰ� ����Ű�� �ԷµǸ� ����
		System.out.println(x);
		
		double c= scanner.nextDouble();
		double f= (c* 9/5)+ 32;
		
		System.out.println("����" + c + "�� ȭ��" + f +"�̴�.");
		

	}

}
