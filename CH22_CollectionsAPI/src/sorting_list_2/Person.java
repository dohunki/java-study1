package sorting_list_2;
// 정렬하기 위해 Comparable 비교가능한 인터페이스
public class Person implements Comparable<Person>{
	private String name; // name을 기준으로 잡는다.
	
	public Person(String name) {
		this.name= name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		// 객체끼리 비교해서 누가 큰지 코드 작성
		return name.compareTo(o.name);
		// 문자열끼리 비교하는 메서드 compareTo 사용하여 이름으로 비교
	}

}
