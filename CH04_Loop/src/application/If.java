package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
//		// if ���ǹ� 
//		int apple= 10;
//		int banana= 5;
//		
//		if(apple > banana) {
//			System.out.println("����� �ٳ������� ����");
//		}
//		System.out.println("���α׷� ����.");
//		System.out.println("%n%n");
//		
//		if(apple < banana) {
//			System.out.println("�ٳ����� ������� ����");
//		}
//		System.out.println("���α׷� ����.");
//		System.out.println("%n%n");
//		
		//��ĳ��
		Scanner scanner= new Scanner(System.in);
		System.out.print("����� ������?");
		int apple= scanner.nextInt();
		System.out.print("�ٳ����� ������?");
		int banana= scanner.nextInt();
		scanner.close(); // ��ĳ�� ���� (�� �̻� �Ⱦ���)
		
		if(apple < banana) {
			System.out.println("�ٳ����� ������� ����");
		}
		if(apple > banana) {
			System.out.println("����� �ٳ������� ����");
		}
		System.out.println("���α׷� ����.");
		

	}

}
