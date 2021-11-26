package casting_4;

public class HouseCat extends Cat{
	
	@Override // 어노테이션 
	public void vocal() { // 오버라이딩 메서드: 자식클래스에서 부모와 똑같은 메서드 만듬
		System.out.println("미야우~");
	}
	public void call() { // 하우스캣만 가진 메서드
		System.out.println("집사를 부른다~");
	}
}
