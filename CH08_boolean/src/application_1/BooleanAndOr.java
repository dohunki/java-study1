package application_1;

public class BooleanAndOr {

	public static void main(String[] args) {
		// && || ���ļ� ���
		boolean isRaining= true; // �� ���°�?
		boolean mightRain= false; // �� �� ���� �ִ°�?
		boolean haveUmbrella= false; // ����� ������ �ֳ�?
		// ù��°
		if((isRaining || mightRain) && haveUmbrella) {
			System.out.println("����� ����.");
		} else {
			System.out.println("����� ���� �ʴ´�.");
		}
		
		// �ι�°
		boolean rainCheck= isRaining || mightRain;
		
		if(rainCheck && haveUmbrella) {
			System.out.println("����� ����.");
		} else {
			System.out.println("����� ���� �ʴ´�.");
		}
	}

}
