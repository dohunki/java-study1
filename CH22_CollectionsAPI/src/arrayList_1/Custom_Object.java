package arrayList_1;

import java.util.ArrayList;

public class Custom_Object {

	public static void main(String[] args) {
		// PersonŬ���� Ÿ�� ArrayList
		ArrayList<Person> people= new ArrayList<>();
		// 1.��ü�� ������ �� �Է�
		Person p1;
		p1= new Person("���");
		Person p2= new Person("�浿");		
		people.add(p1);
		people.add(p2);
		
		// 2. ��ü������ ���ÿ� �Է�
		people.add(new Person("���̾�"));
		people.add(new Person("�Ѹ�"));
		
		people.forEach(System.out::println);

	}

}
