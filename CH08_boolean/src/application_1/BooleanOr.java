package application_1;

public class BooleanOr {

	public static void main(String[] args) {
		// A || B => �� �߿� �ϳ��� ���̸� ��
		boolean isRaining= true; // �� ���°�?
		boolean mightRain= false; // �� �� ���� �ִ°�?
		boolean takeUmbrella= false; // ����� ��������?
	
		takeUmbrella= isRaining || mightRain;
		System.out.println(takeUmbrella);

	}

}
