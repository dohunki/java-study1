package application;

public class Printf {

	public static void main(String[] args) {
		// Printf 출력
		int age= 25;
		String addr = "수영구";
		double pi= 3.14;
				
		System.out.printf("내 나이는 %d살 입니다.\n", age);
		System.out.printf("내 나이는 %d살이고 %s에 살고 있습니다.\n", age, addr);
		System.out.printf("파이의 값은 : %f%n", pi);  // printf도 줄띄움이 없음
		System.out.printf("파이의 값은 : %.2f", pi);  // %.2f : 소숫점 2자리까지
		

	}

}
