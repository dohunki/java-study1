package operators_2;

public class SHIFT {

	public static void main(String[] args) {
		// ��Ʈ SHIFT >>, << ����
		int value= 0b00010001;
		System.out.println(tBinary(value));
		int result1= value << 3;
		System.out.println(tBinary(value));
		int result2= result1 >> 3;
		System.out.println(tBinary(value));

		System.out.println(100 << 3);  // 2^n(�ŵ�����)���� ���� ��
		System.out.println(400 >> 4);  // 2^n(�ŵ�����)���� ���� ��
	}
	
	public static String tBinary(int value) { 
		
		return String.format("%10s", Integer.toBinaryString(value)).replace(" ", "0");
		
	}

}
