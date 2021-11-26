package polymorphism_3;

public class App {

	public static void main(String[] args) {
		// 다형성 : 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있다.
		// 서로 상속관계에 있는 클래스 사이에서 참조변수의 형변환이 가능하다.
//		Cat cat1= new Cat();		
//		Cat cat2= new HouseCat();		
//		Cat cat3= new RoadCat();
//
//		Cat[] cats= {cat1, cat2, cat3}; // 클래스타입의 배열이므로 객체가 들어간다.
//		
//		for(Cat c : cats) { // cats배열의 각각의 객체가 c에 대입하여 반복
//			c.vocal();
//			c.hunt();
//		}
		
		Cat[] cats= {new HouseCat(), new RoadCat(), new Tiger()};
		// cats[0]== new HouseCat();
		// cats[1]== new RoadCat();
		// cats[2]== new TigerCat();
		
//		String[] s= {new String("문자열1"), new String("문자열2"), new String("문자열3")};	
		
		// for 반복문
		for (int i= 0; i< cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		System.out.println("--------------------------");
		// for each 반복문
		for (Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		
		System.out.println("--------------------------");
		// 캐스팅 형변환 (기본 데이터 타입)
		int a= (int)1.2345;
		System.out.println(a);
		
		// 참조형 타입 (상속 관계일 때)
		Cat cat1= new HouseCat(); // 업캐스팅
		HouseCat cat2= (HouseCat)cat1; // 다운캐스팅
	}
}

