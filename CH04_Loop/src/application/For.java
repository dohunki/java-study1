package application;

public class For {

	public static void main(String[] args) {
		// for �ݺ���
		// for(�ʱⰪ; ����; ����) {��ɹ�;}
		for (int i=0; i < 10; i++) {
			System.out.println("i= "+ i);
		}
		
//		for (int ; ; ) { // ���ѹݺ�
//			System.out.println("Hello");
//		}
		
		// for �ݺ����� ����Ͽ� 1���� 100���� ���� ����Ͽ���.
		int sum= 0;
		for(int j=1; j<=100; j++) {
			sum+= j;					
		}
		System.out.println("sum= "+ sum);

	}

}
