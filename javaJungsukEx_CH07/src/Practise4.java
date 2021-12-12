/*
 * 다형성(polymorphism) 
 * -여러가지 형태를 가질 수 있는 능력을 의미
 * -한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함
 * -조상클래스 타입이 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 하였다.
 * -반대로 자손타입의 참조변수로 조상타입의 인스터스를 참조할 수는 없다.
 */

class Tv2 {
	boolean power;  // 전원상태
	int channel;	// 채널
	
	void power() { power= !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv2 extends Tv2 {  // 캡션(자막)을 보여주기 위한 문자열
	String text;
	void caption() { /* 내용생략 */  }
}


public class Practise4 {

	public static void main(String[] args) {
		Tv2 t= new SmartTv2();	// 타입불일치(허용:다형성)
		// 조상타입의 참조변수로 자손인스턴스를 참조
		// 리모컨 버튼 5개 < 멤버 7개 : 기능이 있어도 사용하지 않는 것은 에러나지 않는다.
		// 참조변수 t는 text와 caption()를 사용할 수 없다.
		
//		SmartTv s= new Tv();	// 에러(허용 안 됨)
		// 리모컨 버튼 7개 > 멤버 5개 : 없는 기능을 호출하면 에러난다.
		// 자손 타입 참조변수로 조상타입의 객체를 가리틸 수 없다.
	}
}

/*
 * instanceof 연산자
 * -참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 사용
 * -주로 조건문에 사용, (참조변수 instanceof 클래스명)
 * -참조변수의 형변환 가능여부 확인에 사용, 가능하면 true 반환
 * -형변환 전에 반드시 instannceof로 확인해야 함
 * void doWork(Car c) { 
 * 		// doWork(new Car());
 * 		// doWork(new FireEngine()); (Car c= new FireEngine(); doWork(c); 와 동일)
 * 		// doWork(new Ambulance());
 * 		// 위의 3문장이 모두 가능
 * 	 if (c instanceof FireEngine) {		// 1.형변환이 가능한지 확인
 * 			FireEngine fe= (FireEngine)c; // 2.(true일 때) 형변환
 * 			fe.water();
 * 			...
 * 		//	형변환을 하는 이유는 인스턴스의 원래 기능을 모두 사용하려고.
 * 		//	Car타입의 리모컨인 c로는 water()를 호출할수 없으니까
 * 		//	리모컨을 FireEngine타입으로 바꿔서 water()를 호출
 * 	 }
 * }
 * -위의 코드는 Car타입의 참조변수 c를 매개변수로 하는 메서드이다. 이 메서드가 호출될 때,
 *  매개변수로 Car클래스 또는 그 자손 클래스의 인스턴스를 넘겨받겠지만 매서드 내에서는 정확
 *  히 어떤 인스턴스인지 알 길이 없다. instanceof연산자로 참조변수 c가 가리키고 있는
 *  인스턴스의 타입을 체크하고, 적절히 형변환한 다음에 작업을 해야 한다.
 */