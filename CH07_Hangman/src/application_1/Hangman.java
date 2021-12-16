package application_1_1;

import java.util.Scanner;

public class Hangman {

	private boolean running= true; // 게임을 계속 진행?
	// running=true이면 반복실행, running=false이면 한 번만 실행하고 종료
	
	private RandomWord word= new RandomWord();
	
	private Scanner scanner= new Scanner(System.in);
	
	
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
		// 유저에게 한 문자 입력 요구
		// 입력받은 문자열에서 한 문자를 뽑아서
		// RandomWord 객체에 전달( addGuess(문자) 메서드를 만들자)
		System.out.println("한 문자 입력 : ");
		String guess= scanner.nextLine(); // 입력받은 문자열을 guess에 저장
		// 단어에서 입력받은 문자가 있는지 확인해서 처리한다.(단어는 RandomWord 객체 word를 사용)
		word.addGuess(guess.charAt(0)); //첫번째 문자를 입력
	}
	
	private void checkUserInput() {
		System.out.println("맞는지 체크");	
		// 유저가 단어를 다 맞혔는지 체크해서 게임을 종료
		// 게임 종료 확인을 하는 메서드 isCompleted를 RandomWord 클래스에 만들기
		if(word.isCompleted()) {
			System.out.println("잘 맞혔어요");
		}
	}
	
	/**
	 * 스캐너를 닫는 메서드
	 * 이것을 이용하면 close() 메서드에 hover시 '스캐너를 닫는 메서드'라는 내용이 뜬다.
	 */
	public void close() {
		scanner.close();
	}
}
