/*
 * 참조변수 super
 * -객체 자신을 가리키는 참조변수
 * -인스턴스메서드(생성자)내에만 존재, static메서드 내에서 사용불가
 * -조상의 멤버를 자신의 멤버와 구별할 때 사용
 * -자손클래스에서 조상클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수이다.
 * -상속받은 멤버와 자신의 멤버가 이름이 같을 때 super를 붙여서 구별
 */
public class Ex7_2 {

	public static void main(String[] args) {
		ChildA c= new ChildA();
		c.method();
	}
}

class ParentA {int x= 10;} // super.x

class ChildA extends ParentA {
	int x= 20; // this.x : this는 lv와 iv의 구별에 사용됨
	
	void method() {
		System.out.println("x= "+ x); // 가까운 것
		System.out.println("this.x= "+ this.x);
		System.out.println("super.x= "+ super.x);
		
	}
}