package application;

import java.nio.file.StandardOpenOption;

public class Printing {

	public static void main(String[] args) {
		// 문자열 (+) , 출력
		String name= "홍길동";
		System.out.println("내 이름은 " + name);
		
		String text= "나의 이름은 : ";
		String endOfSentence= ".";
		
		System.out.println(text + name + endOfSentence);

	}

}
