package application_1_1;

import java.util.Random;

public class RandomWord {
	// �����̽��ٷ� ����� �ܾ���� ���ڿ��� str�� ����
	private String str= "disability artificial environment bulletin achievement insurance motivation invisible spectrum foreigner training original confrontation threaten definite transform overview indication tolerate folklore offender precision decorative sacrifice tradition concrete different survival sandwich departure industry basketball motorist discovery principle adoption mosquito freighter abstract implicit instinct producer reinforce presentation automatic accessible vegetarian unpleasant cucumber excavation";
			
	private String[] words= str.split(" "); // ���ڿ��� �������� �߶� �迭�� �ܾ�� �Է�
	
	private String selectWord; // �������� ������ �ܾ�
	private char[] characters; // ���� �迭
	Random random= new Random();
	
	public RandomWord() {
		// �����ڿ� ���� �ܾ ����
//		selectWord= words[0]; // �ܰ�1.
		
//		int randomIndex= random.nextInt(words.length);
//		selectWord= words[randomIndex]; // �ܰ�1. �������� ���� ����
		//���� �� ���� �Ʒ� �� �ٷ�
		selectWord= words[random.nextInt(words.length)]; // �ܰ�1. �������� ���� ����

		// �ܾ _�� ����Ѵ�.
		characters= new char[selectWord.length()]; // ���ôܾ��� ���̸�ŭ ���ڹ迭 ũ��� ����
		
	}
	
	public void getWords() { // ���� words�迭�� �ִ� ��ü �ܾ ���
		for(String w : words) {
			System.out.println(w);
		}
	}
	
	public String toString() {
		// �ܾ _�� ����Ѵ�.
//		String text= " ";
		
		// text�� ǥ���Ǵ� �κ��� StringBuilder�� ����
		StringBuilder sb= new StringBuilder();
		
		for(char c : characters ) {
//			if(c== '\u0000') { // �������� �ʱⰪ�� \u0000 �̴�. ����('')�� �ʱ갪�̸� ���� ������ ���� ����
////				text +='_'; 
//				sb.append('_');
//			} 
//			else {
////				text += c; // ���� ������ ��� �� ö�ڸ� �ִ´�.
//				sb.append(c);
//			}
			// if~else�� ��� ���� �����ڷ� ��ü�ϸ� �ڵ尡 ª������.
			sb.append(c== '\u0000'? '_' : c); 

			//			text += ' '; // ö�ڸ� �� ĭ�� ����(�����̽���)
			sb.append(' ');
			
		}
		// text�� ǥ���Ǵ� �κ��� StringBuilder�� ����
		
//		System.out.println(selectWord); // �������(�׽�Ʈ��)
////		return selectWord; // ���õ� ���� �ܾ ������, Hangman�� 10�� 26������ ��ü��
		// �ܾ _�� ����ϱ� ���ؼ� ������ �Ʒ��ٷ� ����
//		return text; // ���õ� �����ܾ ������
		return sb.toString(); //���õ� �����ܾ ������

	}

	public void addGuess(char c) {
		// �Ѿ�� ���ڸ� �˻��ؼ� ���� �ܾ ������ characters �迭�� ����
		for(int i= 0; i< selectWord.length(); i++) { // �ܾ� ���̸�Ŭ �ݺ�
			if(c== selectWord.charAt(i)) {
				characters[i]= c;
			}
		}
	}
	
	public boolean isCompleted() {
		// ö�ڸ� �� �������� üũ�ؼ� true or false�� ����
		for(char c : characters ) { // �ܾ� ��ü ö�� �ݺ��˻�
			if(c== '\u0000') { // 
				return false; // ���� ������ ��  ���ڰ� �ֹ�
			}
		}
		return true; // �� ������
			
			
	}
}
