package java_Api;

import java.util.TreeSet;

class Name implements Comparable<Name> {
	private String names;
	public Name(String names) {
		this.names= names;
	}
	public String toString() {
		return names;
	}
	@Override
	public int compareTo(Name o) {
		return names.compareTo(o.names);
	}	
}

public class Ex_6 {
	public static void main(String[] args) {
		// 1.String 저장을 위한 트리셋 객체를 만드시오.
		TreeSet<Name> names= new TreeSet<>();
		
		// 객체 추가
		names.add(new Name("Daniel"));
		names.add(new Name("Betty"));
		names.add(new Name("Evelyn"));
		names.add(new Name("John"));
		names.add(new Name("Lucy"));
		
		// 정보 출력
		System.out.printf("names.size() -> %d%n", names.size()); // 2.크기를 구하시오.
		System.out.printf("names.first() -> %d%n", names.first()); // 3.첫 요소를 구하시오.
		System.out.printf("names.last() -> %d%n", names.last()); // 4.끝 요소를 구하시오.
		
		// set의 모든 요소 출력
//		System.out.println("=="); // for each 구문 출력
//		for(String str : names) {
//			System.out.println(str);
//		}
	}

}
