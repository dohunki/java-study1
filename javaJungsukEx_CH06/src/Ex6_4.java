
public class Ex6_4 {
	/*
	 �ݺ������� ����Ǵ� ���� ������ �޼���� �ۼ�
	 �ϳ��� �޼���� �� ���� ��ɸ� �����ϵ��� �ۼ�
	 ��ȯŸ�� �޼����̸�(����Ÿ�� ������, ����Ÿ�� ������, ...) {	 // �����
	         �޼��� ȣ��� ����� �ڵ� 					 // ������
	 }
	 �ʿ��� ���� ������ŭ ������ �����ϸ� �� ���� ���� ������ ��ǥ','�� �Ѵ�.
	 �� ������ Ÿ���� ���Ƶ� ������ Ÿ���� ������ �� ����.
	 ������ ������ ������ �迭�̳� ���������� ����ϰ�, ���� �Է¹��� �ʿ䰡 ������ ()�ȿ� �ƹ� �͵� ���� �ʴ´�.
	 �޼����� ���(���)�� ��ȯ���� Ÿ���� ��ȯŸ���̰�, ��ȯ���� ������ void�� ����� �Ѵ�.
	 �޼����� ��ȯ���� void�� �ƴ� ��� ������{}�ȿ� 'return ��ȯ��;'�� �ݵ�� ���ԵǾ� �־�� �Ѵ�.
	 �޼��� ���� ����� ������ ���������� �ϰ�, ���� �ٸ� �޼��忡���� ���������� �̸��� ���Ƶ� �������.
	 �޼��� ȣ���� //�޼����̸�(��1, ��2, ..); //�� �ϰ� ����� �Ű������� ������ Ÿ��(�ڵ�����ȯ ����)�� ���ƾ� �Ѵ�.
	*/
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L); // ����1:�޼���� ����.   ����3: long result1= 8�� ����ȴ�.
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
 }

 class MyMath {
	long add(long a, long b) { // ����2: a=5, b=3�� �����Ͽ� �����ΰ� ����ȴ�.
		long result = a + b;
		return result; // result=8�� '����3'���� ���� ����ȴ�.(�۾��� ��ġ�� ȣ���� ������ ���ư���.)
	//	return a + b;	// ���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
	}	
		// ��� �޼��忡�� �ݵ�� ��� �ϳ��� return���� �־�� �Ѵ�.
		// ��ȯŸ���� void�� ���� �����Ϸ��� �޼��� �������� 'return;'�� �ڵ������� �߰��� �־���. 
	
	long subtract(long a, long b) { return a - b; } // �޼���
	long multiply(long a, long b) { return a * b; } // �޼���
	double divide(double a, double b) { // �޼���
		return a / b;
	}
	// �޼���� Ŭ���� �������� ����
 }

