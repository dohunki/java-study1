// -�⺻�� �Ű�����
// �޼��带 ȣ���� �� �Ű������� ������ ���� �޼����� �Ű������� �����ؼ� �Ѱ��ش�.
// �Ű������� Ÿ���� �⺻���̸� �⺻�� ���� ����ǰ�, �������̸� �ν��Ͻ��� �ּҰ� ����ȴ�.
// �⺻���� ������ ���� �б⸸ �� �� �ְ�, �������� �а� ���浵 �� �� �ִ�.
class Data { int x; } 

public class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		// change�޼��尡 ȣ��Ǹ鼭 'd.x'�� change�޼����� �Ű����� x�� �����
		// change�޼��忡�� x�� ���� 1000���� ����
		// change�޼��尡 ����Ǹ鼭 �Ű����� x�� ���ÿ��� ���ŵ�
		
		// d.x�� ���� ����� ���� �ƴ϶�, change�޼����� �Ű����� x�� ���� ����� ���̴�.
		// ������ �ƴ� ���纻�� ����� ���̶� �������� �ƹ��� ��ȭ�� ����.
	}

	static void change(int x) {  // �⺻�� �Ű�����
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
