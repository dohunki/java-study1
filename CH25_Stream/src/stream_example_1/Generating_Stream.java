package stream_example_1;

import java.util.stream.Stream;

public class Generating_Stream {

	public static void main(String[] args) {
		// Stream.of
		Stream.of(1, 2, 3).forEach(n -> System.out.println(n));
		Stream.of("�ϳ�", "��", "��").forEach(s -> System.out.println(s));
		
		System.out.println();
		// generate�޼���� ()���� ���� ����� ��Ʈ���� �����Ѵ�. �̶� ���Ѵ�� �����ϹǷ� ������ ����
		Stream.generate(() -> "��ο�").limit(10).forEach(s -> System.out.println(s));

	}

}
