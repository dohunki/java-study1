package JavaJungsukCh_7;

	// (��)�� ǥ���� �Ͱ� (��)�� ǥ���� ���� ����.
class MyPoint4 extends Object {
	int x;
	int y;
	
	MyPoint4(int x, int y) {  // (��)
		this.x= x; // (��)
		this.y= y; // (��)
	}
	
	// ObjectŬ������ toString()�� �������̵�
	public String toString() {
		return "x:" +x +", y:"+ y;
	}
}

public class Ex7_OverrideTest2 {
	public static void main(String[] args) {
//		MyPoint4 p= new MyPoint4();  // (��)
//		p.x= 3; // (��)
//		p.y= 5; // (��)
//		System.out.println("p.x="+ p.x); // (��)
//		System.out.println("p.y="+ p.y); // (��)

		MyPoint4 p= new MyPoint4(3, 5); //(��)
		System.out.println(p); // (��)  
	}

}
