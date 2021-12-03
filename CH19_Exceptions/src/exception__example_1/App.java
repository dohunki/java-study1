package exception__example_1;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// 자바예외 : 프로그램 실행과정에서 발생하는 비정상적인 상황을 예외(Exception)라고 한다.
		// 프로그램 실행 중에 발생하는 예외를 자연스럽게 잘 처래해 주는 것을 예외처리(Exception handling)라고 한다.
		
		System.out.println("하나");
		Thread.sleep(2000); // 2초 대기 => 예외처리
		System.out.println("둘");

	}

}
