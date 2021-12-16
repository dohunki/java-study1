 /*
  * 익명 클래스(anonymous class)
  * -이름이 없는 일회용 클래스. 
  * -정의와 생성을 동시에 하기 때문에 단 한번만 사용될 수 있고 오직 하나의 객체만을 생성할 수 있다.
  * 
  * 	new 조상클래스이름() {
  *			// 멤버 선언
  *	 	}
  * 		또는
  * 
  * 	new 구현인터페이스이름() {
  * 		// 멤버 선언
  * 	}
  * 
  * -이름이 없기 때문에 생성자를 가질 수 없으며, 하나의 클래스로 상속받는 동시에 인터페이스를 구현하거나
  *  둘 이상의 인터페이스를 구현할 수 없다. 오로지 단 하나의 클래스를 상속받거나 단 하나의 인테페이스를 
  *  구현할 수 있다.
  */
public class Ex7_17 {
	Object iv = new Object(){	// 익명 클래스
		void method(){} 
	};			
	
	static Object cv = new Object(){	// 익명 클래스
		void method(){} 
	};  		

	void myMethod() {	// 익명 클래스
		Object lv = new Object(){ 
			void method(){} 
		};      
	}
}