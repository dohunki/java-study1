package default_constructor_2;

public class Person {
	
	private String name;
	private int age;
	
	public Person(){ // �⺻������ (�����ڰ� 2�� �̻��̹Ƿ� �ݵ�� �����ؾ� �Ѵ�.)
		System.out.println("����Ʈ �����ڷ� ������");
		name= "��";
		age= 0;
	} 
	
	public Person(String name) { // �����ڴ� Ŭ���� �̸��� ���� ����Ÿ���� ����
		System.out.println("�� Person�� ����");
		this.name= name;
		age= 0;
	}
	
	public Person(String name, int age) { // �����ڴ� Ŭ���� �̸��� ���� ����Ÿ���� ����
		System.out.println("�� Person�� ����");
		this.name= name;
		this.age= age;
	}
	
	@Override
	public String toString() { // ��ü�� ������ ���
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
