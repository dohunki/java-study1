package hashcode_this_1;

public class App {

	public static void main(String[] args) {
		Fox fox1= new Fox();
		System.out.println(fox1);
		System.out.println(fox1.toString());
		// hashCode메서드는 객체의 주솟값을 이용해서 만들어 반환하므로 
		//서로 다른 두 객체는 같은 해시코드를 가질 수 없다. 
		System.out.println(fox1.hashCode());
		System.out.printf("%x %n", fox1.hashCode());
		
		Fox fox2= fox1;
		System.out.println(fox2);
		System.out.println(fox2.name);

	}

}
