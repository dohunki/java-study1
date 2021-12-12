abstract class Player { // 추상 클래스(미완성 클래스, 미완성 설계도)
	abstract void play(int pos); // 추상 메서드(미완성 메서드)
	abstract void stop(); // 추상 메서드(선언부만 있고 구현부{}가 없는 메서드
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player {
	void play(int pos) {System.out.println(pos+ "위치부터 play합니다.");}
	void stop() {System.out.println("재생을 멈춤니다.");}

}

public class PlayerTest {
	
	public static void main(String[] args) {
//		player p= new Player(); // 에러. 추상 클래스는 상속을 통해 완성해야 객체 생성가능
//		AudioPlayer ap= new AudioPlayer(); // 다형성으로 아래의 실행과 결과가 같다.
		Player ap= new AudioPlayer(); // 다형성, Player의 메서드가 추상메서드이지만 실제 호출되어 구현되는 것은 AudioPlayer 이다.
		ap.play(100);
		ap.stop();
	}

}
