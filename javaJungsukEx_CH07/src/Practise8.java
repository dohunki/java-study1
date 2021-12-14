/*
 * 인터페이스의 구현
 * -인터페이스도 추상클래스처럼 그 자체로는 인스턴스를 생성할 수 없으며, 추상클래스가 상속을 통해
 *  추상메서드를 완성하는 것처럼, 인터페이스도 implements를 이용해 자신에 정의된 추상메서드의 
 *  몸통을 만들어주는 클래스를 작성해야 한다.(구현을 통해 추상메서드를 완성)
 *  
 *  class 클래스이름 implements 인터페이스이름 {
 *  	// 인터페이스에 정의된 추상메서드를 모두 구현해야 한다.
 *  }
 */

public class Practise8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y); // 추상메서드라도 move가 있어야 리모컨에 move단추가 생긴다.
	void stop() { /* 현재 위치에 정지 */ }
}

interface Fightable2 {
	void move(int x, int y);
	void attack(Unit2 u);
}

class Fighter1 implements Fightable2 {
	public void move(int x, int y) { /* 내용 생략 */ }
	public void attack(Unit2 u) { /* 내용 생략 */ }	
}

// 만일 구현하는 인터페이스 메서드 중 일부만 구현한다면, abstract를 붙엿 추상클래스로 선언해야 한다.
abstract class Fighter2 implements Fightable2 {
	public void move(int x, int y) { /* 내용 생략 */ }  // 1개만 구현
	// public abstract void attack(Unit u); 가 숨겨져 있다.
}

// 다음과 같이 상속과 구현을 동시에 할 수도 있다.
class Fighter3 extends Unit2 implements Fightable2 {
	public void move(int x, int y) { /* 내용 생략 */ }
	public void attack(Unit2 u) { /* 내용 생략 */ }	
}

// 인터페이스에 상수, static메서드, 디폴트메서드가 JDK1.8부터 추가되었다.


/*
 * 인터페이스를 이용한 다형성
 * 
 */

