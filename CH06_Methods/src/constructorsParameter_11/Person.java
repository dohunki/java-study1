package constructorsParameter_11;

public class Person {
	private String name;
	private double height;
	// 생성자 메소드 : public +클래스명(), 리턴타입 없음
	
	// public Person( ) {} // 기본 생성자(생략되어 있다.)
	public Person( ) {
		name= "익명";
		height= 170;
		System.out.println("한 사람을 생성!");
	}
	public Person(String name, double height) {
		this.name= name;
		this.height= height;
		System.out.println("한 사람을 생성!!");
	}
	
	//toString 메소드
	public String toString() {
		String text= "이름 : "+ name+ ", 키 : "+ height;
		return text;
	}
	// get set 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height= height;
	}
	
}
