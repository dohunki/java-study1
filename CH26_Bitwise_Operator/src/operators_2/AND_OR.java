package operators_2;

public class AND_OR {

	public static void main(String[] args) {
		// 비트 and or 연산
		int v1= 0b01010011;
		int v2= 0b11010110;
		
		int result1= v1 & v2; // and 비트연산
		System.out.println(tBinary(v1));
		System.out.println(tBinary(v2));
		System.out.println(tBinary(result1));
		
		System.out.println("=========");
		int result2= v1 | v2; // or 비트연산
		System.out.println(tBinary(v1));
		System.out.println(tBinary(v2));
		System.out.println(tBinary(result2));
	}
	
	public static String tBinary(int value) { // 이진수 문자열로 출력!
		// String.format은 printf처럼 사용하며 문자열로 리턴된다.
		return String.format("%10s", Integer.toBinaryString(value)).replace(" ", "0");
		// "%10s" : 10자리,  replace(" ", "0") : 공백은 0으로 채워라
	}

}
