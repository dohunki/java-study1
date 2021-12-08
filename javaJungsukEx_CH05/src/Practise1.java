import java.util.Arrays;

public class Practise1 {
	public static void main(String[] args) {
		int[] iArr1= new int[]{100, 95, 80, 70, 60};
		for(int i=0; i< iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		
		System.out.println();
		
		// Array.toString()를 사용하여 배열 출력하기(import java.util.Arrays; 를 추가해야 한다)
		int[] iArr2= {100, 95, 80, 70, 60}; // new int[] 생략가능
		System.out.println(Arrays.toString(iArr2));
		
		System.out.println();
		
		// String 클래스는 char배열에 기능(메서드)를 추가한 것이다.
		// String객체(문자열)은 읽을 수만 있을 뿐 내용을 변경할 수는 없다.
		// 아래 내용은 문자열 str의 내용이 변경된 것이 아니라, 새로운 내용의 문자열이 생성된 것이다.
		String str= "Java";
		str= str+ "8";
		System.out.println(str);
		
		System.out.println();
		
		// char charAt(int index)는 문자열에서 해당 위치(index)에 있는 문자를 반환한다.
		String str1= "ABCDE";
		char ch= str1.charAt(3);
		System.out.println(ch);
		
		System.out.println();
		
		// int length()는 문자의 길이를 변환한다.
		String str2= "abcdefg";
		int i= str2.length();
		System.out.println(i);
		
		System.out.println();
		
		// String substring(int from, int to)는 문자열에서 해당범위의 문자열을 반환한다.(to는 포함 안 됨)
		String str3= "01234567";
		String i2= str3.substring(2, 5);
		System.out.println(i2);
		
		System.out.println();
		
		// char[] toCharArray()는 문자열을 문자배열(char[])로 변환해서 반환한다.
		String str4= "문자배열반환";
		char[] c= str4.toCharArray();
		System.out.println(c);
		System.out.println(c[3]);
		
		System.out.println();
		
		
		
	}
}
