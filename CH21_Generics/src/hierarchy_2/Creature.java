package hierarchy_2;

public class Creature { 
	// �ʵ� ����, �ν��Ͻ� ����
	private String name;
	// ������
	public Creature(String name) {
		this.name= name;
	}
	// toString�޼���
	public String toString() {
		return name;
	}
	// feed �޼���
	public void feed() {
		System.out.println("�Դ´�...");
		
	}

}
