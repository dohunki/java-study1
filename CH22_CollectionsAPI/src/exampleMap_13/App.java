package exampleMap_13;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

//class Person {
class Person implements Comparable<Person>{ // TreeMap���� �������̽� ���
	// Person�� �̸����� equals�޼��带 ����� key���� �ߺ��� ����
	private String name;
	
	public Person(String name) {
		this.name= name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}
	
	@Override // TreeMap���� ���
	public int compareTo(Person o) {
		return name.compareTo(o.name);
	} // �̸����� ��
	
}

public class App {

	public static void main(String[] args) {
		// ���� ����� ����
		HashMap<Person, Boolean> people1= new HashMap<>();
		LinkedHashMap<Person, Boolean> people2= new LinkedHashMap<>();
		TreeMap<Person, Boolean> people3= new TreeMap<>();
		
		// �ʿ��� Ű������ �ߺ��� �����ϴµ� PersonŬ�������� equals�޼��带 ����� �̸��� ������ �ߺ��� �ǰ� ����
		inputMap(people1);
		displayMap(people1);
		
		System.out.println();
		
		inputMap(people2);
		displayMap(people2);
		
		System.out.println();
		
		// Ʈ������ �����ϴµ� �̶� Ű���� PersonŬ�������� Comparable �������̽��� �����ؾ� �Ѵ�.
		inputMap(people3);
		displayMap(people3);
	}
	
	private static void displayMap(Map<Person, Boolean> map) {
		map.forEach((k, v) -> System.out.println(k+ " : "+ v));
	}
	
	private static void inputMap(Map<Person, Boolean> map) {
		// �ʿ� person��ü�� boolean�� �Է�(���ݿ���)
		map.put(new Person("���"), true);
		map.put(new Person("�浿"), true);
		map.put(new Person("���̾�"), false);
		map.put(new Person("�Ѹ�"), false);
		map.put(new Person("���̾�"), false); // �Ȱ��� �̸��� �ߺ��Ұ�
		map.put(new Person("�Ѹ�"), true); // �Ѹ��� value�� true�� ���
	}

}
