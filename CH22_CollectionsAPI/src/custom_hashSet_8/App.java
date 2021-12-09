package custom_hashSet_8;

import java.util.HashSet;
import java.util.Objects;

class Creature {
	private int id;
	private String name;
	public Creature(int id, String name) {
		this.id= id;
		this.name= name;		
	}
	
	@Override
	public String toString() {
		return "Creature [id=" + id + ", name=" + name + "]";
	}
	// Source > Generate hashCode() and equals() ���� �񱳴�� �����Ͽ� �޼��� ����
//	// (1) id�� ������ ���� ��ü��, id�� �ٸ��� �ٸ� ��ü�� �ν��ϴ� �޼���� �ۼ�
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}

//	// (2) id�� name�� ��� ������ ���� ��ü��, �ٸ����� ������ �ٸ� ��ü�� �ν��ϴ� �޼���� �ۼ�
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}
public class App {
	public static void main(String[] args) {
		HashSet<Creature> creatures= new HashSet<>();
		
		creatures.add(new Creature(0,"�����"));
		creatures.add(new Creature(1,"��"));
		creatures.add(new Creature(2,"����"));
		creatures.add(new Creature(2,"����"));
		creatures.add(new Creature(3,"��"));
		creatures.add(new Creature(4,"��"));
		creatures.add(new Creature(4,"��ѱ�"));
		
		System.out.println(creatures.contains(new Creature(0, "�����")));
		
		creatures.forEach(System.out::println);
	}
}
