package JavaJungsukCh_6;
class Data2 { int x; }

public class Ex6_7 {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
		// change메서드가 호출되면서 참조변수 d의 값(주소)이 매개변수 d에 복사됨
		// change메서드에서 매개변수 d로 x의 값을 1000으로 변경
		// change메서드가 종료되면서 매개변수 d는 스택에서 제거됨
		
		// change메서드를 호출한 후에 d.x의 값이 변경되었다.
		// change메서드의 매개변수가 참조형이라서 '값이 저장된 주소'를 change메서드에게 넘겨주었다.
		// x의 값이 아닌 변수 d의 주소가 매개변수 d에 복사되었다. 
		// 그래서 매개변수 d로 x의 값을 읽는 것과 변경하는 것이 모두 가능하다. 
	}

	static void change(Data2 d) { // 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
