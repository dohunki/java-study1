package hashmap_12;

import java.util.HashMap;
import java.util.Map;

public class Interating_Map {

	public static void main(String[] args) {
		// �� Ÿ���� �ݺ��� ���
		HashMap<String, String> months= new HashMap<>();
		months.put("JAN", "1��");
		months.put("FEB", "2��");
		months.put("MAR", "3��");
		months.put("APR", "4��");
		months.put("MAY", "5��");
		months.put("JUN", "6��");
		
		// ���ٽ����� ���
		months.forEach((k, v) -> System.out.println(k+ " : "+ v));
		
		System.out.println();
		
		// entrySet() : key���� value���� ��� ������(���)
		for(var entry : months.entrySet()) { // JDK10verson���� var Ű���� ���
			String k= entry.getKey();
			String v= entry.getValue();
			System.out.println(k+ " : "+ v);
		}
		
		System.out.println();
		
		for(Map.Entry<String, String> entry : months.entrySet()) { // ���� �������� ���
			var k= entry.getKey();
			var v= entry.getValue();
			System.out.println(k+ " : "+ v);
		}
		
		System.out.println();
		
		// keySet() : key���� ������(���)
		for(String key : months.keySet()) {
			String v= months.get(key);
			System.out.println(key+ " : "+ v);	
		}

	}

}
