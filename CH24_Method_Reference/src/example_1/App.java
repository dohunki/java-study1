package example_1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	public static void greet() { //����ƽ �޼ҵ�� ��ü �������� ��밡��
		System.out.println("��ο�!");
	}

	public static void main(String[] args) {
		// �޼ҵ� ���۷���(����ƽ �޼ҵ带 ����� ���)
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
									//Ŭ������::�޼ҵ��
		service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS);

	}

}