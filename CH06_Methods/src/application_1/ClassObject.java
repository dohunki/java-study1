package application_1;

// �ϳ��� ���Ͽ� ���� ���� Ŭ������ ���� �� �ִ�.
class Person {
	String name;
}
// public class �� �� ���Ͽ� �ϳ��� ��������, �ҽ������̸��� ���ƾ� �Ѵ�.
public class ClassObject {
	public static void main(String[] args) {
		// Ŭ������ ��ü
		// Ŭ������ ���赵�̰� ���� ��밡���� ��ü�� ����(��ü�� ���� �޸𸮿� ������ = �ν��Ͻ�)
		Person p1= null; // Person Ŭ���� Ÿ��, �������� p1 ����, �ʱⰪ ����
		System.out.println(p1);
		p1= new Person(); // Person�� ���� ��ü�� �����Ͽ� �� �ּڰ��� p1�� ����
		System.out.println(p1);
		
		Person p2= new Person();
		Person p3= new Person();
		
		p1.name= "���";
		p2.name= "�浿";
		p3.name= "���̾�";

		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		System.out.println(p3);
	}

}
