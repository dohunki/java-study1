package hashmap_12;

import java.util.HashMap;
import java.util.Map;

public class Interating_Map {

	public static void main(String[] args) {
		// 맵 타입을 반복문 출력
		HashMap<String, String> months= new HashMap<>();
		months.put("JAN", "1월");
		months.put("FEB", "2월");
		months.put("MAR", "3월");
		months.put("APR", "4월");
		months.put("MAY", "5월");
		months.put("JUN", "6월");
		
		// 람다식으로 출력
		months.forEach((k, v) -> System.out.println(k+ " : "+ v));
		
		System.out.println();
		
		// entrySet() : key값과 value값을 모두 가져옴(출력)
		for(var entry : months.entrySet()) { // JDK10verson부터 var 키워드 사용
			String k= entry.getKey();
			String v= entry.getValue();
			System.out.println(k+ " : "+ v);
		}
		
		System.out.println();
		
		for(Map.Entry<String, String> entry : months.entrySet()) { // 예전 버전에서 사용
			var k= entry.getKey();
			var v= entry.getValue();
			System.out.println(k+ " : "+ v);
		}
		
		System.out.println();
		
		// keySet() : key값만 가져옴(출력)
		for(String key : months.keySet()) {
			String v= months.get(key);
			System.out.println(key+ " : "+ v);	
		}

	}

}
