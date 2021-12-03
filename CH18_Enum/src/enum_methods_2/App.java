package enum_methods_2;

public class App {

	public static void main(String[] args) {
		// enum에서 사용하는 메서드
		
		// values()
		Fruit[] fruits= Fruit.values(); // value() : enum의 모든 상수들을 배열로 리턴
		
		for(Fruit f : fruits) {
			System.out.println(f);
		}
		
		System.out.println("----------------------");
		
		for(Fruit f : Fruit.values()) {
			System.out.println(f);
		}		
		System.out.println("----------------------");
		
		// ordinal() : enum의 상수의 순서(인덱스 번호)를 리턴
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		
		System.out.println("----------------------");
		
		// valueOf("상수값/문자열") : (상수값/문자열)과 같은 enum을 찾음
		Fruit f1= Fruit.valueOf("ORANGE");
		System.out.println(f1);
		System.out.println(f1== Fruit.ORANGE);
	}
		
	
}
