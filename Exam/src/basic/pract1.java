package basic;

import java.util.Scanner;

public class pract1 {

	public static void main(String[] args) {
		// 연습문제1. if ~ else if 문 
//		System.out.println("메뉴");
//		System.out.println("====");
//		System.out.println("");
//		System.out.println("1. 프린트 '헬로우'");
//		System.out.println("2. 프린트 '안녕?'");
//		System.out.println("3. 프로그램 종료");
//		System.out.println("");
//		System.out.print("옵션을 선택 > ");
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("숫자를 입력하세요! ");
		int input= scanner.nextInt();
		scanner.close();
		/*
		if (input== 1) {
			System.out.println("헬로우");	
		} else if (input==2) {
			System.out.println("안녕?");
		} else if (input==3) {
			System.out.println("종료합니다.");
		} else if (input==10000) {
			System.out.println("이스터에그를 발견했습니다.");
		} else {
			System.out.println("잘못된 옵션입니다.");
		} */
		
		// Switch case문으로 수정
		switch(input) {
		case 1: 
			System.out.println("헬로우");
			break; // 항상 케이스 하나 끝에 break 작성
		case 2: // 옵션변수가 케이스 1과 같을 때
			System.out.println("안녕?");
			break;
		case 3: // 옵션변수가 케이스 10과 같을 때
			System.out.println("종료합니다.");
			break;
		case 10000: // 옵션변수가 케이스 10과 같을 때
			System.out.println("이스터에그를 발견했습니다.");
			break;
		default: // else와 같음 위의 케이스에 맞는 것이 없을 때 실행
			System.out.println("잘못된 옵션입니다.");
			break;
		}
	}
}
