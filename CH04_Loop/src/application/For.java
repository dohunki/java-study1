package application;

public class For {

	public static void main(String[] args) {
		// for 반복문
		// for(초기값; 조건; 증감) {명령문;}
		for (int i=0; i < 10; i++) {
			System.out.println("i= "+ i);
		}
		
//		for (int ; ; ) { // 무한반복
//			System.out.println("Hello");
//		}
		
		// for 반복문을 사용하여 1에서 100까지 합을 출력하여라.
		int sum= 0;
		for(int j=1; j<=100; j++) {
			sum+= j;					
		}
		System.out.println("sum= "+ sum);

	}

}
