package application;

public class StringEqual {

	public static void main(String[] args) {
		// �� ���� ���ڿ��� ������ ���Ѵ�.
		String t1= "apple";
		String t2= "apple";
		String t3= "���";
		
		System.out.printf("�� ���� ���ڿ� ��ġ : %b%n", t1 == t2);
		System.out.printf("�� ���� ���ڿ� ��ġ : %b%n", t1.equals(t2));
		System.out.printf("�� ���� ���ڿ� ��ġ : %b%n", t1.equals(t3));
		

	}

}
