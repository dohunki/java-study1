
public class Ex9_3 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		Integer int1= new Integer("100");
		Integer int2= new Integer("100");
		
		Person1 person1= new Person1(10);
		Person1 person2= new Person1(10);
		

		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// StringŬ������ ���ڿ��� ������ ������, ������ �ؽ��ڵ带 ��ȯ�ϵ��� hashCode�޼��尡
		// �������̵��Ǿ� �ִ�.
		
		System.out.println("==============");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println("==============");
		
		System.out.println(person1.equals(person2));
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
	}
}

class Person1 {
	int person;
	
	Person1(int person) {
		this.person= person;
	}
}