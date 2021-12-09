package hashSet_union_intersection_9;

import java.util.HashSet;

public class App { // 합집합과 교집합
	public static void main(String[] args) {
		HashSet<String> list1= new HashSet<>();
		
		list1.add("사과");
		list1.add("배");
		list1.add("딸기");
		list1.add("수박");
		
		HashSet<String> list2= new HashSet<>();
		
		list2.add("체리");
		list2.add("배");
		list2.add("사과");
		list2.add("오렌지");
		
		HashSet<String> union= new HashSet<>(list1); // 합집합, 처음 생성시 리스트1을 입력해 생성
		union.addAll(list2); // 리스크1 + 리스트2 (중복아이템은 한번 만, 나머지는 삭제)		
		union.forEach(System.out::println);
		
		System.out.println();
		
		HashSet<String> intersection= new HashSet<>(list1); // 교집합, 처음 생성시 리스트1을 입력해 생성
		intersection.retainAll(list2); // 리스트2에서 중복되는 것들만 남김		
		intersection.forEach(System.out::println);
		
		System.out.println();
		
		HashSet<String> minus= new HashSet<>(list1); // 차집합, 처음 생성시 리스트1을 입력해 생성
		minus.removeAll(list2); // 리스트1에서 리스트2와 중복되는 것들만 삭제		
		minus.forEach(System.out::println);
		
	}
}
