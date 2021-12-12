/*
 * 여러 종류의 객체를 배열로 다루기
 * -조상타입의 참조변수로 자손타입의 객체를 참조하는 것이 가능하므로, Product클래스가
 *  Tv, Computer, Audio클래스의 조상일 때, 다음과 같이 할 수 이다.
 *  
 * Product p1= new Tv();
 * Product p2= new Computer();
 * Product p3= new Audio();
 * 
 * -조상타입의 배열에 자손들의 객체를 담을 수 있다.
 *  위의 코드를 Product타입의 참조변수 배열로 처리하면 다음과 같다.
 *  
 * Product p[]= new Product[3];
 * p[0]= new Tv();
 * p[1]= new Computer();
 * p[2]= new Audio();
 * 
 * 이처럼 조상타입의 참조변수 배열을 사용하면, 공통의 조상을 가진 서로 다른 종류의 객체를
 * 배열로 묶어서 다룰 수 있다. 또는 묶어서 다루고 싶은 객체들의 상속관계를 따져서 가장 가까운
 * 공통조상 클래스 타입의 참조변수 배열을 생성해서 객체들을 저장하면 된다. *  
 */

class Product2 {
	int price;			// 제품의 가격
	int bonusPoint;		// 제품구매 시 제공하는 보너스점수

	Product2() {} 		// 기본 생성자

	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv3 extends Product2 {
	Tv3() {  super(100);	 }

	public String toString() { return "Tv"; }
}

class Computer3 extends Product2 {
	Computer3() { super(200); }
	public String toString() { return "Computer"; }
}

class Audio3 extends Product2 {
	Audio3() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer2 {			  // 고객, 물건을 사는 사람
	int money = 1000;	  // 소유금액
	int bonusPoint = 0; // 보너스점수
	Product2[] cart = new Product2[10];   // 구입한 제품을 저장하기 위한 배열
	int i =0;			  // Product배열에 사용될 카운터

	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;             // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;   // 제품의 보너스 점수를 추가한다.
		cart[i++] = p;                // 제품을 Product[] cart에 저장한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	void summary() {	              // 구매한 물품에 대한 정보를 요약해서 보여 준다.
		int sum = 0;                 // 구입한 물품의 가격합계
		String itemList ="";         // 구입한 물품목록

		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class Ex7_9 {
	public static void main(String args[]) {
		Buyer2 b = new Buyer2();

		b.buy(new Tv3());
		b.buy(new Computer3());
		b.buy(new Audio3());
		b.summary();
	}
}