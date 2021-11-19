package application;

public class StringEqual {

	public static void main(String[] args) {
		// 두 개의 문자열이 같은지 비교한다.
		String t1= "apple";
		String t2= "apple";
		String t3= "사과";
		
		System.out.printf("두 개이 문자열 일치 : %b%n", t1 == t2);
		System.out.printf("두 개이 문자열 일치 : %b%n", t1.equals(t2));
		System.out.printf("두 개이 문자열 일치 : %b%n", t1.equals(t3));
		

	}

}
