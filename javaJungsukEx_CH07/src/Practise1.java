
/*
 * 상속
 * -기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
 * -Child(자손) extends Parent(조상) {}
 * -Parent클래스에 age라는 멤버변수가 추가되면, 자손클래스는 조상의 멤버를 모두 상속받기
 *  때문에, Child클래스는 자동적으로 age라는 멤버변수가 추가된 것과 같다.
 * -조상클래스가 변경되면 자손클래스는 자동적으로 영향을 받지만, 자손클래스가 변경되는 것은
 *  조상클래스에 아무런 영향을 주지 못한다.
 * -자손클래스는 조상클래스의 모든 멤버를 상속받는다. 단, 생성자와 초기화 블럭은 상속되지 않는다. 
 * 
 * 클래스간의 관계 - 포함관계
 * -상속이외에도 클래스를 재사용하는 또다른 방법은 클래스간의 '포함(composite)'관계를 맺어
 *  주는 것이다. 클래스간의 포함관계를 맺어 주는 것은 한 클래스의 멤버변수로 다른 클래스 타입의
 *  참조변수를 선언하는 것을 뜻한다.
 *   
 * -Circle1 보다는 Circle2처럼 단위클래스들을 포함관계로 재사용하면 쉽고 간결하고 클래스를 작성할 수 있다.
 *  또한 작성된 단위 클래스들은 다른 클래스를 작성하는데 재사용될 수 있다.
 * -상속이나 포함이나 저장공간의 수는 같다. 상속은 여러가지 제약이 많으므로 꼭 필요할 때만 사용해야 한다.
 * -'~은 ~이다.(is-a)'라는 문장이 성립하면 상속관계를 맺어 주고 (SportsCar는 Car이다.),
 *  '~은 ~을 가지고 있다.(has-a)'라는 문장이 성립하면 포함관계를 맺어주면 된다. (Deck는 Card를 가지고 있다.)
 */
class Point {
	int x;
	int y;
}

class Circle1 {
	int x;
	int y;
	int r;
}

// 포함관계
class Circle2 {
	Point c= new Point();
	int r;
}

// 상속
class Circle3 extends Point{
	int r;
}

/*
 * (메서드)오버라이딩 : 조상클래스로부터 상속받은 메서드의 내용을 변경하는 것
 * -상속받은 메서드는 그대로 사용하기도 하지만, 자손 클래스 자신에 맞게 변경(오버라이딩)해서 사용한다.
 * -선언부는 변경이 불가하고(선언부 일치), 구현부(내용)만 변경가능하다. 
 */
class Point2D {
	int x;
	int y;
	
	String getLocation() {
		return "x :"+ x+ ", y :"+ y;
	}
}

class Point3D extends Point2D {
	int z;
	
	String getLocation() {
		return "x :"+ x+ ", y :"+ y+ ", z :"+ z;
	}
}

/*
 * 오버라이딩의 조건
 * 1.오버라이딩은 메서드의 내용만을 새로 작성하는 것이므로 메서드의 선언부(메서드 이름, 매개변수, 변환타입)는
 *  조상의 것과 완전히 일치해야 한다. 다만 접근 제어자(access modifier)와 예외(exception)는 
 *  제한된 조건 하에서만 변경할 수 있다.
 * 2.접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경 할 수 없다.
 *  대부분의 경우 같은 범위의 접근제어자를 사용한다.
 * 3.조상클래스의 메서드보다 많은 수의 예외를 선언할 수 없다.
 * 
 * 오버로딩(overloading) : 기존에 없는 이름이 같은 새로운 메서드를 정의하는 것(new)
 * 오버라이딩(overriding) : 상속받은 메서드의 내용을 변경하는 것(change, modify)
 */

class Parent{
	void parentMethod() {}
}

class Child extends Parent {
	void parentMethod() {} // 오버라이딩
	void parentMethod(int i) {} // 오버로딩
	
	void childMethod() {} // 메서드 정의
	void childMethod(int i) {} // 오버로딩
//	void childMethod() {} // 중복정의로 에러
}


public class Practise1 {
	public static void main(String[] args) {
		
	}
}