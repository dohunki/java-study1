package java_Api;

import java.util.Random;

public class Ex_2 {

	public static void main(String[] args) {
		// 객체생성
		LottoMachine machine= new LottoMachine();
		
		// 로또번호 가져오기
		int[] numbers= machine.getLottoNumbers();
		
		// 결과 출력
		System.out.print("생성 번호: ");
		for(int i : numbers) {
			System.out.printf("%d ", i);
		}
	}
}

class LottoMachine {
	// 필드
	private int[] LottoNumbers;
	
	// 생성자
	public LottoMachine() {
		//2.메서드를 이용하여 로또번호 생성 초기화
		LottoNumbers= generate();
	}
	
	//메서드
	public int[] generate() {
		int[] pickedNumbers= new int[6];
		Random rand= new Random();
		
		// 1.임의의 숫자 6개를 추출하세요
		for(int i=0; i<pickedNumbers.length; i++) {
			pickedNumbers[i] = rand.nextInt(45)+1;
		}
		return pickedNumbers;
	}
	
	//3.생성된 로또번호를 가져오는 get메서드를 만드시오.
	
	public int[] getLottoNumbers() {
		return LottoNumbers;
	}
}