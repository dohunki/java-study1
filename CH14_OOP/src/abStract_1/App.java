package abStract_1;

public class App {

	public static void main(String[] args) {
		// �߻�Ŭ����
//		GameObject objs= new GameObject(); // �߻�Ŭ������ ��ü�� ����� ����.
		GameObject[] objs= {new Player(), new Monster()};
		
		for(GameObject ob : objs) {
			System.out.println(ob);
			ob.describe(); // ������ �߻� �޼���
		}

	}

}
