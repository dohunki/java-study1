/*
 * 추상 클래스(abstract class)
 * -추상 클래스는 미완성 설계도에 비유할 수 있다.
 * -클래스가 미완성이라는 것은 미완성 메서드(추상 메서드)를 포함하고 있다는 의미이다.
 * -인스턴스는 생성할 수 없다.
 * -다른 클래스 작성에 도움을 주기 위한 것으로 상속을 통해서 자손클래스에 의해서만 완성될 수 있다.
 * -추상 클래스는 키워드 'abstract'를 붙이기만 하면 된다.
 */

/*
 * 추상 메서드(abstract method)
 * -미완성 메서드, 선언부만 작성하고 구현부(몸통 {})는 작성하지 않은 채로 남겨 둔 메서드
 * -메서드의 내용이 상속받는 클래스에 따라 달라질 수 있기 때문에 조상 클래스는 선언부만 작성하고
 *  (주석을 붙여 어떤 기능을 수행할 목적으로 작성되었는지 알려 주고), 실제 내용은 상속받는 클래스
 *  에서 구현하도록 비워 두는 것
 * -추상메서드는 구현부가 없으므로 {} 대신 ; 를 적어준다.
 *  // 주석을 통해 기능과 작성 목적을 설명 //
 * 		abstract 리턴타입 메서드이름();
 * -꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우
 *  추상클래스로부터 상속받은 자손클래스는 오버라이딩을 통해 조상인 추상클래스의 추상메서드를 모두
 *  구현해주어야 한다. 만일 조상으로부터 상속받은 추상메서드 중 하나라도 구현하지 않는다면, 자손
 *  클래스 역시 추상클래스로 지정해 주어야 한다.
 */

abstract class Player1 {	// 추상클래스(미완성클래스)
	abstract void play(int pos);	// 추상메서드
	abstract void stop();			// 추상메서드
}

// 상속을 통해 추상메서드를 완성해야 인스턴스 생성가능
class AudioPlayer1 extends Player1 { // 완전클래스
	void play(int pos) { /* 내용 생략 */ }	 // 추상메서드를 구현(몸통 만들기)
	void stop() { /* 내용 생략 */ }		 // 추상메서드를 구현(몸통 만들기)
}

abstract class AbstractPlayer extends Player1 {
	void play(int pos) { /* 내용 생략 */ }  // 추상메서드를 1개만 구현
	// 보이지는 않지만 abstract void stop(); 가 존재한다.
}

//=================================================
// 추상메서드 호출 가능(호출할 때는 선언부만 호출)
abstract class Player2 { // 추상클래스 객체생성 불가
	boolean pause;		// 일시정지 상태를 저장하기 위한 변수
	int currentPos;		// 현재 play되고 있는 위치를 저장하기 위한 변수
	
	Player2() {			// 추상클래스도 생성자가 있어야 한다.
		pause= false;
		currentPos= 0;
	}
	
	/* 지정된 위치(pos)에서 재생을 시작하는 기능이 수행되도록 작성되어야 한다. */
	abstract void play(int age);	// 추상메서드
	/* 재생을 멈추는 즉시 기능을 수행하도록 작성되어야 한다. */
	abstract void stop();			// 추상메서드
	
	void play() {
		// 메서드는 선언부만 알면 호출가능하므로 추상메서드도 호출 가능!!
		play(currentPos);	// 추상메서드를 사용할 수 있다.
	}
	// 인스턴스 메서드는 객체생성후 호출가능하므로 지금은 호출불가하지만 
	// 아래(2)와 같이 상속을 통해 자손이 {구현부}를 완성하면 호출가능하다. ...(1)
}

class DvdPlayer extends Player2 { // ... (2)
	void play(int pos) { /* 내용 생략 */ }	
	void stop() { /* 내용 생략 */ }
	
}


public class Practise6 {
	public static void main(String[] args) {
		AudioPlayer1 ap= new AudioPlayer1(); // 인스턴스 생성 가능
//		Player1 ap= new Audioplayer1(); 도 가능하다.

		
		/*
		 *  자손객체 생성 ...(2)
		 *  PlayerTest.java와 비교해 볼 것
		 */
		DvdPlayer d= new DvdPlayer();
		d.play();
		d.stop();
	}
}
