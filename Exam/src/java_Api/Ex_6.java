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
		// 1.String ������ ���� Ʈ���� ��ü�� ����ÿ�.
		TreeSet<Name> names= new TreeSet<>();
		
		// ��ü �߰�
		names.add(new Name("Daniel"));
		names.add(new Name("Betty"));
		names.add(new Name("Evelyn"));
		names.add(new Name("John"));
		names.add(new Name("Lucy"));
		
		// ���� ���
		System.out.printf("names.size() -> %d%n", names.size()); // 2.ũ�⸦ ���Ͻÿ�.
		System.out.printf("names.first() -> %d%n", names.first()); // 3.ù ��Ҹ� ���Ͻÿ�.
		System.out.printf("names.last() -> %d%n", names.last()); // 4.�� ��Ҹ� ���Ͻÿ�.
		
		// set�� ��� ��� ���
//		System.out.println("=="); // for each ���� ���
//		for(String str : names) {
//			System.out.println(str);
//		}
	}

}
