/*
 * 기본형 형변환 : 값이 바뀐다.(int 3.6 -> 3)
 * 참조변수의 형변환
 * -사용할 수 있는 멤버의 개수를 조절하는 것(주솟값, 객체는 바뀌지 않는다.)
 * -서로 상속관계에 있는 클래스 사이에서만 가능
 * -자손타입의 참조변수를 조상타입의 참조변수로, 조상타입의 참조변수를 자손타입의 참조변수로 형변환만 가능
 * FireEngine f= new FireEngine();  형이 일치
 * Car c= (Car)f; // f의 값(객체의 주소)를 c에 저장, 조상인 Car타입으로 형변환(형변환 연산자 생략가능)
 * FireEngine f2= (FireEngine)c; // 자손인 FireEngine타입으로 형변환(형변환 연산자 생략불가)
 * (Car), (FireEngine) : 형변환 연산자, 형변환 연산자는 무조건 붙이면 신경쓸 일 없다.
 * Ambulance a= (Ambulance)f;	 // 에러!! 상속관계가 아닌 클래스 간의 형변환 불가
 * -기본형의 형변환과 달리 참조형의 형변환은 변수에 저장된 값(주솟값)이 변환되는 것은 아니다.
 * -참조변수의 형변환은 그저 리모컨(참조변수)을 다른 종류의 것으로 바꾸는 것 뿐이다.
 * -리모컨의 타입을 바꾸는 이유는 사용할 수 있는 멤버 개수를 조절하기 위한 것이다.
 * -서로 상속관계에 있는 타입간의 형변환은 양방향으로 자유롭게 수행될 수 있으나, 참조변수가 가리키는 인스턴스의
 *  자손타입으로 형변환은 허용되지 않는다. 그래서 참조변수가 가리키는 인스턴스의 타입이 무엇인지 먼저 확인하는 것이
 *  중요하다.
 */

public class Ex7_7 {
	public static void main(String args[]) {
		Car car = null;  // 객체가 없다.
		FireEngine fe = new FireEngine(); // FireEngine객체를 생성
		FireEngine fe2 = null;

		fe.water();
		car = (Car)fe;    // car = fe; 로 형변환 연산자 생략가능, fe의 값을 car에 저장
		// car로도 FireEngine을 다룰 수 있게 되었다. FireEngine인스턴스의 멤버 중 4개만 사용 가능
//		car.water(); // 컴파일 에러!! Car타입의 참조변수인 car로는 water()을 호출할 수 없다.
		fe2 = (FireEngine)car; // 자손타입 ← 조상타입 형변환하는 경우 형변환 연산자 생략 불가
		fe2.water();
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}

