package casting_4;

public class App {

	public static void main(String[] args) {
		// 캐스팅 실습
		Cat cat1= new HouseCat();
//		Cat cat1= new Cat(); // 객체 생성이 다운 캐스팅과 맞지 않을 때
		
		cat1.vocal();
		cat1.hunt();
		// cat1.call(); 
		// cat1은 Cat타입이기 때문에 Cat 클래스에 없는 메서드 사용불가, 오버라이딩은 됨
		
		System.out.println("--------------");
		
		// 다운 캐스팅
		HouseCat cat2= (HouseCat)cat1; // 객체 생성을 잘못해서 에러가 생겨도 
		//객체 형성이 되어야 컴파일러가 에러를 발견하므로 에러 표시를 해주지 않는다. 실시간 에러 발생
		cat2.call();
	}
}

