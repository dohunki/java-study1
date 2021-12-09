package hashset_7;

import java.util.HashSet;

public class App {
	public static void main(String[] args) {
		// 셋 타입은 중복이 안되고 순서도 없음(인덱스 없음)
		HashSet<String> fruits= new HashSet<>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		System.out.println(fruits.contains("오렌지"));
		System.out.println(fruits.contains("귤"));		
		// contains(A) : A가 있으면 true, 없으면 false
		
		for(String f : fruits) {
			System.out.println(f);
		}
	}
}
