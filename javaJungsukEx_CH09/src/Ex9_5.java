import java.util.Objects;

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE", 1);
	}
	
	Card2(String kind, int number) {
		this.kind= kind;
		this.number= number;
	}
	
	// equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
	public int hashCode() {
		return Objects.hash(kind, number);
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card2)) 
			return false;
	
		Card2 c= (Card2)obj;
		return this.kind.equals(c.kind) && this.number== c.number;
	}
	
	// Object클래스의 toString()를 오버라이딩
	public String toString() {
		return "kind : "+ kind+ ", number : "+ number;
	}
}

public class Ex9_5 {
	public static void main(String[] args) {
		Card2 c1= new Card2();
		
//		Card2 c2= new Card2();
		Card2 c2= new Card2("HEART", 10);
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
//		System.out.println(c2.toString("HEART", 10)); // 에러 
	}

}
