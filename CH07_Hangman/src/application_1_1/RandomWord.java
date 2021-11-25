package application_1_1;

import java.util.Random;

public class RandomWord {
	// 스페이스바로 띄어진 단어들을 문자열로 str에 저장
	private String str= "disability artificial environment bulletin achievement insurance motivation invisible spectrum foreigner training original confrontation threaten definite transform overview indication tolerate folklore offender precision decorative sacrifice tradition concrete different survival sandwich departure industry basketball motorist discovery principle adoption mosquito freighter abstract implicit instinct producer reinforce presentation automatic accessible vegetarian unpleasant cucumber excavation";
			
	private String[] words= str.split(" "); // 문자열을 공백으로 잘라서 배열에 단어로 입력
	
	private String selectWord; // 랜덤으로 선택한 단어
	private char[] characters; // 문자 배열
	Random random= new Random();
	
	public RandomWord() {
		// 생성자에 랜덤 단어를 선택
//		selectWord= words[0]; // 단계1.
		
//		int randomIndex= random.nextInt(words.length);
//		selectWord= words[randomIndex]; // 단계1. 랜덤으로 선택 수정
		//위의 두 줄이 아래 한 줄로
		selectWord= words[random.nextInt(words.length)]; // 단계1. 랜덤으로 선택 수정

		// 단어를 _로 출력한다.
		characters= new char[selectWord.length()]; // 선택단어의 길이만큼 문자배열 크기로 생성
		
	}
	
	public void getWords() { // 현재 words배열에 있는 전체 단어를 출력
		for(String w : words) {
			System.out.println(w);
		}
	}
	
	public String toString() {
		// 단어를 _로 출력한다.
//		String text= " ";
		
		// text로 표현되는 부분을 StringBuilder로 수정
		StringBuilder sb= new StringBuilder();
		
		for(char c : characters ) {
//			if(c== '\u0000') { // 문자형의 초기값은 \u0000 이다. 문자('')의 초깃값이면 아직 맞히지 못한 문자
////				text +='_'; 
//				sb.append('_');
//			} 
//			else {
////				text += c; // 맞힌 문자일 경우 그 철자를 넣는다.
//				sb.append(c);
//			}
			// if~else문 대신 삼항 연산자로 대체하면 코드가 짧아진다.
			sb.append(c== '\u0000'? '_' : c); 

			//			text += ' '; // 철자를 한 칸씩 공백(스페이스바)
			sb.append(' ');
			
		}
		// text로 표현되는 부분을 StringBuilder로 수정
		
//		System.out.println(selectWord); // 정답출력(테스트용)
////		return selectWord; // 선택된 랜덤 단어를 가져옴, Hangman의 10행 26행으로 대체됨
		// 단어를 _로 출력하기 위해서 윗줄을 아랫줄로 변경
//		return text; // 선택된 랜덤단어를 가져옴
		return sb.toString(); //선택된 랜덤단어를 가져옴

	}

	public void addGuess(char c) {
		// 넘어온 문자를 검사해서 선택 단어에 있으면 characters 배열에 저장
		for(int i= 0; i< selectWord.length(); i++) { // 단어 길이만클 반복
			if(c== selectWord.charAt(i)) {
				characters[i]= c;
			}
		}
	}
	
	public boolean isCompleted() {
		// 철자를 다 맞혔는지 체크해서 true or false로 리턴
		for(char c : characters ) { // 단어 전체 철자 반복검사
			if(c== '\u0000') { // 
				return false; // 아직 맞혀야 할  문자가 있믐
			}
		}
		return true; // 다 맞혔음
			
			
	}
}
