package application_1;

import java.util.Random;

public class Hangman {

	private boolean running= false; // ������ ��� ����?
	// running=true�̸� �ݺ�����, running=false�̸� �� ���� �����ϰ� ����
	
	private RandomWord word= new RandomWord();
	
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
		System.out.println("ö�� �ϳ� �Է�");
		
	}
	
	private void checkUserInput() {
		System.out.println("�´��� üũ");
		
	}

}
