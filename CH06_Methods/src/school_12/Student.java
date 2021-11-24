package school_12;

public class Student {
	private String name;
	private int age;
	private boolean visible; // ��ü true, ���� false
	private double temperature; // �µ�üũ
	
	// ������ �ڵ��ϼ� ���
	// ���콺 ��Ŭ��, Source -> Generate Constructor using Fields
	public Student(String name, int age) {
		visible= true;
		temperature= 0.0;
		this.name = name;
		this.age = age;
	}
	
	// toString �޼��� �ڵ��ϼ�
	// ���콺 ��Ŭ��, Source -> Generate toString()
	@Override
	public String toString() {
		return "�л� [�̸�=" + name + ", ����=" + age + ", ��ü=" + visible + ", �µ�=" + temperature + "]";
	}
		
	// �ڵ��ϼ� ������� getter setter �޼��� �ϼ�
	// ���콺 ��Ŭ��, Source -> Generate Getter and Setter ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	
	
	
	
	

}
