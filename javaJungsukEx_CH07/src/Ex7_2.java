/*
 * �������� super
 * -��ü �ڽ��� ����Ű�� ��������
 * -�ν��Ͻ��޼���(������)������ ����, static�޼��� ������ ���Ұ�
 * -������ ����� �ڽ��� ����� ������ �� ���
 * -�ڼ�Ŭ�������� ����Ŭ�����κ��� ��ӹ��� ����� �����ϴµ� ���Ǵ� ���������̴�.
 * -��ӹ��� ����� �ڽ��� ����� �̸��� ���� �� super�� �ٿ��� ����
 */
public class Ex7_2 {

	public static void main(String[] args) {
		ChildA c= new ChildA();
		c.method();
	}
}

class ParentA {int x= 10;} // super.x

class ChildA extends ParentA {
	int x= 20; // this.x : this�� lv�� iv�� ������ ����
	
	void method() {
		System.out.println("x= "+ x); // ����� ��
		System.out.println("this.x= "+ this.x);
		System.out.println("super.x= "+ super.x);
		
	}
}