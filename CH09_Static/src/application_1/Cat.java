package application_1;

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
	public int getCount() {
		return count;
	}
		
	@Override
	public String toString() {
		return "Cat [�̸�="+ name+ "]";
	}
	
}
