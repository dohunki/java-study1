package numbering_1;

public class App {

	public static void main(String[] args) {
		/*
		 * 10���� decimal 		0���� 9����
		 * 2����  binary  		0���� 1����
		 * 16���� hexadecimal 	0���� F����
		 * 
		 * 0 1 2 3 4 5 6 7 8 9 10 11 ...
		 * 0 1 10 11 100 ...
		 * 0 1 2 3 4 5 6 7 8 9 A B C D E F 10 11 ...
		 */
		
		int val= 123;		
		System.out.println(Integer.toBinaryString(val)); // 10���� ������ 2������ ǥ��
		System.out.println(Integer.toHexString(val)); // 10���� ������ 16������ ǥ��
		
		System.out.println("=====");
		// 16������ ���ͷ�(��) ǥ���� �� 0x	, �������� 0b�� ���� ����
		// 8bit�� 1byte�̰� 1byte�� ǥ���� �� �ִ� ���� ū���� 255�̴�.
		// 1byte�� ��ȣ 1bit ���� 7bit�� -128���� 127���� ǥ�ð���
		int value2= 0xFF;
		System.out.println(Integer.toBinaryString(value2));
		System.out.println(Integer.toString(value2));
		
		System.out.println("=====");
		int value3= 0b1101101;
		System.out.println(Integer.toString(value3));
	}

}
