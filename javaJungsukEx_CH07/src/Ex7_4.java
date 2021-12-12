/*
 * super() : 조상의 생성자
 * -this()는 같은 클래스의 다른 생성자를 호출하는데 사용되지만, 
 *  super()는 조상의 생성자를 호출하는데 사용된다.
 * -조상의 멤버는 조상의 생성자를 호출해서 초기화
 * -생성자와 초기화 블럭은 상속되지 않는다.
 * -생성자의 첫 줄에는 반드시 생성자를 호출해야 한다.
 *  그렇지 않으면 컴파일러가 생성자의 첫 줄에 super(); 를 자동 삽입한다.
 */
public class Ex7_4 {

	public static void main(String[] args) {
		Point3 p= new Point3(1, 2, 3);
		System.out.println("x="+ p.x+ ",y="+ p.y+ ",z="+ p.z);
	}
}

class Point2 { // class Point2d extends Object로 자동 컴파일 된다.
	int x, y;
	Point2(int x, int y) {
//		super(); 조상의 기본생성자를 자동으로 호출, 즉 super(); 는 Object(); 의 호출과 같다.
		this.x= x;  // iv 초기화
		this.y= y;
	}
}

class Point3 extends Point2 {
	int z;
	
	Point3(int x, int y, int z) {
//		this.x= x;
//		this.y= y;  // 자손의 생성자가 조상의 멤버를 초기화 하고 있다. 
					// 이렇게 표현하면 안 된다. 아래의 한 줄로 표현해야 함
		super(x, y); // 조상클래스의 생성자 Point(int x, int y)를 호출
					// 조상의 멤버는 조상의 생성자를 통해 초기화하도록 작성하는 것이 바람직하다.
		this.z= z; // 자신의 멤버를 초기화
	}
}

