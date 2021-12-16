class Outer3 {
	int value = 10;	// Outer3.this.value  외부클래스의 iv는 외부클래스의 이름을 붙인다.

	class Inner {
		int value = 20;   // this.value  내부클래스의 iv

		void method1() {
			// 내부 클래스와 외부 클래스에서 선언된 변수의 이름이 같을 때 
			// 변수 앞에 this 또는 외부클래스명.this를 붙여서 구별할 수 있다.
			int value = 30;
			System.out.println("            value :" + value);
			System.out.println("       this.value :" + this.value);
			System.out.println("Outer3.this.value :" + Outer3.this.value);
		}
	} // Inner클래스의 끝
} // Outer3클래스의 끝

public class Ex7_16 {
	public static void main(String args[]) {
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.method1();
	}
}