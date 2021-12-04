package local_InnerClass2_3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	private String name; // 인스턴스 변수
	
	public App() {
		name= "엘리자베스";
	}

	public static void main(String[] args) {
//		System.out.println(name); // 객체 생성없이 사용할 수 없다.
		App app= new App();
//		app.name= "펭수";
		app.run();
	}
	
	private void run() {
		// 클래스 안의 메서드에 클래스
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
