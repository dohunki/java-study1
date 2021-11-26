package game_2;

import java.util.Random;
import game_2.objects_3.GameObject;
import game_2.objects_3.Paper;
import game_2.objects_3.Rock;
import game_2.objects_3.Scissors;
public class Game {
		// ��� �� ����, ����, �� ��ü�� �迭�� ����
		GameObject[] objects= {new Scissors(), new Rock(), new Paper()};
		Random random= new Random();
		
		public void run() {
			System.out.println("���� ����...");
//			for(GameObject ob : objects) {
//				System.out.println(ob.toString()); // �׽�Ʈ��
			
			int num= random.nextInt(objects.length);
			GameObject ob= objects[num];
			
			// ��ü�� ����Ʈ �ϸ� toString�޼��尡 �ڵ����� ����ȴ�.
			System.out.println(ob.toString()); // �Ʒ��� ���� �����ص� �ȴ�.(override�� �߱� ����)
			System.out.println(ob); // �������̴��� �ؼ� ��ü ������ ���
			
		}
	}


