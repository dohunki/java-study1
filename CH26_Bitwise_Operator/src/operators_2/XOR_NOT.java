package operators_2;

public class XOR_NOT {

	public static void main(String[] args) {
		// ��Ʈ XOR, NOT ����
		int v1= 0b01010011;
		int v2= 0b11010110;
		
		int result1= v1 ^ v2; // XOR ��Ʈ���� : ������ 0, �ٸ��� 1
		System.out.println(tBinary(v1));
		System.out.println(tBinary(v2));
		System.out.println(tBinary(result1));
		
		System.out.println("=========");
		// NOT ��Ʈ���� : 1�� 0����, 0�� 1�� ��ȯ
		System.out.println(tBinary(~v1));
		System.out.println(tBinary(~v2));
		System.out.println(tBinary(~result1));
	}
	
	public static String tBinary(int value) { // ������ ���ڿ��� ���!
		// String.format�� printfó�� ����ϸ� ���ڿ��� ���ϵȴ�.
		return String.format("%10s", Integer.toBinaryString(value)).replace(" ", "0");
		// "%10s" : 10�ڸ�,  replace(" ", "0") : ������ 0���� ä����
	}

}
