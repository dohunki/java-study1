package game_2.objects_3;

public class GameObject {
	private int id; // ���̵�
	private String name; // �̸�
	
	// �ڵ� ���� ����Ͽ� ����
	protected int getId() { // ���̵� ������ ����� Ŭ���������� ���
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override  // ���� Object�� toString�޼���� �ּڰ��� ��Ÿ���µ� �޼��� �������̵� ��
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	}
	
	
}
