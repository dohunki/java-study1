package application_1_2;

public class Cat {
	private String name; // �̸�
	private int id;
	// ����ƽ ���
	public static final String FOOD= "����� ���";
	// ����ƽ ���
	public static int count= 0; // �ʱⰪ 0
	
	public Cat(String name, int id) {
		this.name = name;
		this.id = id;
		count++;
		id= count; //��ü�� ������� ������ ī��Ʈ ��
	}
	
	public static int getCount() {
		// ����ƽ�޼���� �Ϲ� �ν��Ͻ�(��ü)���� ���Ұ�
		// String s= name; ��ü�� ��������� ���� ��밡���ϹǷ� �ν��Ͻ� ������ ����� ���� ����.
		return count; // ����ƽ������ ����� �� �ִ�.
	}

	public String toString() {
		return "Cat [�̸�="+ name+ ", id="+ id+ "]";
	}


}
