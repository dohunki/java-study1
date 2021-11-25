package exam1_3;

public class App {
	public static void main(String[] args) {
		// 1. 메뉴 객체 만들기 2.display() 메서드 사용해서 메뉴 출력하기
		Menu menu = new Menu();
		menu.display();
	}

}
	// 아래의 Menu 클래스를 클래스 파일로 만들어 패키지로 묶어서 처리
//class Menu {
//	String[] options = { "아이템 보기", "아이템 추가", "아이템 삭제", "종료" };
//
//	void display() { // 옵션 메뉴들을 출력한다.
//		for (int i = 0; i < options.length; i++) {
//			System.out.printf("%d. %s \n", i, options[i]);
//		}
//	}
//}
