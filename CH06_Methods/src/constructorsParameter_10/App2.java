package constructorsParameter_10;

public class App2 {

	public static void main(String[] args) {
		// 생성자 : 클래스의 특별한 메소드
		Person p1= new Person("펭수", 120.0);
		Person p2= new Person("길동", 172.5);
		Person p3= new Person("라이온", 165.5);
		
		System.out.printf("이름 : %s , 키 : %.1f %n", p1.getName(), p1.getHeight());
		System.out.printf("이름 : %s , 키 : %.1f %n", p2.getName(), p2.getHeight());
		System.out.printf("이름 : %s , 키 : %.1f %n", p3.getName(), p3.getHeight());
		

	}

}
