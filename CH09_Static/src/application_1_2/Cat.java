package application_1_2;

public class Cat {
	private String name; // 이름
	private int id;
	// 스테틱 상수
	public static final String FOOD= "고양이 사료";
	// 스테틱 상수
	public static int count= 0; // 초기값 0
	
	public Cat(String name, int id) {
		this.name = name;
		this.id = id;
		count++;
		id= count; //객체가 만들어질 때마다 카운트 중
	}
	
	public static int getCount() {
		// 스테틱메서드는 일반 인스턴스(객체)변수 사용불가
		// String s= name; 객체가 만들어지기 전에 사용가능하므로 인스턴스 변수는 사용할 수가 없다.
		return count; // 스테틱변수는 사용할 수 있다.
	}

	public String toString() {
		return "Cat [이름="+ name+ ", id="+ id+ "]";
	}


}
