package application;

public class Printf {

	public static void main(String[] args) {
		// Printf ���
		int age= 25;
		String addr = "������";
		double pi= 3.14;
				
		System.out.printf("�� ���̴� %d�� �Դϴ�.\n", age);
		System.out.printf("�� ���̴� %d���̰� %s�� ��� �ֽ��ϴ�.\n", age, addr);
		System.out.printf("������ ���� : %f%n", pi);  // printf�� �ٶ���� ����
		System.out.printf("������ ���� : %.2f", pi);  // %.2f : �Ҽ��� 2�ڸ�����
		

	}

}
