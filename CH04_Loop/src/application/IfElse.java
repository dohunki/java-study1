package application;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// 
		Scanner scanner= new Scanner(System.in);
		System.out.print("����� ������?");
		int apple= scanner.nextInt();
		System.out.print("�ٳ����� ������?");
		int banana= scanner.nextInt();
		scanner.close(); // ��ĳ�� ���� (�� �̻� �Ⱦ���)
		
		if(apple < banana) {
			System.out.println("�ٳ����� ������� ����");
		}
		else { 
			System.out.println("����� �ٳ������� ����");
		}
		System.out.println("���α׷� ����.");
		
	}

}
