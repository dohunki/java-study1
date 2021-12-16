package multi_Thread_3;

public class App {

	private int value = 0;

	private synchronized void increment() { //이 메소드는 한번에 하나의 쓰레드만 접근
		value++;
	}

	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 10000; i++) {
				increment();
			}
		};

		Thread t1 = new Thread(runnable); //새 스레드 t1 생성
		Thread t2 = new Thread(runnable); //새 스레드 t2 생성
		Thread t3 = new Thread(runnable); //새 스레드 t3 생성

		t1.start(); //t1 실행
		t2.start(); //t2 실행
		t3.start(); //t3 실행

		//System.out.println("Value: " + value); //메인 쓰레드 실행

		t1.join(); //t1을 실행할때까지 대기
		t2.join(); //t2을 실행할때까지 대기
		t3.join(); //t3을 실행할때까지 대기

		System.out.println("Value: " + value); //t1,t2가 끝난 다음에 출력
	}

	public static void main(String[] args) throws InterruptedException {
		// 멀티 쓰레드
		new App().run(); //앱 객체를 만들고 run() 메소드 실행
	}

}