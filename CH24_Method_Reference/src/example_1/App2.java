package example_1;

@FunctionalInterface
interface Greeter {
	void greet();
}

public class App2 {		
	public static void main(String[] args) {

		Greeter g = () -> System.out.println("Çï·Î¿ì!");
		g.greet();

		Greeter g2 = App2::sayHello;
		g2.greet();
	}

	private static void sayHello() {
		System.out.println("Çï·Î¿ì!");
	}

}