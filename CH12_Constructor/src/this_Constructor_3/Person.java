package this_Constructor_3;

public class Person {
	
	private String name;
	private int age;
	
	public Person(){ // �⺻ ������
		this("�͸�"); // ���� ���� ������ ������ �����ڸ� ����
	}
	
	public Person(String name) { // �����ڴ� Ŭ���� �̸��� ���� ����Ÿ���� ����
		this(name, 3); 
	}
	
	public Person(String name, int age) { // �����ڴ� Ŭ���� �̸��� ���� ����Ÿ���� ����
		this.name= name;
		this.age= age;
	}
	
	@Override
	public String toString() { // ��ü�� ������ ���
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
