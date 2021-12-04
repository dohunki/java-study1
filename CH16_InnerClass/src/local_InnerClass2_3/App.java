package local_InnerClass2_3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	private String name; // �ν��Ͻ� ����
	
	public App() {
		name= "�����ں���";
	}

	public static void main(String[] args) {
//		System.out.println(name); // ��ü �������� ����� �� ����.
		App app= new App();
//		app.name= "���";
		app.run();
	}
	
	private void run() {
		// Ŭ���� ���� �޼��忡 Ŭ����
		class Printer implements Runnable{

			@Override
			public void run() {
				System.out.println(name);				
			}			
		}

		//new Printer().print();
		ScheduledExecutorService service= Executors.newScheduledThreadPool(1);	
		service.scheduleAtFixedRate(new Printer(), 0L, 1L, TimeUnit.SECONDS); 		
	}

}
