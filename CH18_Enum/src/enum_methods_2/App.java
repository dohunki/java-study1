package enum_methods_2;

public class App {

	public static void main(String[] args) {
		// enum���� ����ϴ� �޼���
		
		// values()
		Fruit[] fruits= Fruit.values(); // value() : enum�� ��� ������� �迭�� ����
		
		for(Fruit f : fruits) {
			System.out.println(f);
		}
		
		System.out.println("----------------------");
		
		for(Fruit f : Fruit.values()) {
			System.out.println(f);
		}		
		System.out.println("----------------------");
		
		// ordinal() : enum�� ����� ����(�ε��� ��ȣ)�� ����
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		
		System.out.println("----------------------");
		
		// valueOf("�����/���ڿ�") : (�����/���ڿ�)�� ���� enum�� ã��
		Fruit f1= Fruit.valueOf("ORANGE");
		System.out.println(f1);
		System.out.println(f1== Fruit.ORANGE);
	}
		
	
}
