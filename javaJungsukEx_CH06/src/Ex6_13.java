/*
 * �����ڿ��� �ٸ� ������ ȣ���ϱ�: this()
 * -�������� �̸����� Ŭ���� �̸���� this�� ����Ѵ�.
 * -�� �����ڿ��� �ٸ� �����ڸ� ȣ���� ���� �ݵ�� ù �ٿ����� ȣ���� �����ϴ�.
 * ���� Ŭ���� ���� �����ڵ��� ���� ���谡 ���� ��찡 ���� ���� ȣ���� �� �ֵ��� ���������� �������ָ�
 * ������ �ʿ��� ��� ���� ���� �ڵ常�� �����ϴ� �������� �ִ�.
 */
class Car2 {
	String color;		// ����
	String gearType;	// ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door;			// ���� ����
	// �ڵ��� �ߺ��� �����Ϸ��� ���� ȣ���� �� �ֵ��� �ڵ��Ѵ�.
	Car2() {
		this("white", "auto", 4);
	// �ٸ� ������ Car2(String color, String gearType, int door)�� ȣ��
	}

	Car2(String color) {
		this(color, "auto", 4);
	// �ٸ� ������ Car2(String color, String gearType, int door)�� ȣ��
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}
public class Ex6_13 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();	
		Car2 c2 = new Car2("blue");
		Car2 c3 = new Car2("green", "semiauto", 5);

		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
		System.out.println("c3�� color=" + c3.color + ", gearType=" + c3.gearType+ ", door="+c3.door);
	}
}

