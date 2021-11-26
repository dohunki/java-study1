package JavaJungsukCh_6;
// 매개변수뿐만 아니라 반환타입도 참조형(객체의 주소)이 될 수 있다.
class Data3 {int x; } //  주소 0x100 에 x가 디폴트로 있다.

public class javaJungsukEx6_8 {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;   // 1단계. d는 주소 0x100을 가져오고 객체에 10을 저장한다.

		Data3 d2 = copy(d);  // 3단계. 객체 tmp의 주소 0x200을 d2에 대입한다.
		System.out.println("d.x ="+d.x); // d.x는 객체주소가 0x100이고 x값은 10이다. 
		System.out.println("d2.x="+d2.x); // d2.x는 객체주소가 0x200이고 x값은 10이다.
	}

	static Data3 copy(Data3 d) { // 2단계.
		Data3 tmp = new Data3();    // 주소가 0x200인 새로운 객체 tmp를 생성한다.

		tmp.x = d.x;  // 주소가 0x100인 d의 x값을 복사하여 주소가 0x200인 tmp에 준다.

		return tmp;   // 복사한 객체의 주소 0x200을 반환한다.(반환타입이 참조형이면 객체의 주소를 반환한다.)
		// copy메서드는 새로운 객체를 생성한 다음 매개변수로 넘겨받은 객체에 저장된 값을 복사해서 반환한다.
		// 반환하는 값이 주소이므로 반환타입이 'Data'이다.
	}
}