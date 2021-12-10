package hashmap_12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {

	public static void main(String[] args) {
		// Map ����
		// HashMap, LinkedHashMap(�Է¼������), TreeMap(����)
		
		Map<Integer, String> months1= new LinkedHashMap<>();
		months1.put(1, "1��");
		months1.put(3, "3��");
		months1.put(6, "6��");		
		months1.forEach((k, v) -> System.out.println(k+ " : "+ v));
		
		System.out.println();
		
		Map<Integer, String> months2= new TreeMap<>(); // key���� �����Ͽ� ����
		months2.put(3, "3��");
		months2.put(6, "6��");
		months2.put(1, "1��");
		months2.forEach((k, v) -> System.out.println(k+ " : "+ v));

	}

}
