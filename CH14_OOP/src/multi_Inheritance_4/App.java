package multi_Inheritance_4;

interface Speaker {
	void speak(); // �߻�޼���
}

interface Greeter {
	void greet();
}

public class App {

	public static void main(String[] args) {
		// �������̽��� ���� ������ ����
		Person p1= new Person();
		p1.greet();
		p1.speak();
		
		Speaker p2= new Person(); // Person�� ������ �������̽� Speaker�� ����
//		p2.greet(); // Speaker �������̽��� �߻�޼��常 ��밡��
		p2.speak(); 
		
		Greeter p3= new Person();
		p3.greet();
//		p3.speak(); // Greeter �������̽��� �߻�޼��常 ��밡��
	}
}
