package inheritance_1;

public class App {

	public static void main(String[] args) {
		// ���� Ŭ������ �޼��� eat()
		Animal ani= new Animal();
		ani.eat();
		
		// �� Ŭ������ �޼��� fly()
		Bird bird= new Bird();
		bird.eat(); // �θ�(Animal)�� ���� ��ӹ޾����Ƿ� �ڽ�(Bird)���� ��밡��
		bird.fly();

	}

}
