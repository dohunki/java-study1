package super_Constructor4;

public class Person {
	private String name;
	
//	public Person() { // 叔楳1
//		System.out.println("Person 持失切");
//		this.name= name;
//	}
	
	public Person(String name) {
		System.out.println("Person 持失切");
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name= name;
	}
	
	public String toString() {
		return name;
	}

}
