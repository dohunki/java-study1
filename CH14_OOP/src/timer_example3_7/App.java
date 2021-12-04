package timer_example3_7;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task2 implements Runnable {
	@Override
	public void run() { // Runnable�� �߻�޼��带 ����(�ϼ�)�Ѵ�.
		// �� ���� �ڵ带 ��´�.
		System.out.println("Ÿ�̸�2 ��ο�~");
	}
	
}

class Task1 extends TimerTask{
	@Override
	public void run() {
		System.out.println("Ÿ�̸�1 ��ο�!");
	}
}
public class App {

	public static void main(String[] args) {
		// Ÿ�̸� 1
		Timer timer= new Timer();
		timer.scheduleAtFixedRate(new Task1(), 0L, 1000L);
		// Ÿ�̸� 2
		ScheduledExecutorService executor= Executors.newScheduledThreadPool(1);	
		executor.scheduleAtFixedRate(new Task2(), 0, 1, TimeUnit.SECONDS); // 1�ʿ� �� ���� �ݺ�
		

	}

}
