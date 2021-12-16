package multi_Thread_3;

public class App {

	private int value = 0;

	private synchronized void increment() { //�� �޼ҵ�� �ѹ��� �ϳ��� �����常 ����
		value++;
	}

	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 10000; i++) {
				increment();
			}
		};

		Thread t1 = new Thread(runnable); //�� ������ t1 ����
		Thread t2 = new Thread(runnable); //�� ������ t2 ����
		Thread t3 = new Thread(runnable); //�� ������ t3 ����

		t1.start(); //t1 ����
		t2.start(); //t2 ����
		t3.start(); //t3 ����

		//System.out.println("Value: " + value); //���� ������ ����

		t1.join(); //t1�� �����Ҷ����� ���
		t2.join(); //t2�� �����Ҷ����� ���
		t3.join(); //t3�� �����Ҷ����� ���

		System.out.println("Value: " + value); //t1,t2�� ���� ������ ���
	}

	public static void main(String[] args) throws InterruptedException {
		// ��Ƽ ������
		new App().run(); //�� ��ü�� ����� run() �޼ҵ� ����
	}

}