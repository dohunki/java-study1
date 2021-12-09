package list_Interface_3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timing_list {

	public static void main(String[] args) {
		// ��̸������ ��ũ����Ʈ�� ����ð�
		List<Integer> arrayList= new ArrayList<>();
		List<Integer> linkedList= new LinkedList<>();
		long duration= timeOperations(linkedList);
		System.out.println("�����ð� : "+ duration);
		long duration2= timeOperations(arrayList);
		System.out.println("�����ð� : "+ duration2);
		// �Ϲ����� ������� �Է��� ��̸���Ʈ��  �� ������.
		// Ư�� �ε��� ��ȣ�� �Է��̳� ���Ŵ� ��ũ�� ����Ʈ�� �ξ� �� ����
		
//		// �ð�üũ �ϴ� ��
//		long time1= System.currentTimeMillis(); // ����ð��� 1/1000�ʷ� ����
//		System.out.println(time1);
//		// ����Ʈ �����ϰ�
//		for(int i= 0; i< 10000; i++) {
//			System.out.println(i);
//		}
//		long time2= System.currentTimeMillis(); // ����ð��� 1/1000�ʷ� ����
//		System.out.println(time2-time1); // �ɸ��ð�
	}
	public static long timeOperations(List<Integer> list) {
		long start= System.currentTimeMillis(); // �ð�����
		
//		for(int i= 0; i< 100000; i++) {
//			list.add(i); // 0���� 10��-1 ���� ����Ʈ�� �ϳ��� �Է�
//		}
		
		for(int i= 0; i< 100000; i++) {
			list.add(0, i); // 0���� 10��-1 ���� ����Ʈ�� �ϳ��� �Է�
		}
		return System.currentTimeMillis() - start; // ����ð� ����
	}
}
