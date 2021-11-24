package application_1;

// 하나의 파일에 여러 개의 클래스를 만들 수 있다.
class Person {
	String name;
}
// public class 는 한 파일에 하나만 생성가능, 소스파일이름과 같아야 한다.
public class ClassObject {
	public static void main(String[] args) {
		// 클래스와 객체
		// 클래스는 설계도이고 실제 사용가능한 객체를 생성(객체는 실제 메모리에 생성됨 = 인스턴스)
		Person p1= null; // Person 클래스 타입, 참조변수 p1 선언, 초기값 없음
		System.out.println(p1);
		p1= new Person(); // Person의 실제 객체를 생성하여 그 주솟값을 p1에 대입
		System.out.println(p1);
		
		Person p2= new Person();
		Person p3= new Person();
		
		p1.name= "펭수";
		p2.name= "길동";
		p3.name= "라이언";

		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		System.out.println(p3);
	}

}
