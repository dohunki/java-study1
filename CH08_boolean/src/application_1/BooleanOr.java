package application_1;

public class BooleanOr {

	public static void main(String[] args) {
		// A || B => 둘 중에 하나라도 참이면 참
		boolean isRaining= true; // 비가 오는가?
		boolean mightRain= false; // 비가 올 수도 있는가?
		boolean takeUmbrella= false; // 우산을 가져가나?
	
		takeUmbrella= isRaining || mightRain;
		System.out.println(takeUmbrella);

	}

}
