package windowProgramming_8;

public class App {

	public static void main(String[] args) {
		// ������ ��ü�� ����
		// set �޼ҵ�� ���� �Է��ϰ� get �޼ҵ�� ���� ����϶�.
		// ���� ������â�� ���α��� 300, ���α��� 600
		// ���� ���̵��� true, top 200, left 400
		
		Window w1= new Window(); 
		// WindowŬ���� Ÿ���� �������� w1 ����(class���� Window, ������ w1)
		// Window�ν��Ͻ� ���� ��, ������ Window�ν��Ͻ� �ּҸ� w1�� ����
		// �ڹ��� ���� 165�� ����

		w1.setWidth(300); 
		// Window�ν��Ͻ��� ������� Width�� ���� 300���� �Ѵ�.
		System.out.println("���� ���� : "+ w1.getWidth());
		
		w1.setHeight(600);
		System.out.println("���� ���� : "+ w1.getHeight());

		w1.setIsVisible(true);
		System.out.println("���� ���� : "+ w1.getIsVisible());

		w1.setTop(200);
		System.out.println("��ġ top : "+ w1.getTop());

		w1.setLeft(400);
		System.out.println("��ġ Left : "+ w1.getLeft());


	}

}
