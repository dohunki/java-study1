package test_2; // �׽�Ʈ�� ��Ű��

import java.util.Random;

import application_1.RandomWord; 
// �ٸ� ��Ű���� �ִ� ���� �ҷ��� ���� import���� �ʿ�(ctrl+space�� �ڵ� ȣ��)

public class Test {

	public static void main(String[] args) {
//		RandomWord r= new RandomWord();
//		r.getWords();
//		System.out.println(r.toString());
		
		// �������� �ܾ �������� ���?
		Random random= new Random();
		
		String[] words= {"���", "�����", "���̾�", "����", "��"};
		
		for(int i= 0; i< 100; i++) {
			int randomIndex= random.nextInt(words.length);
			System.out.println(words[randomIndex]);
		}
		
	}

}
