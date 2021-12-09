package hashSet_union_intersection_9;

import java.util.HashSet;

public class App { // �����հ� ������
	public static void main(String[] args) {
		HashSet<String> list1= new HashSet<>();
		
		list1.add("���");
		list1.add("��");
		list1.add("����");
		list1.add("����");
		
		HashSet<String> list2= new HashSet<>();
		
		list2.add("ü��");
		list2.add("��");
		list2.add("���");
		list2.add("������");
		
		HashSet<String> union= new HashSet<>(list1); // ������, ó�� ������ ����Ʈ1�� �Է��� ����
		union.addAll(list2); // ����ũ1 + ����Ʈ2 (�ߺ��������� �ѹ� ��, �������� ����)		
		union.forEach(System.out::println);
		
		System.out.println();
		
		HashSet<String> intersection= new HashSet<>(list1); // ������, ó�� ������ ����Ʈ1�� �Է��� ����
		intersection.retainAll(list2); // ����Ʈ2���� �ߺ��Ǵ� �͵鸸 ����		
		intersection.forEach(System.out::println);
		
		System.out.println();
		
		HashSet<String> minus= new HashSet<>(list1); // ������, ó�� ������ ����Ʈ1�� �Է��� ����
		minus.removeAll(list2); // ����Ʈ1���� ����Ʈ2�� �ߺ��Ǵ� �͵鸸 ����		
		minus.forEach(System.out::println);
		
	}
}
