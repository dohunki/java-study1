package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
//		// if 조건문 
//		int apple= 10;
//		int banana= 5;
//		
//		if(apple > banana) {
//			System.out.println("사과가 바나나보다 많음");
//		}
//		System.out.println("프로그램 종료.");
//		System.out.println("%n%n");
//		
//		if(apple < banana) {
//			System.out.println("바나나가 사과보다 많음");
//		}
//		System.out.println("프로그램 종료.");
//		System.out.println("%n%n");
//		
		//스캐너
		Scanner scanner= new Scanner(System.in);
		System.out.print("사과의 개수는?");
		int apple= scanner.nextInt();
		System.out.print("바나나의 개수는?");
		int banana= scanner.nextInt();
		scanner.close(); // 스캐너 종료 (더 이상 안쓸때)
		
		if(apple < banana) {
			System.out.println("바나나가 사과보다 많음");
		}
		if(apple > banana) {
			System.out.println("사과가 바나나보다 많음");
		}
		System.out.println("프로그램 종료.");
		

	}

}
