package application_1;

public class BooleanAnd {

	public static void main(String[] args) {
		// A && B => A, B ��� ���� ���� ��
		boolean isRaining= false; // �� ���°�?
		boolean haveUmbrella= true; // ����� ������ �ֳ�?
		boolean takeUmbrella= false; // ����� ����?
		// ù��°
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella= true;
			}
		}
		System.out.println("ù��° : "+ takeUmbrella);
		
		// �ι�°
		if(isRaining && haveUmbrella) {
				takeUmbrella= true;
			}
		System.out.println("�ι�° : "+ takeUmbrella);
		
		// ����°
		takeUmbrella= isRaining && haveUmbrella ? true : false;
		System.out.println("����° : "+ takeUmbrella);
		
		// �� ���� ��� ���� �����̴�.
	}

}
