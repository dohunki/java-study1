package casting_4;

public class HouseCat extends Cat{
	
	@Override // ������̼� 
	public void vocal() { // �������̵� �޼���: �ڽ�Ŭ�������� �θ�� �Ȱ��� �޼��� ����
		System.out.println("�̾߿�~");
	}
	public void call() { // �Ͽ콺Ĺ�� ���� �޼���
		System.out.println("���縦 �θ���~");
	}
}
