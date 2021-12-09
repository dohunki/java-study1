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
	// Source > Generate hashCode() and equals() 에서 비교대상 선택하여 메서드 생성
//	// (1) id가 같으면 같은 객체로, id가 다르면 다른 객체를 인식하는 메서드로 작성
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}

//	// (2) id와 name이 모두 같으면 같은 객체로, 다른것이 있으면 다른 객체로 인식하는 메서드로 작성
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
		
		creatures.add(new Creature(0,"고양이"));
		creatures.add(new Creature(1,"개"));
		creatures.add(new Creature(2,"돼지"));
		creatures.add(new Creature(2,"돼지"));
		creatures.add(new Creature(3,"소"));
		creatures.add(new Creature(4,"말"));
		creatures.add(new Creature(4,"비둘기"));
		
		System.out.println(creatures.contains(new Creature(0, "고양이")));
		
		creatures.forEach(System.out::println);
	}
}
