package interfaces_2;

public class App {

	public static void main(String[] args) {
		// �������̽�
		// Describable ds= new Describable(); ��ü�� ���� �� ����.
		Describable[] objs= {new Person(), new Computer()};
		
		for(Describable ob : objs) {
			System.out.println(ob.getDescription());
		}

	}

}
