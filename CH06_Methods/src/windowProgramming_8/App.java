package windowProgramming_8;

public class App {

	public static void main(String[] args) {
		// 윈도우 객체를 생성
		// set 메소드로 값을 입력하고 get 메소드로 값을 출력하라.
		// 설정 윈도우창의 가로길이 300, 세로길이 600
		// 현재 보이도록 true, top 200, left 400
		
		Window w1= new Window(); 
		// Window클래스 타입의 참조변수 w1 선언(class명은 Window, 변수명 w1)
		// Window인스턴스 생성 후, 생성된 Window인스턴스 주소를 w1에 저장
		// 자바의 정석 165쪽 참고

		w1.setWidth(300); 
		// Window인스턴스의 멤버변수 Width의 값을 300으로 한다.
		System.out.println("가로 길이 : "+ w1.getWidth());
		
		w1.setHeight(600);
		System.out.println("세로 길이 : "+ w1.getHeight());

		w1.setIsVisible(true);
		System.out.println("현재 보임 : "+ w1.getIsVisible());

		w1.setTop(200);
		System.out.println("위치 top : "+ w1.getTop());

		w1.setLeft(400);
		System.out.println("위치 Left : "+ w1.getLeft());


	}

}
