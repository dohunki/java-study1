package application;

public class StringArray2 {

	public static void main(String[] args) {
		// ���ڿ��� ���� �ڷ���, ��������(reference variable)�� �ּڰ��� ������.
		// ���ڿ��� ũ�⸦ �� ���� �����Ƿ� 
		String text= null; // null���� �ּڰ��� ���ٴ� ��
		// int x= null; �⺻ �ڷ������� null���� �ԷºҰ�(null���� �ּҰ� ���ٴ� ��)
		text= new String("��ο�");
		// text= "��ο�";
		
		// int�� 4byte�� ������ �ֹǹǷ� int x= 10; �� ǥ�� ����������,
		// String�� ũ�⸦ �� �� �����Ƿ� String text= "��ο�"; �� ǥ������ �ʴ´�.
		
		System.out.println(text);
		
		String[] texts= null;
		System.out.println(texts);
		texts= new String[3]; // �迭 ���ڿ� 3ĭ�� ���� �����ؼ� texts�� �ּ��Է�
		System.out.println(texts);
		System.out.println(texts[0]);
		
		texts[0]= new String("����!");
		texts[1]= "�ȳ�?";
		texts[2]= "�¹���!";
		
		for(String w : texts) {
			System.out.println(w);
		}
		

	}

}
