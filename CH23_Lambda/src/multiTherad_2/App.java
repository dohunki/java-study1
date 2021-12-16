package multiTherad_2;

public class App {
	private int value = 0;

	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 1000; i++) {
				value ++; //value�� 1�� ����
			}
		};

		Thread t1 = new Thread(runnable); //�� ������ t1 ����
		Thread t2 = new Thread(runnable); //�� ������ t2 ����

		t1.start(); //t1 ����
		t2.start(); //t2 ����

		//System.out.println("Value: " + value); //���� ������ ����

		t1.join(); //���ξ����尡 t1�� �����Ҷ����� ���
		t2.join(); //���ξ����尡 t2�� �����Ҷ����� ���

		System.out.println("Value: " + value); //t1,t2�� ���� ������ ���
	}

	public static void main(String[] args) throws InterruptedException {
		// ��Ƽ ������
		new App().run(); //�� ��ü�� ����� run() �޼ҵ� ����
	}

}