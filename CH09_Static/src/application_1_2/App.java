package application_1_2;

public class App {

	public static void main(String[] args) {
		// ����ƽ ������ Ŭ������.������ ��ü �������� ���
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);

		System.out.println(Cat.count);
		
		Cat cat1= new Cat("��ƿ��", Cat.count);
		System.out.println(Cat.getCount());
		Cat cat2= new Cat("����", Cat.count);
		System.out.println(Cat.getCount());
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		
		Cat cat3= new Cat("�����", Cat.count);
		System.out.println(Cat.getCount());
		System.out.println(cat3.toString());
		
	}

}
