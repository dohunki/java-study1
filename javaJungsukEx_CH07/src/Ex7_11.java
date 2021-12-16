/*
 * ����Ʈ �޼���� static �޼���(JDK 1.8���� �߰�)
 * -static �޼���� �ν��Ͻ��� ������� �������� �޼���� �������̽��� �߰� �����ϴ�.
 * -����Ŭ������ ���ο� �޼��带 �߰��ϴ� ���� �� ���� �ƴ�����, �������̽��� ��쿡�� ����� �۾��̴�.
 *  �������̽��� �޼��带 �߰��Ѵٴ� ���� �߻�޼��带 �߰��Ѵٴ� ���̰�, �� �������̽��� ������ ������ 
 *  ��� Ŭ�������� ���� �߰��� �޼��带 �����ؾ��ϱ� �����̴�.
 * ����Ʈ �޼���(default method)
 * -�ν��Ͻ� �޼���(�������̽� ��Ģ���������� ��������)
 * -�߻�޼����� �⺻���� ������ �����ϴ� �޼����, �߻�޼��尡 �ƴϱ� ������ ����Ʈ �޼��尡 ���� �߰�
 *  �Ǿ �ش� �������̽��� ������ Ŭ������ �������� �ʾƵ� �ȴ�.
 * -�տ� Ű���� default�� ���̸�, �߻�޼���� �޸� �Ϲݸ޼���ó�� ����{}�� �־�� �Ѵ�.
 *  ���������ڴ� public�̸� ���������ϴ�.
 * -����Ʈ�޼��尡 ������ �޼���� �̸��� �ߺ��Ǿ� �浹�� �߻��ϴ� ��� ������ ���� �ذ��Ѵ�.
 *  1.���� �������̽��� ����Ʈ �޼��� ���� �浹
 *   -�������̽��� ������ Ŭ�������� ����Ʈ�޼��带 �������̵��ؾ� �Ѵ�.
 *  2.����Ʈ�޼���� ����Ŭ������ �޼��� ���� �浹
 *   -����Ŭ����(�켱���� ���´�)�� �޼��尡 ��ӵǰ�, ����Ʈ�޼���� ���õȴ�.
 *  ��, �ʿ��� ���� �޼���� ���� �������� �������̵� �ϸ� �ȴ�.
 */
public class Ex7_11 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method1();
		c.method2();
		
//		System.out.println();
//		MyInterface f= new Child3();
//		f.method1();
		
		System.out.println();
		MyInterface.staticMethod(); 
		MyInterface2.staticMethod();
	}
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
	public void method1() {	
		System.out.println("method1() in Child3"); // �������̵�
	}			
}

class Parent3 {
	public void method2() {	
		System.out.println("method2() in Parent3");
	}
}

interface MyInterface {
	default void method1() { 
		System.out.println("method1() in MyInterface");
	}

	default void method2() { 
		System.out.println("method2() in MyInterface");
	}

	static void staticMethod() { 
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() { 
		System.out.println("method1() in MyInterface2");
	}

	static void staticMethod() { 
		System.out.println("staticMethod() in MyInterface2");
	}
}