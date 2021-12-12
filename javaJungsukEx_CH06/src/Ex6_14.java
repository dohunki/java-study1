
public class Ex6_14 {
	static { // 클래스 초기화 블럭 
		System.out.println("static { }"); // (1)
	}
	
	{ // 인스턴스 초기화 블럭 : 거의 사용할 일이 없음
		System.out.println("{ }"); // (3) (6)
	}
	
	public Ex6_14() {
		System.out.println("생성자"); // (4) (7)
	}

	public static void main(String[] args) {
		System.out.println("Ex6_14 bt= new Ex6_14();"); // (2)
		Ex6_14 bt= new Ex6_14(); // (3),(4)
		
		System.out.println("Ex6_14 bt2= new Ex6_14();"); // (5)
		Ex6_14 bt2= new Ex6_14(); // (6),(7)
	}
	
	/*
	 * -Ex6_14가 메모리에 로딩될 때, 클래스 초기화 블럭이 가장 먼저 수행되어 static{}이 출력된다.
	 *  그 다음 main메서드가 수행되어 Ex6_14의 인스턴스가 생성되면서 인스턴스 초기화 블럭이 먼저 수행되고,
	 *  끝으로 생성자가 수행된다.
	 * -클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번 만 수행되지만, 인스턴스 초기화 블럭은 인스턴스가 
	 *  생성될 때마다 수행된다.
	 */
}
