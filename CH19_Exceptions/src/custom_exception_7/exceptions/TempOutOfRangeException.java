package custom_exception_7.exceptions;
// Exception�� ��ӹ޾Ƽ� 
public class TempOutOfRangeException extends Exception {
	private static final long serialVersionUID= 1L;
	
	public TempOutOfRangeException(String message) {
		super(message); // �Էµ� �޼����� �� ���� ��ü ����
	}
}
