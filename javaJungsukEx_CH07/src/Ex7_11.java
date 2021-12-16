/*
 * 디폴트 메서드와 static 메서드(JDK 1.8부터 추가)
 * -static 메서드는 인스턴스와 관계없는 독립적인 메서드라 인터페이스에 추가 가능하다.
 * -조상클래스에 새로운 메서드를 추가하는 것은 별 일이 아니지만, 인터페이스의 경우에는 어려운 작업이다.
 *  인터페이스에 메서드를 추가한다는 것은 추상메서드를 추가한다는 것이고, 이 인터페이스를 구현한 기존의 
 *  모든 클래스들이 새로 추가된 메서드를 구현해야하기 때문이다.
 * 디폴트 메서드(default method)
 * -인스턴스 메서드(인터페이스 원칙위반이지만 예외적용)
 * -추상메서드의 기본적인 구현을 제공하는 메서드로, 추상메서드가 아니기 때문에 디폴트 메서드가 새로 추가
 *  되어도 해당 인터페이스를 구현한 클래스를 변경하지 않아도 된다.
 * -앞에 키워드 default를 붙이며, 추상메서드와 달리 일반메서드처럼 몸통{}이 있어야 한다.
 *  접근제어자는 public이며 생략가능하다.
 * -디폴트메서드가 기존의 메서드와 이름이 중복되어 충돌이 발생하는 경우 다음과 같이 해결한다.
 *  1.여러 인터페이스의 디폴트 메서드 간의 충돌
 *   -인터페이스를 구현한 클래스에서 디폴트메서드를 오버라이딩해야 한다.
 *  2.디폴트메서드와 조상클래스의 메서드 간의 충돌
 *   -조상클래스(우선권을 갖는다)의 메서드가 상속되고, 디폴트메서드는 무시된다.
 *  즉, 필요한 쪽의 메서드와 같은 내용으로 오버라이딩 하면 된다.
 */
public class Ex7_11 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method1();
		c.method2();
		
//		System.out.println();
//		MyInterface f= new Child3();
//		f.method1();
		
		System.out.println();
		MyInterface.staticMethod(); 
		MyInterface2.staticMethod();
	}
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
	public void method1() {	
		System.out.println("method1() in Child3"); // 오버라이딩
	}			
}

class Parent3 {
	public void method2() {	
		System.out.println("method2() in Parent3");
	}
}

interface MyInterface {
	default void method1() { 
		System.out.println("method1() in MyInterface");
	}

	default void method2() { 
		System.out.println("method2() in MyInterface");
	}

	static void staticMethod() { 
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() { 
		System.out.println("method1() in MyInterface2");
	}

	static void staticMethod() { 
		System.out.println("staticMethod() in MyInterface2");
	}
}