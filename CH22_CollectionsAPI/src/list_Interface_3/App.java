package list_Interface_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
	// ����Ʈ �������̽�		
		// ��� ����Ʈ
		List<Integer> list1= new ArrayList<>();  // ���
		list1.add(5);
		list1.add(7);
		list1.add(8);
		// ��ũ�� ����Ʈ
		List<Integer> list2= new LinkedList<>();  // ���
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		displayList(list1); // �ֿܼ� �Էµ� ����ƮŸ�� ��ü�� �����۵��� ���
		System.out.println();
		displayList(list2);
		System.out.println();
		
		List<Integer> list3= new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		displayList(list3);
	}
	/**
	 * �޼��� ���� �ּ�, �޼��� ���� Ŀ���� �ø��� ������ ���.
	 * �Էµ� ����ƮŸ�� ��ü�� �����۵��� ���
	 * @param list
	 */
	private static void displayList(List<Integer> list) {
		// TODO Auto-generated method stub
		// �Էµ� ����ƮŸ�� ��ü�� �����۵��� ���
//		list.forEach(System.out::println); // �Ʒ��� ������ ��� ���
		for(int i : list) {
			System.out.println(i);
		}
	}

}
