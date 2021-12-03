package enum_Constructor_3;

public enum Fruit { // keyword�� enum
	APPLE("�ʷ�"), BANANA("���"), ORANGE("��Ȳ"); // ������� ���� (0, 1, 2 �ε��� ��ȣ)
	
	// enum ������
	private String color;
	
	Fruit(String color) {
		this.color= color;
	}
	
	public String toString() {
		return super.toString().toLowerCase()+ " ("+ color+ ")"; // LowerCase�� �ҹ��ڷ� ����� ���̴�.
	}

}
