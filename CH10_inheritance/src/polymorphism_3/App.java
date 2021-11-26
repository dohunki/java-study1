package polymorphism_3;

public class App {

	public static void main(String[] args) {
		// ������ : ����Ŭ���� Ÿ���� ���������� �ڼ�Ŭ������ �ν��Ͻ��� ������ �� �ִ�.
		// ���� ��Ӱ��迡 �ִ� Ŭ���� ���̿��� ���������� ����ȯ�� �����ϴ�.
//		Cat cat1= new Cat();		
//		Cat cat2= new HouseCat();		
//		Cat cat3= new RoadCat();
//
//		Cat[] cats= {cat1, cat2, cat3}; // Ŭ����Ÿ���� �迭�̹Ƿ� ��ü�� ����.
//		
//		for(Cat c : cats) { // cats�迭�� ������ ��ü�� c�� �����Ͽ� �ݺ�
//			c.vocal();
//			c.hunt();
//		}
		
		Cat[] cats= {new HouseCat(), new RoadCat(), new Tiger()};
		// cats[0]== new HouseCat();
		// cats[1]== new RoadCat();
		// cats[2]== new TigerCat();
		
//		String[] s= {new String("���ڿ�1"), new String("���ڿ�2"), new String("���ڿ�3")};	
		
		// for �ݺ���
		for (int i= 0; i< cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		System.out.println("--------------------------");
		// for each �ݺ���
		for (Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		
		System.out.println("--------------------------");
		// ĳ���� ����ȯ (�⺻ ������ Ÿ��)
		int a= (int)1.2345;
		System.out.println(a);
		
		// ������ Ÿ�� (��� ������ ��)
		Cat cat1= new HouseCat(); // ��ĳ����
		HouseCat cat2= (HouseCat)cat1; // �ٿ�ĳ����
	}
}

