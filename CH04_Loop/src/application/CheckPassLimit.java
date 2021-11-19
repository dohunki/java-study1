package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
		// 패스워드가 맞으면 '접속승인' 출력하고 반복문을 빠져나옴 
		// 패스워드 3회 틀릴시 '접속거부'
		final String USER_PASSWORD= "hello";
		Scanner scanner= new Scanner(System.in);
		boolean accessOK= false; // 플래그(flag):불린변수로 상태에 따라 처리흐름 제어	
		// 여기에 코드 작성 비번이 맞으면 accessOK= true;로 하고 "접속승인'을 출력
		
		for(int i=0; i<3; i++) {
			System.out.print("비밀번호를 입력하시오. > ");
			String password= scanner.nextLine();
			
			if(password.equals(USER_PASSWORD)) {
				System.out.println("접속승인");
				accessOK= true; // 이 부분을 생각하지 못함, 이 부분이 없으면 접속승인,접속거부 모두 출력됨, 
				break;
				// 참이면 변수 accessOK가 true로 나가서 for문 밖에서 사용됨 
			} else {
				System.out.printf("비밀번호를 %d번 틀렸습니다.%n ", i+1);
				// 3번 틀리면 변수 accessOK가 선언값 false 그대로 for문 밖에서 사용됨 
			}
		}
		scanner.close();
		
		if(!accessOK) {
			System.out.println("접속거부");
		}	
	}
}
