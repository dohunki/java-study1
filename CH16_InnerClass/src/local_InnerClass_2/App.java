package local_InnerClass_2;

public class App {
	private String name; // 인스턴스 변수
	
	public App() {
		name= "엘리자베스";
	}

	public static void main(String[] args) {
//		System.out.println(name); // 객체 생성없이 사용할 수 없다.
		App app= new App();
//		app.name= "펭수";
		app.run();
	}
	
	private void run() {
		// 클래스 안의 메서드에 클래스
		class Printer{
			public void print() {
				System.out.println(name); // 내부클래스는 상위클래스의 변수 사용가능
			}
		}
//		Printer p= new Printer();
//		p.print();
		new Printer().print();
	}

}
