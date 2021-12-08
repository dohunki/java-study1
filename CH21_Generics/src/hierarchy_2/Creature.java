package hierarchy_2;

public class Creature { 
	// 필드 변수, 인스턴스 변수
	private String name;
	// 생성자
	public Creature(String name) {
		this.name= name;
	}
	// toString메서더
	public String toString() {
		return name;
	}
	// feed 메서드
	public void feed() {
		System.out.println("먹는다...");
		
	}

}
