package application_1_2;

public class App {

	public static void main(String[] args) {
		// 스테틱 변수는 클래스명.변수로 객체 생성없이 사용
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);

		System.out.println(Cat.count);
		
		Cat cat1= new Cat("마틸다", Cat.count);
		System.out.println(Cat.getCount());
		Cat cat2= new Cat("보은", Cat.count);
		System.out.println(Cat.getCount());
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		
		Cat cat3= new Cat("울버린", Cat.count);
		System.out.println(Cat.getCount());
		System.out.println(cat3.toString());
		
	}

}
