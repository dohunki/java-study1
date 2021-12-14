/*
 * 인터페이스(interface) 
 * -추상메서드의 집합 (프로그래밍 관점)
 * -구현된 것이 전혀없는 설계도, 껍데기(모든 멤버가 public)
 * -추상클래스처럼 추상메서드를 갖지만 추상클래스와 달리 몸통을 갖춘 일반 메서드 또는 멤버변수를 구성원으로
 *  가질 수 없다. 오직 추상메서드와 상수만을 멤버로 가질 수 있다.
 * -추상클래스를 부분적으로만 완성된 '미완성 설계도'라고 한다면, 
 *  인터페이스는 구현된 것은 아무것도 없고 밑그림만 그려져 있는 '기본 설계도'라 할 수 있다.
 * -인터페이스를 작성하는 것은 클래스를 작성하는 것과 같다. 다만 키워드를 class 대신 interface를
 *  사용한다는 것만 다르다. 또한 접근제어자로 public 또는 default만 사용할 수 있다.
 * -인터페이스는 iv를 가질 수 없다.
 *  
 *  interface 인터페이스이름 {
 * 		public static final 타입 상수이름= 값; // 상수
 * 		public abstract 메서드이름(매개변수목록); // 추상메서드
 *  }
 *  
 * -일반적인 클래스와 달리 인터페이스의 멈버들은 다음과 같은 제약사항이 있다.
 *  1.모든 멤버변수는 public static final 이어야하고, 이를 생략할 수 있다.
 *  2.모든 메서드는 public abstract 이어야하고, 이를 생략할 수 있다.
 *    생략된 제어자는 컴파일 시에 컴파일러가 자동적으로 추가해준다.
 *     (단, static메서드와 디폴트메서는 예외 : JDK 1.8부터)   
 */

interface PlayingCard {
	public static final int SPADE= 4;
	final int DIAMOND= 3;
	static int HEART= 2;
	int CLOVER= 1;
	
	public abstract String getCardNumber();
	String getCardKint();
}

/*
 * 인터페이스의 상속
 * -인터페이스는 인터페이스로부터만 상속받을 수 있으며, 클래스와 달리 다중상속, 즉 여러 개의 인터페이스로부터
 *  상속을 받는 것이 가능하다.
 * -인터페이스는 클래스와 달리 Object클리스와 같은 최고 조상이 없다.
 * -인터페이스의 조상은 인터페이스만 가능
 * -다중 상속이 가능(추상메서드는 충돌해도 문제 없음)
 */

abstract class Unit1 {
	int x, y;
	abstract void move(int x, int y); // 추상메서드라도 move가 있어야 리모컨에 move단추가 생긴다.
	void stop() { /* 현재 위치에 정지 */ }
}

interface Movable {
	/** 지정된 위치(x, y)로 이동하는 기능의 메서드 */
	void move(int x , int y);
}

interface Attackable {
	/** 지정된 대상(u)을 공격하는 기능의 메서드 */
	void attack(Unit1 u);
}

interface Fightable extends Movable, Attackable { }  // 상속받은 멤버가 2개
// 클래스의 상속과 마찬가지로 자손 인터페이스는 조상 인터페이스에 정의된 멤버를 모두 상속 받는다.
// Fightable자체에는 정의된 멤버가 하나도 없지만 조상 인터페이스로부터 상속받은 두 개의 추상메서드
//  move(int x, int y)와 attack(Unit u)을 멤버로 갖게 된다.

/*
 * 
 */


public class Practise7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
