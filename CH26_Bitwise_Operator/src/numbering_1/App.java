package numbering_1;

public class App {

	public static void main(String[] args) {
		/*
		 * 10진수 decimal 		0부터 9까지
		 * 2진수  binary  		0부터 1까지
		 * 16진수 hexadecimal 	0부터 F까지
		 * 
		 * 0 1 2 3 4 5 6 7 8 9 10 11 ...
		 * 0 1 10 11 100 ...
		 * 0 1 2 3 4 5 6 7 8 9 A B C D E F 10 11 ...
		 */
		
		int val= 123;		
		System.out.println(Integer.toBinaryString(val)); // 10진수 정수를 2진수로 표현
		System.out.println(Integer.toHexString(val)); // 10진수 정수를 16진수로 표현
		
		System.out.println("=====");
		// 16진수를 리터럴(값) 표시할 때 0x	, 이진수는 0b를 먼저 붙임
		// 8bit가 1byte이고 1byte로 표시할 수 있는 가장 큰수가 255이다.
		// 1byte는 부호 1bit 숫자 7bit로 -128에서 127까지 표시가능
		int value2= 0xFF;
		System.out.println(Integer.toBinaryString(value2));
		System.out.println(Integer.toString(value2));
		
		System.out.println("=====");
		int value3= 0b1101101;
		System.out.println(Integer.toString(value3));
	}

}
