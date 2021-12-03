package game_2;

import java.util.Random;
import java.util.Scanner;

import game_2.objects_3.GameObject;
import game_2.objects_3.Paper;
import game_2.objects_3.Rock;
import game_2.objects_3.Scissors;

public class Game {
		// 사용 할 가위, 바위, 보 객체를 배열로 생성
		GameObject[] objects= {new Scissors(), new Rock(), new Paper()};
		Random random= new Random();
		
		//유저의 선택
		Scanner scanner= new Scanner(System.in);
		
		// 비교하는 이중배열 만들기		
		public void run() {
//			for(GameObject ob : objects) {
//				System.out.println(ob.toString()); // 테스트용
			
			// 삼세판 만들기
			System.out.println("삼세판 게임 시작...");
			int wins= 0;
			
			for (int i= 1; i<= 3; i++) { // i는 1부터 3까지 3번 반복
				System.out.println(i+ "번째 게임 시작...");
				
				// 유저의 선택
				System.out.print("가위(0), 바위(1), 보(2) 중 숫자로 선택 : " );
				
//				int num= random.nextInt(objects.length);
//				GameObject ob= objects[num];
				// 비교하기 위해서 위의 것을 코드를 간소화해서 두 개로 만듬			
//				GameObject ob1= objects[random.nextInt(objects.length)];
//				GameObject ob2= objects[random.nextInt(objects.length)];
				
				// 유저의 선택
				GameObject ob1= objects[scanner.nextInt()];
				GameObject ob2= objects[random.nextInt(objects.length)];
				
				// 객체를 프린트 하면 toString메서드가 자동으로 실행된다.
//				System.out.println(ob.toString()); // 아래와 같이 생략해도 된다.(override를 했기 때문)
//				System.out.println(ob); // 오버라이더를 해서 객체 정보가 출력
				
				// 비교하기 위해서 만든 것
//				System.out.println(ob1); // 오버라이더를 해서 객체 정보가 출력
//				System.out.println(ob2); // 오버라이더를 해서 객체 정보가 출력
				
				System.out.println("당신의 선택은 : "+ ob1.getName());
				System.out.println("컴퓨터의 선택은 : "+ ob2.getName());
				
//				int result= ob1.compareTo(ob2);
//				System.out.println(result);
				
				// 유저의 선택
				int result= ob1.compareTo(ob2);
				wins += result; // 삼세판 만들기
				
				if(result > 0) {
					System.out.println("당신의 승리! 😊😊");
				} else if(result < 0) {
					System.out.println("당신의 패배! 😢😢");
				} else {
					System.out.println("비겼습니다! 🤞🤞");
				}
				
			}
			
			// 3번 가위바위보 끝난 후
			// 총점 wins로 전체 결과를 출력
			System.out.println();
			System.out.println("삼세판 결과는 : ");
			
			if(wins > 0) {
				System.out.println("당신의 승리! 😊😊");
			} else if(wins < 0) {
				System.out.println("당신의 패배! 😢😢");
			} else {
				System.out.println("비겼습니다! 🤞🤞");
			}
				
		}
	}


