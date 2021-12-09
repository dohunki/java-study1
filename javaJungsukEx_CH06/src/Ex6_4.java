
public class Ex6_4 {
	/*
	 반복적으로 수행되는 여러 문장을 메서드로 작성
	 하나의 메서드는 한 가지 기능만 수행하도록 작성
	 반환타입 메서드이름(변수타입 변수명, 변수타입 변수명, ...) {	 // 선언부
	         메서드 호출시 수행될 코드 					 // 구현부
	 }
	 필요한 값의 개수만큼 변수를 선언하며 각 변수 간의 구분은 쉼표','로 한다.
	 두 변수의 타입이 같아도 변수의 타입을 생략할 수 없다.
	 변수의 개수가 많으면 배열이나 참조변수를 사용하고, 값을 입력받을 필요가 없으면 ()안에 아무 것도 적지 않는다.
	 메서드의 결과(출력)인 반환값의 타입이 반환타입이고, 반환값이 없으면 void를 적어야 한다.
	 메서드의 반환값이 void가 아닐 경우 구현부{}안에 'return 반환값;'이 반드시 포함되어 있어야 한다.
	 메서드 내에 선언된 변수를 지역변수라 하고, 서로 다른 메서드에서는 지역변수의 이름이 같아도 상관없다.
	 메서드 호출은 //메서드이름(값1, 값2, ..); //로 하고 선언된 매개변수의 개수와 타입(자동형변환 포함)이 같아야 한다.
	*/
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L); // 순서1:메서드로 간다.   순서3: long result1= 8로 저장된다.
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
 }

 class MyMath {
	long add(long a, long b) { // 순서2: a=5, b=3을 대입하여 구현부가 실행된다.
		long result = a + b;
		return result; // result=8이 '순서3'으로 가서 저장된다.(작업을 마치면 호출한 곳으로 돌아간다.)
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}	
		// 모든 메서드에는 반드시 적어도 하나의 return문이 있어야 한다.
		// 반환타입이 void인 경우는 컴파일러가 메서드 마지막에 'return;'을 자동적으로 추가해 주었다. 
	
	long subtract(long a, long b) { return a - b; } // 메서드
	long multiply(long a, long b) { return a * b; } // 메서드
	double divide(double a, double b) { // 메서드
		return a / b;
	}
	// 메서드는 클래스 영역에만 정의
 }

