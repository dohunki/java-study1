package JavaJungsukCh_6;
	// �޼��� �տ� static�� �پ� ������ Ŭ�����޼����̰� �پ� ���� ������ �ν���Ʈ �޼����̴�.
class MyMath2 {
	long a, b; // �ν��Ͻ� ����(iv): Ŭ���� ��ü���� ���

	// �ν��Ͻ� ���� a, b���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����.
	long add()		{ return a + b; }  // �ν��Ͻ� �޼���(iv�� ���) a, b�� �ν��Ͻ� ����
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }

	// �ν��Ͻ� ������ ������� �Ű����������� �۾��� �����ϴ�.
	static long   add(long a, long b)		 { return a + b; }  // a, b�� ��������(iv�� ������� �ʴ´�.)
	// lv: ����� ��ġ���� �޼��� ����ð����� ��ȿ
	static long   subtract(long a, long b)   { return a - b; }
	static long   multiply(long a, long b)   { return a * b; }
	static double divide(long a, long b) { return a / (double)b; }
}

	/* static �޼���(Ŭ���� �޼���)
	 * 		iv ���Ұ�, �ν��Ͻ� ���(iv, im)�� ���þ��� �۾�
	 * 		��ü �������� //Ŭ�����̸�.�޼����̸�()// ���� �۾�(ȣ��)
	 * �ν��Ͻ� �޼���
	 * 		iv ��밡��, �ν��Ͻ� ���(iv, im)�� ���õ� �۾�
	 * 		�ν��Ͻ� ���� �� //��������.�޼����̸�()// ���� �۾�(ȣ��)
	 */
public class javaJungsukEx6_9 {
	public static void main(String args[]) {
		// Ŭ���� �޼���(iv�� ������� ���� ��) ȣ��. �ν��Ͻ�(��ü) �������� ȣ�Ⱑ��
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));

		MyMath2 mm = new MyMath2(); // �ν��Ͻ��� ����
		mm.a = 200L; // ���� a, b�� �ν��Ͻ� ����(iv)
		mm.b = 100L;
		// �ν��Ͻ� �޼���� ��ü���� �Ŀ��� ȣ���� ������.
		System.out.println(mm.add()); // mm�� ��������, �ν��Ͻ� �޼��� ȣ��
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
   }
}

