package application_1_1;

public class Cat {
	private String name; // �̸�
	// ����ƽ ���
	public static final String FOOD= "����� ���";
	// ����ƽ ���
	public static int count= 0; // �ʱⰪ 0
	public Cat(String name) {
		this.name= name;
		count++;
	}	
	public static int getCount() {
		// ����ƽ�޼���� �Ϲ� �ν��Ͻ�(��ü)���� ���Ұ�
		// String s= name; ��ü�� ��������� ���� ��밡���ϹǷ� �ν��Ͻ� ������ ����� ���� ����.
		return count; // ����ƽ������ ����� �� �ִ�.
	}
		
	@Override
	public String toString() {
		return "Cat [�̸�="+ name+ "]";
	}
	
}
