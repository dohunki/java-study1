package hashmap_12;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// �ؽø��� key��, value���� �Է��Ѵ�.
		HashMap<Integer, String> people= new HashMap<>();
		people.put(0, "���");
		people.put(1, "�浿");
		people.put(3, "���̾�");
		people.put(4, "������");
		people.put(4, "����Ŭ"); // key���� �ߺ��� �Ұ�. �Ȱ��� Ű���̸� �����
		people.put(10, "����");
		
		people.forEach((k, v) -> System.out.println(k+ " : " + v));
		
		System.out.println();
		
		System.out.println(people.get(4)); // Ű 4�� �ش��ϴ� value���� ������
		
		
		
	}
}
