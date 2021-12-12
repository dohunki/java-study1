/*
 * super() : ������ ������
 * -this()�� ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴµ� ��������, 
 *  super()�� ������ �����ڸ� ȣ���ϴµ� ���ȴ�.
 * -������ ����� ������ �����ڸ� ȣ���ؼ� �ʱ�ȭ
 * -�����ڿ� �ʱ�ȭ ���� ��ӵ��� �ʴ´�.
 * -�������� ù �ٿ��� �ݵ�� �����ڸ� ȣ���ؾ� �Ѵ�.
 *  �׷��� ������ �����Ϸ��� �������� ù �ٿ� super(); �� �ڵ� �����Ѵ�.
 */
public class Ex7_4 {

	public static void main(String[] args) {
		Point3 p= new Point3(1, 2, 3);
		System.out.println("x="+ p.x+ ",y="+ p.y+ ",z="+ p.z);
	}
}

class Point2 { // class Point2d extends Object�� �ڵ� ������ �ȴ�.
	int x, y;
	Point2(int x, int y) {
//		super(); ������ �⺻�����ڸ� �ڵ����� ȣ��, �� super(); �� Object(); �� ȣ��� ����.
		this.x= x;  // iv �ʱ�ȭ
		this.y= y;
	}
}

class Point3 extends Point2 {
	int z;
	
	Point3(int x, int y, int z) {
//		this.x= x;
//		this.y= y;  // �ڼ��� �����ڰ� ������ ����� �ʱ�ȭ �ϰ� �ִ�. 
					// �̷��� ǥ���ϸ� �� �ȴ�. �Ʒ��� �� �ٷ� ǥ���ؾ� ��
		super(x, y); // ����Ŭ������ ������ Point(int x, int y)�� ȣ��
					// ������ ����� ������ �����ڸ� ���� �ʱ�ȭ�ϵ��� �ۼ��ϴ� ���� �ٶ����ϴ�.
		this.z= z; // �ڽ��� ����� �ʱ�ȭ
	}
}

