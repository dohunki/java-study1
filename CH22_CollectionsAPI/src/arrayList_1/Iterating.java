package arrayList_1;

import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>(); // ����Ÿ�� ����Ʈ ����
		// ����Ʈ�� ���� �߰�(add�� ����)
		list.add(7);
		list.add(9);
		list.add(123);
		
		// get(�ε�����ȣ)�� ����
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		 
		// �ݺ��� ��� for each�� : �����ϰ� ���
		for(Integer n : list) {
			System.out.println(n);
		}
		
		// for �ݺ��� : �ε��� ��ȣ�� �ʿ��� ��!
		for(int i= 0; i < list.size(); i++) {
			Integer n= list.get(i);
			System.out.println("list["+ i+ "]"+" : "+ n);
		}
		
		// �÷��ǰ�ü.forEach(���� �ݺ�), ���ٽ�
		list.forEach(e -> System.out.println(e));
		
		// �޼��� ���۷���
		list.forEach(System.out::println);

	}

}
