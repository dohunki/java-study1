

class MyPoint {
	int x;
	int y;
}

//class Circle extends MyPoint { // ��� 
//	int r;
//}

class Circle { // ����  
	// ������ �ϸ� class Circle extends Object�� �ڵ� ����ȴ�.
	// ��� Ŭ������ ObjectŬ������ ���ǵ� 11���� �޼��带 ��ӹ޴´�.
	MyPoint p= new MyPoint(); // ���������� �ʱ�ȭ
	int r;
}

public class Ex7_inheritance {
	public static void main(String[] args) {
		Circle c= new Circle();
//		System.out.println(c.toString()); 
		System.out.println(c); // println�޼��� ��ɿ� ���ؼ� toString�� ��� ������ ����� ���´�.
		//  Object���� toString�� ��ӹ޾ұ� ������ toString�޼��带 �������� �ʰ� ��밡���ϴ�.
		
//		c.x= 1;	// ���
//		c.y= 2; // ���
		c.p.x= 1; // ����
		c.p.y= 2; // ����
		c.r= 3;
//		System.out.println("c.x="+ c.x); // ���
//		System.out.println("c.y="+ c.y); // ���
		System.out.println("c.p.x="+ c.p.x); // ����
		System.out.println("c.p.y="+ c.p.y); // ����
		System.out.println("c.r="+ c.r);
	}
	

}
