package application;

import java.util.Scanner; // java.util 패키지 안에 Scanner 클래스를 불러와서 사용가능

public class UserInput {

	public static void main(String[] args) {
		// 입력을 받는 클래스
		Scanner scanner= new Scanner(System.in);  //스캐너 객체를 선언
		
		System.out.println("온도를 입력해 주세요 : ");
		int x= scanner.nextInt(); // 스캐너로 정수 입력을 받아 x에 입력, 
		// 실행시 입력을 대기하고 엔터키가 입력되면 종료
		System.out.println(x);
		
		double c= scanner.nextDouble();
		double f= (c* 9/5)+ 32;
		
		System.out.println("섭씨" + c + "는 화씨" + f +"이다.");
		

	}

}
