package abStract_1;

public class App {

	public static void main(String[] args) {
		// 추상클래스
//		GameObject objs= new GameObject(); // 추상클래스는 객체를 만들수 없다.
		GameObject[] objs= {new Player(), new Monster()};
		
		for(GameObject ob : objs) {
			System.out.println(ob);
			ob.describe(); // 구현된 추상 메서드
		}

	}

}
