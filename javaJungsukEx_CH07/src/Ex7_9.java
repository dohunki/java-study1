/*
 * ���� ������ ��ü�� �迭�� �ٷ��
 * -����Ÿ���� ���������� �ڼ�Ÿ���� ��ü�� �����ϴ� ���� �����ϹǷ�, ProductŬ������
 *  Tv, Computer, AudioŬ������ ������ ��, ������ ���� �� �� �̴�.
 *  
 * Product p1= new Tv();
 * Product p2= new Computer();
 * Product p3= new Audio();
 * 
 * -����Ÿ���� �迭�� �ڼյ��� ��ü�� ���� �� �ִ�.
 *  ���� �ڵ带 ProductŸ���� �������� �迭�� ó���ϸ� ������ ����.
 *  
 * Product p[]= new Product[3];
 * p[0]= new Tv();
 * p[1]= new Computer();
 * p[2]= new Audio();
 * 
 * ��ó�� ����Ÿ���� �������� �迭�� ����ϸ�, ������ ������ ���� ���� �ٸ� ������ ��ü��
 * �迭�� ��� �ٷ� �� �ִ�. �Ǵ� ��� �ٷ�� ���� ��ü���� ��Ӱ��踦 ������ ���� �����
 * �������� Ŭ���� Ÿ���� �������� �迭�� �����ؼ� ��ü���� �����ϸ� �ȴ�. *  
 */

class Product2 {
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product2() {} 		// �⺻ ������

	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv3 extends Product2 {
	Tv3() {  super(100);	 }

	public String toString() { return "Tv"; }
}

class Computer3 extends Product2 {
	Computer3() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio3 extends Product2 {
	Audio3() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer2 {			  // ��, ������ ��� ���
	int money = 1000;	  // �����ݾ�
	int bonusPoint = 0; // ���ʽ�����
	Product2[] cart = new Product2[10];   // ������ ��ǰ�� �����ϱ� ���� �迭
	int i =0;			  // Product�迭�� ���� ī����

	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}

		money -= p.price;             // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;   // ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		cart[i++] = p;                // ��ǰ�� Product[] cart�� �����Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}

	void summary() {	              // ������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�.
		int sum = 0;                 // ������ ��ǰ�� �����հ�
		String itemList ="";         // ������ ��ǰ���

		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

public class Ex7_9 {
	public static void main(String args[]) {
		Buyer2 b = new Buyer2();

		b.buy(new Tv3());
		b.buy(new Computer3());
		b.buy(new Audio3());
		b.summary();
	}
}