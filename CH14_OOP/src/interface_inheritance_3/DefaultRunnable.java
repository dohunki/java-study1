package interface_inheritance_3;

// �������̽����� ��Ӱ���
public interface DefaultRunnable extends Runnable{
//	void displayDetails()  // (��)
	default void displayDetails() { // default�� ������ �޼��� ��������
		System.out.println("ǥ���� ������ ����");
	};

}
