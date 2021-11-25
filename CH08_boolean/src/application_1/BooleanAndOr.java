package application_1;

public class BooleanAndOr {

	public static void main(String[] args) {
		// && || 합쳐서 사용
		boolean isRaining= true; // 비가 오는가?
		boolean mightRain= false; // 비가 올 수도 있는가?
		boolean haveUmbrella= false; // 우산을 가지고 있나?
		// 첫번째
		if((isRaining || mightRain) && haveUmbrella) {
			System.out.println("우산을 쓴다.");
		} else {
			System.out.println("우산을 쓰지 않는다.");
		}
		
		// 두번째
		boolean rainCheck= isRaining || mightRain;
		
		if(rainCheck && haveUmbrella) {
			System.out.println("우산을 쓴다.");
		} else {
			System.out.println("우산을 쓰지 않는다.");
		}
	}

}
