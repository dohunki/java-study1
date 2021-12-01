package this_Constructor_3;

public class Person {
	
	private String name;
	private int age;
	
	public Person(){ // 기본 생성자
		this("익명"); // 변수 형과 개수가 동일한 생성자를 참조
	}
	
	public Person(String name) { // 생성자는 클래스 이름과 같고 리턴타입이 없음
		this(name, 3); 
	}
	
	public Person(String name, int age) { // 생성자는 클래스 이름과 같고 리턴타입이 없음
		this.name= name;
		this.age= age;
	}
	
	@Override
	public String toString() { // 객체의 정보를 출력
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
