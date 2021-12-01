package JavaJungsukCh_7;

	// (가)로 표현한 것과 (나)로 표현한 것은 같다.
class MyPoint4 extends Object {
	int x;
	int y;
	
	MyPoint4(int x, int y) {  // (나)
		this.x= x; // (나)
		this.y= y; // (나)
	}
	
	// Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "x:" +x +", y:"+ y;
	}
}

public class Ex7_OverrideTest2 {
	public static void main(String[] args) {
//		MyPoint4 p= new MyPoint4();  // (가)
//		p.x= 3; // (가)
//		p.y= 5; // (가)
//		System.out.println("p.x="+ p.x); // (가)
//		System.out.println("p.y="+ p.y); // (가)

		MyPoint4 p= new MyPoint4(3, 5); //(나)
		System.out.println(p); // (나)  
	}

}
