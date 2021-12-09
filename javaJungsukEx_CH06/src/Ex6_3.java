

public class Ex6_3 {

		public static void main(String args[]) {
			System.out.println("Card.width = " + Card.width);
			System.out.println("Card.height = " + Card.height);
			// 클래스 변수(Card.width등)는 객체 생성없이 '클래스이름.클래스변수'로 직접 사용 가능하다.

			Card c1 = new Card(); // c1 객체 생성
			c1.kind = "Heart";
			c1.number = 7;
			// 인스턴스 변수의 값을 변경

			Card c2 = new Card(); // c2 객체 생성
			c2.kind = "Spade";
			c2.number = 4;
			// 인스턴스 변수의 값을 변경

			System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
			System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
			System.out.println("Card의 width와 height를 각각 50, 80으로 변경합니다.");
			c1.width = 50;
			c1.height = 80;
			// 클래스 변수의 값을 변경
			// 여기서 c1은 클래스변수로 원래는 Card.width= 50; Card.height= 80; 으로 적어야 한다.
			// Card인스턴스인 c1과 c2는 클래스 변수인 width와 height를 공유하기 때문에 
			// c1의 width와 height를 변경하면 c2의 width와 height 값도 바뀐 것과 같은 결과를 얻는다.

			System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
			System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		}
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}


