package static_InnerClass_4;

public class App {

	public static void main(String[] args) {
		Person p1= new Person();
		
		p1.print();
		// �ܺη� ���� Ŭ������ �ҷ��ö�
		// 1.���� Ŭ���� (�ܺ�Ŭ������ ��ü�� �ʿ���)
		Person.Head head= p1.new Head();
		head.print();
		// 2.����ƽ ���� Ŭ���� (�ܺ�Ŭ���� �̸����� ��ü�� ����)
		Person.Body body= new Person.Body();
		body.print();
	}

}
