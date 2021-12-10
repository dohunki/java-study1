package hashset_7;

import java.util.LinkedHashSet;

public class Linked_HashSet {
	public static void main(String[] args) {
		// 링크드해시셋은 중복이 안되고 입력된 순서대로 출력됨
		LinkedHashSet<String> fruits2= new LinkedHashSet<>();
		
		fruits2.add("사과");
		fruits2.add("바나나");
		fruits2.add("오렌지");
		fruits2.add("오렌지");
		fruits2.add("배");
		fruits2.add("사과");
		fruits2.add("사과");
		
		System.out.println(fruits2.contains("오렌지"));
		System.out.println(fruits2.contains("귤"));		
		// contains(A) : A가 있으면 true, 없으면 false
		
		for(String f2 : fruits2) {
			System.out.println(f2);
		}
	}

}
