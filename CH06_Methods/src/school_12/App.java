package school_12;

public class App {

	public static void main(String[] args) {
		// �л� ��ü �����
		Student s1= new Student("���", 7);
		Student s2= new Student("�浿", 37);
		Student s3= new Student("���̿�", 17);
		Student s4= new Student("Ÿ�̰�", 27);
		
		s1.setVisible(false); // ���, ����, �µ����� ����
		s2.setTemperature(35.5); // �浿, ��ü, �µ� 35.5
		s3.setTemperature(36.5); // ���̿�, ��ü, �µ� 36.5
		s4.setVisible(false); // Ÿ�̰�, ����, �µ����� ����
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		

	}

}
