package try_catch_finally_8;

public class Person {
	private String name;
	public void setName(String name) throws Exception {
		if(name== null) {
			throw new Exception("�̸��� �ΰ��� �Է��� �� �����ϴ�.");
		}
		this.name= name;
		System.out.println("�̸��� "+ name);
	}
}
