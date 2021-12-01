

class MyPoint {
	int x;
	int y;
}

//class Circle extends MyPoint { // 상속 
//	int r;
//}

class Circle { // 포함  
	// 컴파일 하면 class Circle extends Object가 자동 실행된다.
	// 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다.
	MyPoint p= new MyPoint(); // 참조변수의 초기화
	int r;
}

public class Ex7_inheritance {
	public static void main(String[] args) {
		Circle c= new Circle();
//		System.out.println(c.toString()); 
		System.out.println(c); // println메서드 기능에 의해서 toString이 없어도 동일한 결과가 나온다.
		//  Object에서 toString을 상속받았기 때문에 toString메서드를 생성하지 않고도 사용가능하다.
		
//		c.x= 1;	// 상속
//		c.y= 2; // 상속
		c.p.x= 1; // 포함
		c.p.y= 2; // 포함
		c.r= 3;
//		System.out.println("c.x="+ c.x); // 상속
//		System.out.println("c.y="+ c.y); // 상속
		System.out.println("c.p.x="+ c.p.x); // 포함
		System.out.println("c.p.y="+ c.p.y); // 포함
		System.out.println("c.r="+ c.r);
	}
	

}
