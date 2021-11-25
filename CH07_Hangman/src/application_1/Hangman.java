package application_1;

import java.util.Random;

public class Hangman {

	private boolean running= false; // 게임을 계속 진행?
	// running=true이면 반복실행, running=false이면 한 번만 실행하고 종료
	
	private RandomWord word= new RandomWord();
	
	// 프로그램을 실행하는 런 메소드
	public void run() {
		do {
			displayWord();    // 화면에 단어표시 _ _ _ _ 로 표시
			getUserInput();   // 철자 하나를 입력받음
			checkUserInput(); // 맞는지 체트 (전부 맞으면 running= false)
		}while(running);
	}
	
	private void displayWord() {
//		System.out.println("화면에 단어 표시");
		// 랜덤 워드 객체를 생성해 랜덤으로 한 단어를 출력한다.
		// 단계2. 랜덤 워드 객체를 생성해 랜덤으로 한 단어를 출력한다.
		
		System.out.println(word.toString());
		
	}
	
	private void getUserInput() {
		System.out.println("철자 하나 입력");
		
	}
	
	private void checkUserInput() {
		System.out.println("맞는지 체크");
		
	}

}
