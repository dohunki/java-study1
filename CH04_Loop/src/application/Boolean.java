package application;

public class Boolean {

	public static void main(String[] args) {
		// booleanŸ���� ��, ����(true, false)
		boolean c1= false;
		System.out.println("����1 : "+ c1);
		
		// �� ����� ��, ����
		boolean c2= 4 < 5;
		System.out.println("����2 : "+ c2);
		
		// �� == : ���� �� ��/ �ƴϸ� ����, != : ���� ���� �� ��/ �ƴϸ� ����
		boolean c3= 4 != 5;
		System.out.println("����3 : "+ c3);
		
		boolean c4= 4 == 5;
		System.out.printf("����4 : %b", c4); // boolean�� %b�� printf�� ���

	}

}
