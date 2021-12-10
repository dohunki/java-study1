/*
 * 생성자에서 다른 생성자 호출하기: this()
 * -생성자의 이름으로 클래스 이름대신 this를 사용한다.
 * -한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.
 * 같은 클래스 내의 생성자들은 서로 관계가 깊은 경우가 많아 서로 호출할 수 있도록 유기적으로 연결해주면
 * 수정이 필요한 경우 보다 적은 코드만을 변경하는 유리함이 있다.
 */
class Car2 {
	String color;		// 색상
	String gearType;	// 변속기 종류 - auto(자동), manual(수동)
	int door;			// 문의 개수
	// 코드의 중복을 제거하려고 서로 호출할 수 있도록 코딩한다.
	Car2() {
		this("white", "auto", 4);
	// 다른 생성자 Car2(String color, String gearType, int door)를 호출
	}

	Car2(String color) {
		this(color, "auto", 4);
	// 다른 생성자 Car2(String color, String gearType, int door)를 호출
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}
public class Ex6_13 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();	
		Car2 c2 = new Car2("blue");
		Car2 c3 = new Car2("green", "semiauto", 5);

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
		System.out.println("c3의 color=" + c3.color + ", gearType=" + c3.gearType+ ", door="+c3.door);
	}
}

