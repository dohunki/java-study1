package application_1_1;

import java.util.Scanner;

public class Hangman {

	private boolean running= true; // ������ ��� ����?
	// running=true�̸� �ݺ�����, running=false�̸� �� ���� �����ϰ� ����
	
	private RandomWord word= new RandomWord();
	
	private Scanner scanner= new Scanner(System.in);
	
	
	// ���α׷��� �����ϴ� �� �޼ҵ�
	public void run() {
		do {
			displayWord();    // ȭ�鿡 �ܾ�ǥ�� _ _ _ _ �� ǥ��
			getUserInput();   // ö�� �ϳ��� �Է¹���
			checkUserInput(); // �´��� üƮ (���� ������ running= false)
		}while(running);
	}
	
	
	private void displayWord() {
//		System.out.println("ȭ�鿡 �ܾ� ǥ��");
		// ���� ���� ��ü�� ������ �������� �� �ܾ ����Ѵ�.
		// �ܰ�2. ���� ���� ��ü�� ������ �������� �� �ܾ ����Ѵ�.
		
		System.out.println(word.toString());	
	}
	
	private void getUserInput() {
		// �������� �� ���� �Է� �䱸
		// �Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ�
		// RandomWord ��ü�� ����( addGuess(����) �޼��带 ������)
		System.out.println("�� ���� �Է� : ");
		String guess= scanner.nextLine(); // �Է¹��� ���ڿ��� guess�� ����
		// �ܾ�� �Է¹��� ���ڰ� �ִ��� Ȯ���ؼ� ó���Ѵ�.(�ܾ�� RandomWord ��ü word�� ���)
		word.addGuess(guess.charAt(0)); //ù��° ���ڸ� �Է�
	}
	
	private void checkUserInput() {
		System.out.println("�´��� üũ");	
		// ������ �ܾ �� �������� üũ�ؼ� ������ ����
		// ���� ���� Ȯ���� �ϴ� �޼��� isCompleted�� RandomWord Ŭ������ �����
		if(word.isCompleted()) {
			System.out.println("�� �������");
		}
	}
	
	/**
	 * ��ĳ�ʸ� �ݴ� �޼���
	 * �̰��� �̿��ϸ� close() �޼��忡 hover�� '��ĳ�ʸ� �ݴ� �޼���'��� ������ ���.
	 */
	public void close() {
		scanner.close();
	}
}
