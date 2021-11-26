package inheritance_1;

public class App {

	public static void main(String[] args) {
		// 동물 클래스는 메서드 eat()
		Animal ani= new Animal();
		ani.eat();
		
		// 새 클래스는 메서드 fly()
		Bird bird= new Bird();
		bird.eat(); // 부모(Animal)로 부터 상속받았으므로 자식(Bird)에서 사용가능
		bird.fly();

	}

}
