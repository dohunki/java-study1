package basic;

import java.util.Scanner;

public class pract1 {

	public static void main(String[] args) {
		// ��������1. if ~ else if �� 
//		System.out.println("�޴�");
//		System.out.println("====");
//		System.out.println("");
//		System.out.println("1. ����Ʈ '��ο�'");
//		System.out.println("2. ����Ʈ '�ȳ�?'");
//		System.out.println("3. ���α׷� ����");
//		System.out.println("");
//		System.out.print("�ɼ��� ���� > ");
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���! ");
		int input= scanner.nextInt();
		scanner.close();
		/*
		if (input== 1) {
			System.out.println("��ο�");	
		} else if (input==2) {
			System.out.println("�ȳ�?");
		} else if (input==3) {
			System.out.println("�����մϴ�.");
		} else if (input==10000) {
			System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
		} else {
			System.out.println("�߸��� �ɼ��Դϴ�.");
		} */
		
		// Switch case������ ����
		switch(input) {
		case 1: 
			System.out.println("��ο�");
			break; // �׻� ���̽� �ϳ� ���� break �ۼ�
		case 2: // �ɼǺ����� ���̽� 1�� ���� ��
			System.out.println("�ȳ�?");
			break;
		case 3: // �ɼǺ����� ���̽� 10�� ���� ��
			System.out.println("�����մϴ�.");
			break;
		case 10000: // �ɼǺ����� ���̽� 10�� ���� ��
			System.out.println("�̽��Ϳ��׸� �߰��߽��ϴ�.");
			break;
		default: // else�� ���� ���� ���̽��� �´� ���� ���� �� ����
			System.out.println("�߸��� �ɼ��Դϴ�.");
			break;
		}
	}
}