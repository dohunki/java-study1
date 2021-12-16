package operators_2;

public class AND_OR {

	public static void main(String[] args) {
		// ��Ʈ and or ����
		int v1= 0b01010011;
		int v2= 0b11010110;
		
		int result1= v1 & v2; // and ��Ʈ����
		System.out.println(tBinary(v1));
		System.out.println(tBinary(v2));
		System.out.println(tBinary(result1));
		
		System.out.println("=========");
		int result2= v1 | v2; // or ��Ʈ����
		System.out.println(tBinary(v1));
		System.out.println(tBinary(v2));
		System.out.println(tBinary(result2));
	}
	
	public static String tBinary(int value) { // ������ ���ڿ��� ���!
		// String.format�� printfó�� ����ϸ� ���ڿ��� ���ϵȴ�.
		return String.format("%10s", Integer.toBinaryString(value)).replace(" ", "0");
		// "%10s" : 10�ڸ�,  replace(" ", "0") : ������ 0���� ä����
	}

}
