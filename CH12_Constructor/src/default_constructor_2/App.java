package default_constructor_2;

public class App {
	App(){} // �⺻������ (�����ڰ� �⺻������ ���� ���� ��������)

	public static void main(String[] args) { // main �޼���
		// ����Ʈ ������
		
		Person p1= new Person();
		System.out.println(p1.toString());
		Person p2= new Person("ȫ�浿");
		System.out.println(p2); // toString() ��������
		Person p3= new Person("������", 27);
		System.out.println(p3); // toString() ��������

	}

}
