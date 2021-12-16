class AA {
	int i= 100;
	BB b= new BB();
	
	class BB {
		void method() {
//			AA a= new AA();
//			System.out.println(a.i);
			System.out.println(i);	// 객체 생성없이 외부 클래스의 멤버 접근가능
		}
	}
}


//class CC { // 다른 클래스의 내부 클래스 객체를 사용할 수 없다.
//	BB b= new BB();
//}

public class Ex7_InnerTest {

	public static void main(String[] args) {
//		BB b= new BB();
//		b.method();
		
	}
}
