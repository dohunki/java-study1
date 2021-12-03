package enum_Constructor_3;

public enum Fruit { // keyword가 enum
	APPLE("초록"), BANANA("노랑"), ORANGE("주황"); // 상수들의 집합 (0, 1, 2 인덱스 번호)
	
	// enum 생성자
	private String color;
	
	Fruit(String color) {
		this.color= color;
	}
	
	public String toString() {
		return super.toString().toLowerCase()+ " ("+ color+ ")"; // LowerCase는 소문자로 만드는 것이다.
	}

}
