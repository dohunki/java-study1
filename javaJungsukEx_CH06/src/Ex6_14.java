
public class Ex6_14 {
	static { // Ŭ���� �ʱ�ȭ �� 
		System.out.println("static { }"); // (1)
	}
	
	{ // �ν��Ͻ� �ʱ�ȭ �� : ���� ����� ���� ����
		System.out.println("{ }"); // (3) (6)
	}
	
	public Ex6_14() {
		System.out.println("������"); // (4) (7)
	}

	public static void main(String[] args) {
		System.out.println("Ex6_14 bt= new Ex6_14();"); // (2)
		Ex6_14 bt= new Ex6_14(); // (3),(4)
		
		System.out.println("Ex6_14 bt2= new Ex6_14();"); // (5)
		Ex6_14 bt2= new Ex6_14(); // (6),(7)
	}
	
	/*
	 * -Ex6_14�� �޸𸮿� �ε��� ��, Ŭ���� �ʱ�ȭ ���� ���� ���� ����Ǿ� static{}�� ��µȴ�.
	 *  �� ���� main�޼��尡 ����Ǿ� Ex6_14�� �ν��Ͻ��� �����Ǹ鼭 �ν��Ͻ� �ʱ�ȭ ���� ���� ����ǰ�,
	 *  ������ �����ڰ� ����ȴ�.
	 * -Ŭ���� �ʱ�ȭ ���� ó�� �޸𸮿� �ε��� �� �ѹ� �� ���������, �ν��Ͻ� �ʱ�ȭ ���� �ν��Ͻ��� 
	 *  ������ ������ ����ȴ�.
	 */
}
