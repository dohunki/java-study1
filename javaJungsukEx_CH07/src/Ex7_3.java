/*
 * �������� super
 * -��ü �ڽ��� ����Ű�� ��������
 * -�ν��Ͻ��޼���(������)������ ����, static�޼��� ������ ���Ұ�
 * -������ ����� �ڽ��� ����� ������ �� ���
 * -�ڼ�Ŭ�������� ����Ŭ�����κ��� ��ӹ��� ����� �����ϴµ� ���Ǵ� ���������̴�.
 * -��ӹ��� ����� �ڽ��� ����� �̸��� ���� �� super�� �ٿ��� ����
 */
public class Ex7_3 {

	public static void main(String[] args) {
		ChildB c= new ChildB();
		c.method();
	}
}

class ParentB {int x= 10;} // super.x �� this.x �� �� ����

class ChildB extends ParentB {
	void method() {
		System.out.println("x= "+ x); // ����� ��
		System.out.println("this.x= "+ this.x);
		System.out.println("super.x= "+ super.x);
		
	}
}