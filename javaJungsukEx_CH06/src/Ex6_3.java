

public class Ex6_3 {

		public static void main(String args[]) {
			System.out.println("Card.width = " + Card.width);
			System.out.println("Card.height = " + Card.height);
			// Ŭ���� ����(Card.width��)�� ��ü �������� 'Ŭ�����̸�.Ŭ��������'�� ���� ��� �����ϴ�.

			Card c1 = new Card(); // c1 ��ü ����
			c1.kind = "Heart";
			c1.number = 7;
			// �ν��Ͻ� ������ ���� ����

			Card c2 = new Card(); // c2 ��ü ����
			c2.kind = "Spade";
			c2.number = 4;
			// �ν��Ͻ� ������ ���� ����

			System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
			System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
			System.out.println("Card�� width�� height�� ���� 50, 80���� �����մϴ�.");
			c1.width = 50;
			c1.height = 80;
			// Ŭ���� ������ ���� ����
			// ���⼭ c1�� Ŭ���������� ������ Card.width= 50; Card.height= 80; ���� ����� �Ѵ�.
			// Card�ν��Ͻ��� c1�� c2�� Ŭ���� ������ width�� height�� �����ϱ� ������ 
			// c1�� width�� height�� �����ϸ� c2�� width�� height ���� �ٲ� �Ͱ� ���� ����� ��´�.

			System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
			System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		}
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}


