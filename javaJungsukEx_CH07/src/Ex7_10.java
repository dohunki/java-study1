/*
 * 추상클래스의 작성
 * -여러 클래스에 공통적으로 사용될 수 있는 클래스를 바로 작성하기도 하고, 기존의 클래스의 공통적인 
 *  부분을 뽑아서 추상클래스를 만들어 상속하기도 한다.
 * -상속이 자손클래스를 만드는데 조상 클래스를 사용하는 것이라면, 추상화는 기존의 클래스의 공통부분을 
 *  뽑아내서 조상클래스를 만드는 것이라 할 수 있다.
 * -상속계층도를 따라 내려갈수록 클래스는 점점 기능이 추가되어 구체화의 정도가 심해지며, 상속계층도를
 *  따라 올라갈수록 클래스는 추상화의 정도가 심해진다고 할 수 있다.
 */

/*
 * class Marine { // 보병
 * 		int x, y;	// 현재 위치
 * 		void move(int x, int y) { // 지정된 위치로 이동 }
 * 		void stop() { // 현재 위치에 정지 }
 * 		void stimPack()	{ // 스팀팩을 사용한다. }
 * }
 * 
 * class Tank { // 탱크
 * 		int x, y;	// 현재 위치
 * 		void move(int x, int y) { // 지정된 위치로 이동 }
 * 		void stop() { // 현재 위치에 정지 }
 * 		void changeMode()	{ // 공격모드를 변환한다. }
 * }
 * 
 * class Dropship { // 수송선
 * 		int x, y;	// 현재 위치
 * 		void move(int x, int y) { // 지정된 위치로 이동 }
 * 		void stop() { // 현재 위치에 정지 }
 * 		void load()	{ // 선택된 대상을 태운다. }
 * 		void unload() { // 선택된 대상을 내린다. }
 * }	
 * 
 * 추상메서드를 이용하여 아래와 같이 간결하게 바꾼다.
 */

public class Ex7_10 {
	public static void main(String[] args) {
		// Unit [] group= new Unit[3]; // 객체배열 : 참조변수 묶은 것
		// group[0]= new Marine();
		// group[1]= new Tank();
		// group[2]= new Dropship();
		Unit[] group = { new Marine(), new Tank(), new Dropship() }; // 생성+초기화

		for (int i = 0; i < group.length; i++)
			group[i].move(100, 200);
		/* -Unit클래스의 추상메서드인 move를 호출하는 것 같아 보이지만 실제로는 이 추상메서드가 구현된
		 *  Marine, Tank, Dropship인스턴스의 메서드가 호출되는 것이다.
		 * -Unit 대신 Object클래스 타입의 배열로도 서로 다른 종류의 인스턴스를 하나의 묶음
		 *   Object[] group = { new Marine(), new Tank(), new Dropship() } 
		 *  으로 다룰 수 있지만, Object클래스에는 move메서드가 정의되어 있지 않기 때문에 move메서드를 
		 *  호출하는 부분 group[i].move(100, 200); 에서 에러가 난다.
		 */ 
	}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y); // 추상메서드라도 move가 있어야 리모컨에 move단추가 생긴다.
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank extends Unit { // 탱크
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship extends Unit { // 수송선
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load()   { /* 선택된 대상을 태운다. */ }
	void unload() { /* 선택된 대상을 내린다. */ }
}
