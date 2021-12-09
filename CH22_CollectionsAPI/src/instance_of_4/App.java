package instance_of_4;

import java.io.Serializable;

class Creature implements Serializable {
	private static final long serialVersionUID= 1L;
}

class Cat extends Creature {
	private static final long serialVersionUID= 1L;
}

public class App {
	public static void main(String[] args) {
		//  A instanceof B : 객체의 타입을 판별, A가 클래스 B의 객체가 맞으면 true, 아니면 false
		Creature c1= new Creature(); // Creature는 super()로 상위클래스의 객체를 생성한다.
		Object c2= c1;
		
		Cat c3= new Cat();
		Serializable c4= (Serializable)c3;
		
		System.out.println(c1 instanceof Object); // Object가 부모클래스이므로 객체가 맞음
		System.out.println(c1 instanceof Serializable); // 인터페이스를 구현했으므로 객체가 맞음
		System.out.println(c1 instanceof Creature); // 본인 클래스
		System.out.println(c1 instanceof Cat);
	
		System.out.println();
		
		System.out.println(c2 instanceof Object); 
		System.out.println(c2 instanceof Serializable); 
		System.out.println(c2 instanceof Creature); 
		System.out.println(c2 instanceof Cat);

		System.out.println();
		
		System.out.println(c3 instanceof Object); 
		System.out.println(c3 instanceof Serializable); 
		System.out.println(c3 instanceof Creature); 
		System.out.println(c3 instanceof Cat);

		System.out.println();
		
		System.out.println(c4 instanceof Object); 
		System.out.println(c4 instanceof Serializable); 
		System.out.println(c4 instanceof Creature); 
		System.out.println(c4 instanceof Cat);
	}

}
