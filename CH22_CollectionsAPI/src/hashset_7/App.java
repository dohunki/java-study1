package hashset_7;

import java.util.HashSet;

public class App {
	public static void main(String[] args) {
		// �� Ÿ���� �ߺ��� �ȵǰ� ������ ����(�ε��� ����)
		HashSet<String> fruits= new HashSet<>();
		
		fruits.add("���");
		fruits.add("�ٳ���");
		fruits.add("������");
		fruits.add("������");
		fruits.add("��");
		fruits.add("���");
		fruits.add("���");
		
		System.out.println(fruits.contains("������"));
		System.out.println(fruits.contains("��"));		
		// contains(A) : A�� ������ true, ������ false
		
		for(String f : fruits) {
			System.out.println(f);
		}
	}
}
