package application_1;

public class Cat {
	private String name; // 이름
	// 스테틱 상수
	public static final String FOOD= "고양이 사료";
	// 스테틱 상수
	public static int count= 0; // 초기값 0
	public Cat(String name) {
		this.name= name;
		count++;
	}	
	public int getCount() {
		return count;
	}
		
	@Override
	public String toString() {
		return "Cat [이름="+ name+ "]";
	}
	
}
