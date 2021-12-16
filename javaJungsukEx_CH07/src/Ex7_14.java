class Outer {
	private int outerIv= 0;
	private static 	int outerCv= 0;

	class InstanceInner {
		int iiv= outerIv;	// 1.내부클래스에서는 외부클래스의 private멤버도 접근가능하다. //
		int iiv2= outerCv;
	}
	
	static class StaticInner {
//		int siv= outerIv;	// static클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
		static int scv= outerCv;
	}
	
	void myMethod() { // 값이 바뀌지 않는 변수는 상수로 간주
		int lv= 0;	// 지역변수(메서드 종료와 함께 소멸)
		// lv가 변수이지만, 값을 변경하는 코드가 없으면 실제로는 상수와 다름없다.
		final int LV= 0;	// 상수. JDK1.8부터 final 생략 가능(항상 붙여라!!)
//		lv=3;
		
		class LocalInner { // 2.지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능 //
					// 외부 클래스의 지역변수는 final이 붙은 변수(즉, 상수)만 접근가능하다. //
			int liv= outerIv;
			int liv2= outerCv;
			int liv3= lv;	// 에러!!(JDK1.8부터 에러 아님, lv가 다른 값으로 바뀌면 에러)
			int liv4= LV;
			// 왜냐하면, 내부클래스의 객체가 지역변수보다 더 오래 존재할 수도 있으므로.
			// 상수는 constant pool이 있어서 따로 관리하므로 메서드 종료와 관계없이 계속 사용할 수 있다.
		}
	}
}

public class Ex7_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
