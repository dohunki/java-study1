package constructorsParameter_10;

public class App2 {

	public static void main(String[] args) {
		// ������ : Ŭ������ Ư���� �޼ҵ�
		Person p1= new Person("���", 120.0);
		Person p2= new Person("�浿", 172.5);
		Person p3= new Person("���̿�", 165.5);
		
		System.out.printf("�̸� : %s , Ű : %.1f %n", p1.getName(), p1.getHeight());
		System.out.printf("�̸� : %s , Ű : %.1f %n", p2.getName(), p2.getHeight());
		System.out.printf("�̸� : %s , Ű : %.1f %n", p3.getName(), p3.getHeight());
		

	}

}
