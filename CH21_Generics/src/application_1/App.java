package application_1;

import collections_3.Wrapper;
import hierarchy_2.Cat;
import hierarchy_2.Creature;
import hierarchy_2.Mammal;

public class App {
	public static void main(String[] args) {
//		Wrapper wrapper= new Wrapper();	
		// 제네릭 타입 (Wrapper.java를 참조하여 비교하시오.) 
		Wrapper<Cat> wrap1= new Wrapper<>();
		
		Wrapper<Creature> wrap2= new Wrapper<>();
		Wrapper<Mammal> wrap3= new Wrapper<>();	
		
		Cat cat= new Cat("마틸다");
		Creature cr= new Creature("크리쳐");
		Mammal mam= new Mammal("포유류");
		
//		wrapper.set(cat);		
		// 제네릭 타입
		wrap1.set(cat);
		
		wrap2.set(cr);
		wrap3.set(mam);

//		Cat c1= (Cat)wrapper.get();
		// Wrapper.java에서 return이 Object이기 때문에 (하위클래스)형변환 (Cat)
				// 제네릭 타입
		Cat c1= wrap1.get();
		
		Creature c2= wrap2.get();
		Mammal m2= wrap3.get();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(m2);
	}

}
