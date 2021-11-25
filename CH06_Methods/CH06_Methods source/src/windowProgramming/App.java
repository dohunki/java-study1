package windowProgramming;

public class App {
	public static void main(String[] args) {
		// 윈도우 객체를 생성
		// set 메소드로 값을 입력하고 get메소드로 값을 출력하라
		// 설정 윈도우창의 가로길이 300 세로길이 600
		// 현재 보이도록 true , top 200 ,left 400
		Window win = new Window();
		
		win.setWidth(300);
		win.setHeight(600);
		win.setIsVisible(true);
		win.setTop(200);
		win.setLeft(400);
		
		System.out.println("가로길이 : "+ win.getWidth());
		System.out.println("세로길이 : "+ win.getHeight());
		System.out.println("현재보임 : "+ win.getIsVisible());
		System.out.println("위치 top : "+ win.getTop());
		System.out.println("위치 left : "+ win.getLeft());
	}

}
