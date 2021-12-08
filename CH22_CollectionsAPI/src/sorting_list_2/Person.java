package sorting_list_2;
// �����ϱ� ���� Comparable �񱳰����� �������̽�
public class Person implements Comparable<Person>{
	private String name; // name�� �������� ��´�.
	
	public Person(String name) {
		this.name= name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		// ��ü���� ���ؼ� ���� ū�� �ڵ� �ۼ�
		return name.compareTo(o.name);
		// ���ڿ����� ���ϴ� �޼��� compareTo ����Ͽ� �̸����� ��
	}

}
