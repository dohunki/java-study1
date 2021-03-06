package application;

import java.util.Scanner; // java.util 패키지 안에 Scanner 클래스를 불러와서 사용가능

public class UserInput {

	public static void main(String[] args) {
		// 입력을 받는 클래스
		Scanner scanner= new Scanner(System.in);  //스캐너 객체를 선언
		
		System.out.print("온도를 입력해 주세요 : ");
//		String input= scanner.nextLine();
//		int x= Integer.parseInt(input); 
		// 위의 두 줄은 아래 한 줄과 같다.
		int x= scanner.nextInt(); // 스캐너로 정수 입력을 받아 x에 입력, 
		// 실행시 입력을 대기하고 엔터키가 입력되면 종료
		System.out.println(x);
		
		System.out.print("화씨로 변환할 온도를 입력해 주세요 : ");
		double c= scanner.nextDouble();
		double f= (c* 9/5)+ 32;
		
		System.out.printf("섭씨 %.1f는 화씨 %.1f 이다.%n", c, f);
		
		System.out.print("화씨로 변환할 온도를 입력해 주세요 : ");
		float C= scanner.nextFloat();
		float F= (C* 9/5)+ 32;
		
		System.out.printf("섭씨 %.2f는 화씨 %.3f 이다.%n", C, F);
		

	}

}
