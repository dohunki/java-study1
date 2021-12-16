class Outer2 {
	class InstanceInner { // 인스턴스 멤버
		int iv = 100;
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}

	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
	
//	void myMethod2() {
//		// 같은 이름의 클래스가 메서드마다 있을 수 있다.
//		class LocalInner {
//			int Iv= 100;
//		}
//	}
}

class Ex7_15 {
	public static void main(String[] args) {
		// 내부 클래스의 인스턴스를 생성하려면 외부 클래스의 인스턴스를 먼저 생성해야 한다.
		Outer2 oc = new Outer2(); // 외부 클래스의 객체 생성
		Outer2.InstanceInner ii = oc.new InstanceInner(); // 내부 클래스의 객체 생성

		System.out.println("ii.iv : "+ ii.iv);
		System.out.println("Outer2.StaticInner.cv : "+Outer2.StaticInner.cv);
												// 외부클래스의 객체생성없디 cv 사용가능
                                     
		// static 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		// 하지만, 외부클래스 이름을 붙여줘야 한다.
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv : "+ si.iv);
	}
}