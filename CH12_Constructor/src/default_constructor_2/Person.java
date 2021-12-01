package default_constructor_2;

public class Person {
	
	private String name;
	private int age;
	
	public Person(){ // 기본생성자 (생성자가 2개 이상이므로 반드시 생성해야 한다.)
		System.out.println("디폴트 생성자로 생성됨");
		name= "모름";
		age= 0;
	} 
	
	public Person(String name) { // 생성자는 클래스 이름과 같고 리턴타입이 없음
		System.out.println("새 Person이 생김");
		this.name= name;
		age= 0;
	}
	
	public Person(String name, int age) { // 생성자는 클래스 이름과 같고 리턴타입이 없음
		System.out.println("새 Person이 생김");
		this.name= name;
		this.age= age;
	}
	
	@Override
	public String toString() { // 객체의 정보를 출력
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
