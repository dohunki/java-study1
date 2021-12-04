package static_InnerClass_4;

public class App {

	public static void main(String[] args) {
		Person p1= new Person();
		
		p1.print();
		// 외부로 내부 클래스를 불러올때
		// 1.내부 클래스 (외부클래스의 객체가 필요함)
		Person.Head head= p1.new Head();
		head.print();
		// 2.스태틱 내부 클래스 (외부클래스 이름으로 객체를 생성)
		Person.Body body= new Person.Body();
		body.print();
	}

}
