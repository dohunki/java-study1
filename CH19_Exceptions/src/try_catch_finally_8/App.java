package try_catch_finally_8;

public class App {

//	public static void main(String[] args) throws Exception {
	public static void main(String[] args)  {

		Person p1= new Person();
		
		try {
			p1.setName(null);
//			p1.setName("���");			
			System.out.println("���� �߻��� ����� ����ȵ�");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// ����� ���� �߻����ο� ������� �ݵ�� �����
			System.out.println("finally ������ ����");
		}
		
		System.out.println("���α׷� ����");

	}

}
