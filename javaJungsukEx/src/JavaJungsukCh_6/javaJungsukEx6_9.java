package JavaJungsukCh_6;
	// 메서드 앞에 static이 붙어 있으면 클래스메서드이고 붙어 있지 않으면 인스턴트 메서드이다.
class MyMath2 {
	long a, b; // 인스턴스 변수(iv): 클래스 전체에서 사용

	// 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	long add()		{ return a + b; }  // 인스턴스 메서드(iv를 사용) a, b는 인스턴스 변수
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }

	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long   add(long a, long b)		 { return a + b; }  // a, b는 지역변수(iv를 사용하지 않는다.)
	// lv: 선언된 위치에서 메서드 종료시가지만 유효
	static long   subtract(long a, long b)   { return a - b; }
	static long   multiply(long a, long b)   { return a * b; }
	static double divide(long a, long b) { return a / (double)b; }
}

	/* static 메서드(클래스 메서드)
	 * 		iv 사용불가, 인스턴스 멤버(iv, im)과 관련없는 작업
	 * 		객체 생성없이 //클래스이름.메서드이름()// 으로 작업(호출)
	 * 인스턴스 메서드
	 * 		iv 사용가능, 인스턴스 멤버(iv, im)과 관련된 작업
	 * 		인스턴스 생성 후 //참조변수.메서드이름()// 으로 작업(호출)
	 */
public class javaJungsukEx6_9 {
	public static void main(String args[]) {
		// 클래스 메서드(iv를 사용하지 않을 때) 호출. 인스턴스(객체) 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));

		MyMath2 mm = new MyMath2(); // 인스턴스를 생성
		mm.a = 200L; // 여기 a, b는 인스턴스 변수(iv)
		mm.b = 100L;
		// 인스턴스 메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add()); // mm은 참조변수, 인스턴스 메서드 호출
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
   }
}

