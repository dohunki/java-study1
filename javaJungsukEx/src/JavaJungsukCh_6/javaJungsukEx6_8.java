package JavaJungsukCh_6;
// �Ű������Ӹ� �ƴ϶� ��ȯŸ�Ե� ������(��ü�� �ּ�)�� �� �� �ִ�.
class Data3 {int x; } //  �ּ� 0x100 �� x�� ����Ʈ�� �ִ�.

public class javaJungsukEx6_8 {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;   // 1�ܰ�. d�� �ּ� 0x100�� �������� ��ü�� 10�� �����Ѵ�.

		Data3 d2 = copy(d);  // 3�ܰ�. ��ü tmp�� �ּ� 0x200�� d2�� �����Ѵ�.
		System.out.println("d.x ="+d.x); // d.x�� ��ü�ּҰ� 0x100�̰� x���� 10�̴�. 
		System.out.println("d2.x="+d2.x); // d2.x�� ��ü�ּҰ� 0x200�̰� x���� 10�̴�.
	}

	static Data3 copy(Data3 d) { // 2�ܰ�.
		Data3 tmp = new Data3();    // �ּҰ� 0x200�� ���ο� ��ü tmp�� �����Ѵ�.

		tmp.x = d.x;  // �ּҰ� 0x100�� d�� x���� �����Ͽ� �ּҰ� 0x200�� tmp�� �ش�.

		return tmp;   // ������ ��ü�� �ּ� 0x200�� ��ȯ�Ѵ�.(��ȯŸ���� �������̸� ��ü�� �ּҸ� ��ȯ�Ѵ�.)
		// copy�޼���� ���ο� ��ü�� ������ ���� �Ű������� �Ѱܹ��� ��ü�� ����� ���� �����ؼ� ��ȯ�Ѵ�.
		// ��ȯ�ϴ� ���� �ּ��̹Ƿ� ��ȯŸ���� 'Data'�̴�.
	}
}