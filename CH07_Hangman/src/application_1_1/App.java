package application_1_1;

public class App { // 프로젝트를 실행하기 위한 클래스

	public static void main(String[] args) {
		// 행맨 게임 시작
		Hangman game= new Hangman();
		game.run(); // 게임이 실행
		game.close(); 
	}

}
