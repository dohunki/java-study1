package JavaJungsukCh_6;
class Data2 { int x; }

public class Ex6_7 {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
		// change�޼��尡 ȣ��Ǹ鼭 �������� d�� ��(�ּ�)�� �Ű����� d�� �����
		// change�޼��忡�� �Ű����� d�� x�� ���� 1000���� ����
		// change�޼��尡 ����Ǹ鼭 �Ű����� d�� ���ÿ��� ���ŵ�
		
		// change�޼��带 ȣ���� �Ŀ� d.x�� ���� ����Ǿ���.
		// change�޼����� �Ű������� �������̶� '���� ����� �ּ�'�� change�޼��忡�� �Ѱ��־���.
		// x�� ���� �ƴ� ���� d�� �ּҰ� �Ű����� d�� ����Ǿ���. 
		// �׷��� �Ű����� d�� x�� ���� �д� �Ͱ� �����ϴ� ���� ��� �����ϴ�. 
	}

	static void change(Data2 d) { // ������ �Ű�����
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
