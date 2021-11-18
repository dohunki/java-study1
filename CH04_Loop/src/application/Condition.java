package application;

public class Condition {

	public static void main(String[] args) {
		// 조건문
		int counter= 0;
		
//		while(true) { // true일 때 while문이 반복된다.
//			System.out.printf("카운터 : %d \n", counter);
//			counter= counter+ 1;
//		}  // 1씩 증가하면서 무한반복
		
		while(counter <= 10) {
			System.out.printf("카운터 : %d \n", counter);
			counter= counter+ 1;
		}

	}

}
