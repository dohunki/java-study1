package local_InnerClass_2;

public class App {
	private String name; // �ν��Ͻ� ����
	
	public App() {
		name= "�����ں���";
	}

	public static void main(String[] args) {
//		System.out.println(name); // ��ü �������� ����� �� ����.
		App app= new App();
//		app.name= "���";
		app.run();
	}
	
	private void run() {
		// Ŭ���� ���� �޼��忡 Ŭ����
		class Printer{
			public void print() {
				System.out.println(name); // ����Ŭ������ ����Ŭ������ ���� ��밡��
			}
		}
//		Printer p= new Printer();
//		p.print();
		new Printer().print();
	}

}
