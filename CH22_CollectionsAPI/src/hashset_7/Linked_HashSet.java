package hashset_7;

import java.util.LinkedHashSet;

public class Linked_HashSet {
	public static void main(String[] args) {
		// ��ũ���ؽü��� �ߺ��� �ȵǰ� �Էµ� ������� ��µ�
		LinkedHashSet<String> fruits2= new LinkedHashSet<>();
		
		fruits2.add("���");
		fruits2.add("�ٳ���");
		fruits2.add("������");
		fruits2.add("������");
		fruits2.add("��");
		fruits2.add("���");
		fruits2.add("���");
		
		System.out.println(fruits2.contains("������"));
		System.out.println(fruits2.contains("��"));		
		// contains(A) : A�� ������ true, ������ false
		
		for(String f2 : fruits2) {
			System.out.println(f2);
		}
	}

}
