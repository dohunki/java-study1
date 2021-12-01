package method_Overloading_1;

public class App {
		App(){} // 기본생성장
	public static void main(String[] args) {
		
		// 메서드 오버로딩 (메서드는 이름과 매개변수가 전부 같아야 같은 메서드)
		Person p= new Person();
			 
		p.greet();
		p.greet("펭수");
		p.greet(190);
		p.greet("펭수", 190);
		
		System.out.println("123");
		System.out.println(190);
		System.out.println(190.5);

	}

}
