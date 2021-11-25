package test_2; // 테스트용 패키지

import java.util.Random;

import application_1.RandomWord; 
// 다른 패키지에 있는 것을 불러올 때는 import문이 필요(ctrl+space로 자동 호출)

public class Test {

	public static void main(String[] args) {
//		RandomWord r= new RandomWord();
//		r.getWords();
//		System.out.println(r.toString());
		
		// 랜덤으로 단어를 가져오는 방법?
		Random random= new Random();
		
		String[] words= {"펭수", "고양이", "라이언", "늑대", "소"};
		
		for(int i= 0; i< 100; i++) {
			int randomIndex= random.nextInt(words.length);
			System.out.println(words[randomIndex]);
		}
		
	}

}
