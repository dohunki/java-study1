package stream_example_1;

import java.util.stream.IntStream;

public class Int_Stream {
	public static void main(String[] args) {
		// ������ ��Ʈ�� ����
		IntStream
			.range(1, 10) // 1���� (10-1)������ ����
			.skip(5)	  // 5���� ������ ��ŵ(�ѱ�)
			.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		int val= IntStream.range(1, 101).sum(); // 1~100���� ������ ��
		System.out.println(val);

	}

}
