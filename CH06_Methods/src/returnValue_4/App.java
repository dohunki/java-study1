package returnValue_4;

public class App {
	public static void main(String[] args) {
		// ���ϰ��� �ִ� �޼��� ��� 
		ReturnMethod r1= new ReturnMethod();
		
		String cat= r1.getAnimal();
		// �Լ� r1.getAnimal(); �� ����(sop�� �ϴ� ����)�ϰ� ���ϰ��� cat�� ���� 
				
		System.out.println("Ĺ ������ : "+ cat);

	}

}
