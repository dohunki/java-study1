package super_Constructor4;

public class Employee extends Person {
//	public Employee() { // ����2
//		super(); // �θ�Ŭ������ ������(�ڵ����� �����ȴ�.) ����1
//		System.out.println("Employee ������"); // ����2
//	}
	
	public Employee() {
		super("�͸�"); 
		System.out.println("Employee ������"); 
	}
	
	public Employee(String name) {
		super(name); 
		System.out.println("Employee ������"); 
	}

}
