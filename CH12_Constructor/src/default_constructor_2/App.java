package default_constructor_2;

public class App {
	App(){} // 기본생성자 (생성자가 기본생성자 뿐일 경우는 생략가능)

	public static void main(String[] args) { // main 메서드
		// 디폴트 생성자
		
		Person p1= new Person();
		System.out.println(p1.toString());
		Person p2= new Person("홍길동");
		System.out.println(p2); // toString() 생략가능
		Person p3= new Person("김종서", 27);
		System.out.println(p3); // toString() 생략가능

	}

}
