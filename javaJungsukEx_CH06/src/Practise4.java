

//	class Testclass{
//		void instanceMethod() {}  		// 인스턴스메서드
//		static void staticMethod() {} 	// static메서드
//		
//		void instnaceMethod2() { 	//인스턴스메서드
//			instanceMethod(); 		// 다른 인스터스메서드를 호출한다.
//			staticMethod();	  		// static메서드를 호출한다.
//		}
//		
//		static void staticMethod2() { // static메서드(항상 호출 가능)
////			instanceMethod(); 		// 에러!! 인스턴스메서드를 호출할 수 없다.
//			// iv로 작업하는 메서드(iv를 사용), 객체가 필요
//			staticMethod();	  		// static메서드는 호출할 수 있다.
//		}
//	} // end of class
	// 같은 클래스 내의 메서드는 서로 객체의 생성이나 참조변수 없이 직접 호출이 가능하지만 
	// static메서드는 인스턴스 메서드를 호출할 수 없다.
	
//	class TestClass2 {
//		int iv;			// 인스턴스 변수(객체 생성 후 사용가능)
//		static int cv;  // 클래스 변수(언제나 사용가능)
//		
//		void instnaceMethod() {		 // 인스턴스 메서드(객체 생성후 호출가능)
//			System.out.println(iv);	 // 인스턴스 변수를 사용할 수 있다.
//			System.out.println(cv);	 // 클래스 변수를 사용할 수 있다.
//		}
//		
//		static void staticMethod() { // static메서드
////			System.out.println(iv);	 // 에러!! 인스턴스 변수를 사용할 수 없다.
//			System.out.println(cv);	 // 클래스 변수는 사용할 수 있다.
//		}
//	} // end of class
	// 인스턴스 메서드는 인스턴스 변수를 사용할 수 있지만, static메서드는 인스턴스 변수를 사용할 수 없다.

