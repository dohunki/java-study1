package tree_set_10;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	public Person(String name) {
		this.name= name;
	}
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name);
		// �̸��� ���ڿ��� ��(�̹� ���ڿ��� �񱳸޼��� compareTo�� �����Ǿ� ����
	}	
}

public class App {
	public static void main(String[] args) {
		// Ʈ������ ���� ��� �߰�
		
		// �񱳰����� ��ü�̾�� ���ĵȴ�. Comparable �������̽��� ������ Ŭ���� ��ü�� �Է��ؾ� �Ѵ�.
		TreeSet<Person> people= new TreeSet<>();
		people.add(new Person("���"));
		people.add(new Person("���̾�"));
		people.add(new Person("������"));
		people.add(new Person("������"));
		
		for(Person p : people)	{
			System.out.println(p);
		}
		
		System.out.println();
		
		TreeSet<Integer> list= new TreeSet<>();
		list.add(10);
		list.add(7);
		list.add(1);
		list.add(8);
		list.add(9);
		
		for(int i : list)	{
			System.out.println(i);
		}
	}
}
