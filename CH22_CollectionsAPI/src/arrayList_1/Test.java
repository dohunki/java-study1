package arrayList_1;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);		
		ArrayList<Double> numbers= new ArrayList<>();
//		LinkedList<Double> numbers= new LinkedList<>();
		double total= 0;
		
		while(true) {		
			System.out.print("숫자 또는 'q' 입력 > ");		
			String input= scanner.nextLine();
			input= input.trim(); // 공백제거
//			System.out.println(input); 
			if(input.equalsIgnoreCase("q")) { // 입력을 q(대소문자 구분없음)로 하면 반복문 종료
				break;
			}
			try {
				double value= Double.parseDouble(input); // 문자열 => 실수로 변환
				numbers.add(value); // 실수로 변환된 값을 리스트에 입력
				total += value;
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다.");
			}
		}
		scanner.close(); // 스캐너 종료
		System.out.println();
		if(numbers.size() > 0) { // 입력된 숫자가 1개 이상이면 출력
			System.out.println("입력된 숫자 : ");
			
			for(Double num : numbers) {
				System.out.printf("%.2f%n", num);
			}
			double avg= total/numbers.size();
			System.out.println("평균은 "+ avg+"입니다.");

		} else {
			System.out.println("숫자가 입력되지 않음!");
		}
		
	}
}
