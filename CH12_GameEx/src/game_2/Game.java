package game_2;

import java.util.Random;
import game_2.objects_3.GameObject;
import game_2.objects_3.Paper;
import game_2.objects_3.Rock;
import game_2.objects_3.Scissors;
public class Game {
		// 사용 할 가위, 바위, 보 객체를 배열로 생성
		GameObject[] objects= {new Scissors(), new Rock(), new Paper()};
		Random random= new Random();
		
		public void run() {
			System.out.println("게임 시작...");
//			for(GameObject ob : objects) {
//				System.out.println(ob.toString()); // 테스트용
			
			int num= random.nextInt(objects.length);
			GameObject ob= objects[num];
			
			// 객체를 프린트 하면 toString메서드가 자동으로 실행된다.
			System.out.println(ob.toString()); // 아래와 같이 생략해도 된다.(override를 했기 때문)
			System.out.println(ob); // 오버라이더를 해서 객체 정보가 출력
			
		}
	}


