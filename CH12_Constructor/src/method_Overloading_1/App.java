package method_Overloading_1;

public class App {
		App(){} // �⺻������
	public static void main(String[] args) {
		
		// �޼��� �����ε� (�޼���� �̸��� �Ű������� ���� ���ƾ� ���� �޼���)
		Person p= new Person();
			 
		p.greet();
		p.greet("���");
		p.greet(190);
		p.greet("���", 190);
		
		System.out.println("123");
		System.out.println(190);
		System.out.println(190.5);

	}

}
