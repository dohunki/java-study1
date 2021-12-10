package java_Api;

import java.util.StringTokenizer;

public class Ex_3 {

	public static void main(String[] args) {
		// 입력 문자열
		String str= "치킨,피자,보쌈,족발,초밥,떡볶이,탕수육";
		String delim= ","; // 구분자
//		System.out.println(str.toString());
		
//		1.구분자를 ","로 하는 StringTokenizer 생성하시오.
		
		StringTokenizer st= new StringTokenizer(str, delim); 
		
		//2.모든 토큰을 출력하시오.
		while(st.hasMoreTokens()) { // 토큰이 존재한다면 반복
			System.out.println(st.nextToken());
		}
		
//		for(i= 0; i< st. ??; i++) {
//			System.out.println(st.nextToken());
//		}
	}

}
