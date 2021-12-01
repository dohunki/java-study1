package super_Constructor4;

public class Employee extends Person {
//	public Employee() { // 실행2
//		super(); // 부모클래스의 생성자(자동으로 생성된다.) 실행1
//		System.out.println("Employee 생성자"); // 실행2
//	}
	
	public Employee() {
		super("익명"); 
		System.out.println("Employee 생성자"); 
	}
	
	public Employee(String name) {
		super(name); 
		System.out.println("Employee 생성자"); 
	}

}
