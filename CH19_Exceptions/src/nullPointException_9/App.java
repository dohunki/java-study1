package nullPointException_9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 널포인트 예외는 RuntimeException으로 예외처리 안해도 됨
		
		// 런타임 예외 예
//		System.out.println(5/0);
		
		// 널포인트 예외, 객체가 널값인데 사용할 경우
		// 널포인트 예외는 자주 발생, 에러 행이 많이 나올 수 있으나 차근차근 보면 쉽게 고칠 수 있다.
		Scanner scanner= null; // 객체는 생성 안됨
		scanner.nextInt();

	}

}
