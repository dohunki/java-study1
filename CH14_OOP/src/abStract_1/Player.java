package abStract_1;
// 추상 클래스를 상속받았을 경우 추상 메서드를 구현해야(만들어야) 한다.
public  class Player extends GameObject{
	
	@Override
	public void describe() {
		System.out.println("플레이어입니다.");
	}

}
