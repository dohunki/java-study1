package string_array_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
	// ����Ʈ�� ���  .streams()
	// ����Ʈ�� �ƴҰ�� 1. Stream.of(1, 2, 3) ��������Ʈ��  Stream.of("�ϳ�", "��") ���ڿ���Ʈ��
	// 				2. �迭�� ��� Array.stream(�迭�Է�)
		
		Stream.of("Hello", "Bottle", "Africa")
			.sorted()		// ���� : ���ĺ���
			.findFirst()	// ù��°
			.ifPresent(x -> System.out.println(x));
		
		System.out.println("====");
		Stream.of()
		.sorted()		// ���� : ���ĺ���
		.findFirst()	// ù��°
		.ifPresent(x -> System.out.println(x));
		
		System.out.println("====");
		String[] items= {"ġŲ", "������", "����", "ġ��", "����", "ġ��", "�����"};
		Stream.of(items)
			.filter(s -> s.startsWith("ġ")) // filter�� ���̸� ����� �����̸� �����Ѵ�.
			.forEach(x -> System.out.print(x+ ", "));
		
		System.out.println("====");
		int[] numbers= {2, 4, 6, 8, 10};
		Arrays.stream(numbers)
			.map(n -> n*n)	// ����
			.average()		// ���, max(), min()
			.ifPresent(n -> System.out.println(n));
		
		System.out.println("====");
		// �迭�� ����Ʈ��
		List<String> list= Arrays.asList(items);
		list.stream()
			.filter(x -> x.startsWith("��")) // "��"�� �����ϴ� ���ڿ�
			.sorted()						// ����
			.forEach(x -> System.out.print(x+ ", "));
		
		System.out.println("====");
		int[] nums= {9, 4, 6, 3, 1, 2, 7};
		Arrays.stream(nums)
			.filter(n -> n> 3) 
			.sorted()	
			.map(s -> s* 10)
			.forEach(n -> System.out.print(n+ ", "));
		
	}

}
