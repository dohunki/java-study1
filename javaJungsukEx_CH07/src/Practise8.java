/*
 * 인터페이스의 구현
 * -인터페이스도 추상클래스처럼 그 자체로는 인스턴스를 생성할 수 없으며, 추상클래스가 상속을 통해
 *  추상메서드를 완성하는 것처럼, 인터페이스도 implements를 이용해 자신안에 정의된 추상메서드의 
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
 * -인터페이스는 이를 구현한 클래스의 조상이라 할 수 있으므로 해당 인터페어스 타입의 참조변수로 이를 
 *  구현한 클래스의 인스턴스를 참조할 수 있므며, 인터페이스 타입으로의 형변환도 가능하다.
 * -인터페이스 Fightable2을 클래스 Fighter가 구현했을 때, 아래와 같이 Fighter 인스턴스를
 *  Fightable2 타입의 참조변수로 참조하는 것이 가능하다.
 *  	Fightable2 f= (Fightable2)new Fighter();
 *    		또는
 *  	Fightable2 f= new Fighter();
 *  따라서 인터페이스는 다음과 같이 메서드의 매개변수의 타입으로도 사용될 수 있다.
 *  	void attack(Fightable2 f) {
 *  		// ...
 *  	}
 *  
 * -인터페이스 타입의 매개변수가 갖는 의미는 메서드 호출 시 해당 인터페이스를 구현한 클래스의 인스턴스를
 *  매개변수로 제공해야 한다는 것이다.
 *   조상객체			자손객체
 *	Unit u= 	  new Fighter();
 *	Fightable2 f= new Fighter();
 *	f.move(100, 200);
 *	f.attack(new Fighter());
 * 와 아래의 표현은 같은 내용이다.
 * 
 * class Fighter extends Unit implement Fightable2 { 
 * 		public void move(int x, int y)  { 내용 생략 }
 * 		public void attack(Fightable2 f) { 내용 생략 }
 *      // attack 메서드는 매개변수로 Fightable2 인터페이스를 구현한 클래스의 인스턴스만 가능
 * }
 * 
 * 위와 같이 Fightbale2 인터페이스를 구현한 Fighter클래스가 있을 때, attack메서드의 매개변수로
 * Fighter 인스턴스를 넘겨 줄 수 있다. 즉, attack(new Fighter())와 같이 할 수 있다.
 * 그리고, 아래처럼 메서드의 리턴타입으로 인터페이스를 지정하는 것도 가능하다.
 * 
 * Fightable2 method() { // Fightable2 인터페이스를 구현한 클래스의 인스턴스를 반환
 * 		...
 * 		Fighter f= new Fighter();
 * 		return f;		// Fightable2와 f는 형변환 일치, 인터페이를 구현한 객체를 반환
 * 		// 위의 두 문장은 return new Fighter(); 로 바꿀수 있다.
 * 		// Fighter 객체반환, Fightable2 구현 : 다형성
 * }
 * 
 * 위의 코드는 Fightable2 f= method(); 와 일치한다.
 * 
 * 리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미한다.
 * 
 * 위의 코드에서는 method()의 리턴타입이 Fightable2 인터페이스이기 때문에 메서드의 return문에서
 * Fightable2 인터페이스를 구현한 Fighter 클래스의 인스턴스 주소를 반환한다.
 */



 
