package references;

class Person {
	
}

public class App {

	public static void main(String[] args) {
		
		Person p1= new Person(); // Person ��ü ����
		System.out.println(p1);
		
		Person p2= p1;
		
		System.out.println(p2);
		
		test(p2);
	}

	private static void test(Person p) {
		System.out.println(p); // �Ű������� �Էµ� p�� �ּҸ� ���		
	}
	
	
}
