package test_2;

public class ternaryCondition { // ���� ���� ������

	public static void main(String[] args) {
		// ����? A : B  (������ ���̸� A �ƴϸ� B �̴�.)
		System.out.println(true? "��":"�ƴ�");
		System.out.println(false? "��":"�ƴ�");
		
		int n= 99;
		n= n> 100? 100 : n; // 100���� ũ�� 100 ���, �ƴϸ� n ���
		System.out.println(n); 
		
		int[] values= {6, 3, 92, 64, 17};
		
		// for�� �̿�
		int max= 0; // �ִ�
		for(int val : values) {
			if(val > max) {
				max= val; // �ִ񰪺��� val�� ũ�� val���� �ִ񰪿� �ִ´�.
			}
		}
		
		// ���׿����� �̿�
		int min=100; // �ּڰ�
		for(int val : values) {
			min= val< min? val : min;	
		}
		System.out.println(max);
		System.out.println(min);

	}

}
