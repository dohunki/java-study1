// -기본형 매개변수
// 메서드를 호출할 때 매개변수로 지정한 값을 메서드의 매개변수에 복사해서 넘겨준다.
// 매개변수의 타입이 기본형이면 기본형 값이 복사되고, 참조형이면 인스턴스의 주소가 복사된다.
// 기본형은 변수의 값을 읽기만 할 수 있고, 참조형은 읽고 변경도 할 수 있다.
class Data { int x; } 

public class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		// change메서드가 호출되면서 'd.x'가 change메서드의 매개변수 x에 복사됨
		// change메서드에서 x의 값을 1000으로 변경
		// change메서드가 종료되면서 매개변수 x는 스택에서 제거됨
		
		// d.x의 값이 변경된 것이 아니라, change메서드의 매개변수 x의 값이 변경된 것이다.
		// 원본이 아닌 복사본이 변경된 것이라서 원본에는 아무런 변화가 없다.
	}

	static void change(int x) {  // 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
