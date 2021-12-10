package java_Api;

import java.util.Random;

public class Ex_2 {

	public static void main(String[] args) {
		// ��ü����
		LottoMachine machine= new LottoMachine();
		
		// �ζǹ�ȣ ��������
		int[] numbers= machine.getLottoNumbers();
		
		// ��� ���
		System.out.print("���� ��ȣ: ");
		for(int i : numbers) {
			System.out.printf("%d ", i);
		}
	}
}

class LottoMachine {
	// �ʵ�
	private int[] LottoNumbers;
	
	// ������
	public LottoMachine() {
		//2.�޼��带 �̿��Ͽ� �ζǹ�ȣ ���� �ʱ�ȭ
		LottoNumbers= generate();
	}
	
	//�޼���
	public int[] generate() {
		int[] pickedNumbers= new int[6];
		Random rand= new Random();
		
		// 1.������ ���� 6���� �����ϼ���
		for(int i=0; i<pickedNumbers.length; i++) {
			pickedNumbers[i] = rand.nextInt(45)+1;
		}
		return pickedNumbers;
	}
	
	//3.������ �ζǹ�ȣ�� �������� get�޼��带 ����ÿ�.
	
	public int[] getLottoNumbers() {
		return LottoNumbers;
	}
}