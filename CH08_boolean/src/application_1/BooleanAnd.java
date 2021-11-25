package application_1;

public class BooleanAnd {

	public static void main(String[] args) {
		// A && B => A, B 모두 참일 때만 참
		boolean isRaining= false; // 비가 오는가?
		boolean haveUmbrella= true; // 우산을 가지고 있나?
		boolean takeUmbrella= false; // 우산을 쓰나?
		// 첫번째
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella= true;
			}
		}
		System.out.println("첫번째 : "+ takeUmbrella);
		
		// 두번째
		if(isRaining && haveUmbrella) {
				takeUmbrella= true;
			}
		System.out.println("두번째 : "+ takeUmbrella);
		
		// 세번째
		takeUmbrella= isRaining && haveUmbrella ? true : false;
		System.out.println("세번째 : "+ takeUmbrella);
		
		// 세 가지 모두 같은 연산이다.
	}

}
