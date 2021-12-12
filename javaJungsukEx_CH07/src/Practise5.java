/*
 * 매개변수의 다형성
 * -장점 1.다형적 매개변수  2.하나의 배열로 여러 종류 객체 다루기
 * -참조형 매개변수는 메서드 호출시 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.
 */

class Productt {
	int price;				// 제품의 가격
	int bonusPoint;			// 제품구매 시 제공하는 보너스점수
}

class 		Tvv extends Productt{}
class Computerr extends Productt{}
class	 Audioo extends Productt{}

class Buyerr {				// 고객, 물건을 사는 사람
	int money= 1000;		// 소유금액
	int bonusPoint= 0;		// 보너스점수

/*
 * -Product클래스는 Tv와 Computerr클래스의 조상이며, Buyerr클래스는 제품구입자
 * -Buyer클래스에 물건을 구입하는 기능의 메서드를 추가하면 구입할 대상이 필요하므로 매개변수로
 *  구입할 제품을 넘겨받아야 한다. Tv를 살 수 있도록 매개변수를 Tv타입으로 하면
 */
	void buy(Tvv t) {
		// Buyerr가 가진 돈에서 제품의 가격만큼 뺀다.
		money= money- t.price;
		
		// Buyerr의 보너스점수에 제품의 보너스점수를 더한다.
		bonusPoint= bonusPoint+ t.bonusPoint;
	}
/*
 * -buy(Tvv t)는 제품을 구입하면 제품을 구입한 사람이 가진 돈에서 제품의 가격을 빼고, 보너스
 *  점수는 추가하는 작업을 하도록 작성되었다. 그련데, buy(Tvv t)로는 Tv밖에 살 수 없기에
 *  다른 제품들도 구입할 수 있는 메서드가 추가로 필요하다.
 */
	
	void buy(Computerr c) {  // 오버로딩
		money= money- c.price;
		bonusPoint= bonusPoint+ c.bonusPoint;
	}
	
	void buy(Audioo a) {  // 오버로딩
		money= money- a.price;
		bonusPoint= bonusPoint+ a.bonusPoint;
	}
	
/*
 * 이렇게 되면, 제품의 종류가 늘어날 때마다 Buyer클래스에는 새로운 buy메서드를 추가해야 한다.
 * 그러나, 메서드의 매개변수에 다형성을 적용하면 아래와 같이 하나의 메서드로 간단히 처리할 수 있다.
 */
	
	void buy(Productt p) {
		money= money- p.price;
		bonusPoint= bonusPoint+ p.bonusPoint;
	}
	
/*
 * -매개변수가 Product타입의 참조변수라는 것은, 메서드의 매개변수로 Product클래스의 자손타입의
 *  참조변수이면 어느 것이나 받아들일 수 있다는 뜻이다.
 * -Product클래스에 price와 bonusPoint가 선언되어 있기 때문에 참조변수 p로 인스턴스의
 */
	
}
public class Practise5 {
	public static void main(String[] args) {
		Buyerr b= new Buyerr();
		
		Tvv t= new Tvv();
		Computerr c= new Computerr();
		Audioo a= new Audioo();
		b.buy(t);
		b.buy(c);
		b.buy(a);
		
		Productt p1= new Tvv();
		Productt p2= new Computerr();
		Productt p3= new Audioo();
		b.buy(p1);
		b.buy(p2);
		b.buy(p3);
	}
}
