package timer_example2_6;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
	@Override
	public void run() { // Runnable의 추상메서드를 구현(완성)한다.
		// 할 일의 코드를 찍는다.
		System.out.println("헬로우~");
	}
	
}
public class App {

	public static void main(String[] args) {
		// 타이머 2
		ScheduledExecutorService executor= Executors.newScheduledThreadPool(1);	
		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS); // 1초에 한 번씩 반복
		

	}

}
