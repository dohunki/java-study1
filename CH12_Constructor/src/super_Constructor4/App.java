package super_Constructor4;

public class App {

	public static void main(String[] args) {
		// super() 생성자
		Employee e1= new Employee();
		System.out.println(e1); // 실행3
		
		Employee e2= new Employee("김종서");
		System.out.println(e2);
	}

}
